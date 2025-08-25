import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Date;
import javax.swing.SpinnerDateModel;

public class SignUp extends JFrame {


    JRadioButton r1,r2;

    JTextField textName, textFname;

    JSpinner dateSpinner;

    Random ran = new Random();

    // Gera número aleatório de 4 dígitos
    long first4 = (ran.nextLong() % 9000L) + 1000L;

    // Converte para string positiva
    String first = "" + Math.abs(first4);

    SignUp() {
        super("Application form");

        // Painel de fundo
        JPanel background = new JPanel();
        background.setLayout(null);
        background.setBackground(new Color(222, 255, 228));
        background.setBounds(0, 0, 850, 800);

        // Ícone do banco
        ImageIcon bankIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bankImage = bankIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(bankImage));
        logo.setBounds(25, 10, 100, 100);
        background.add(logo);

        // Texto principal com número do form
        JLabel label1 = new JLabel("Application form no: " + first);
        label1.setBounds(160, 20 , 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 28));
        background.add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        background.add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290,100,600,30);
        background.add(label3);

        JLabel labelN = new JLabel("Name");
        labelN.setFont(new Font("Raleway", Font.BOLD, 20));
        labelN.setBounds(100,190,150,30);
        background.add(labelN);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.PLAIN, 18));
        textName.setBounds(300,190,400,30);
        background.add(textName);

        JLabel labelFN = new JLabel("Father's Name");
        labelFN.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFN.setBounds(100,240,200,30);
        background.add(labelFN);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.PLAIN, 18));
        textFname.setBounds(300,240,400,30);
        background.add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,290,200,30);
        background.add(DOB);

        JLabel labellG = new JLabel("Gender");
        labellG.setFont( new Font("Raleway", Font.BOLD, 20));
        labellG.setBounds(100,390,200,30);
        add(labellG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD, 14));
        r1.setBounds(300,390,60,30);
        add(r1);

        r2 = new JRadioButton("Famele");
        r2.setFont(new Font("Ralway",Font.BOLD, 14));
        r2.setBounds(490,390,90,30);
        add(r2);


        // Campo de data usando JSpinner
        SpinnerDateModel dateModel = new SpinnerDateModel();
        dateSpinner = new JSpinner(dateModel);
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd/MM/yyyy");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setBounds(300,290,200,30);
        background.add(dateSpinner);

        // Adiciona painel ao frame
        add(background);

        setSize(850, 800);
        setLocation(360, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
