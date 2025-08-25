import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1, getLabel2, getLabel3;
    JTextField textFieldCard;
    JPasswordField passwordField;
    JButton button1, button2, button3; // login, cancel, signup

    public Login() {
        // Fundo
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image bgImage = bgIcon.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(bgImage));
        background.setBounds(0, 0, 850, 480);
        background.setLayout(null);

        // Logo banco
        ImageIcon bankIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bankImage = bankIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(bankImage));
        logo.setBounds(350, 10, 100, 100);
        background.add(logo);

        // Texto "WELCOME TO ATM"
        label1 = new JLabel("WELCOME TO ATM", SwingConstants.CENTER);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setBounds(250, 120, 300, 40);
        background.add(label1);

        // Label e TextField Card no
        getLabel2 = new JLabel("Card no:");
        getLabel2.setFont(new Font("Raleway", Font.BOLD, 28));
        getLabel2.setForeground(Color.WHITE);
        getLabel2.setBounds(150, 190, 150, 30);
        background.add(getLabel2);

        textFieldCard = new JTextField(15);
        textFieldCard.setBounds(325, 190, 230, 30);
        textFieldCard.setFont(new Font("Arial", Font.BOLD, 14));
        background.add(textFieldCard);

        // Label e PasswordField PIN
        getLabel3 = new JLabel("PIN:");
        getLabel3.setFont(new Font("Raleway", Font.BOLD, 28));
        getLabel3.setForeground(Color.WHITE);
        getLabel3.setBounds(190, 250, 150, 30);
        background.add(getLabel3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        background.add(passwordField);

        // Botão Login
        button1 = new JButton("Login");
        button1.setBounds(325, 310, 230, 30);
        button1.setBackground(new Color(0, 128, 255));
        button1.setForeground(Color.WHITE);
        button1.setFocusPainted(false);
        button1.addActionListener(this);
        background.add(button1);

        // Botão Cancel
        button2 = new JButton("Cancel");
        button2.setBounds(325, 355, 230, 30);
        button2.setBackground(new Color(255, 0, 0));
        button2.setForeground(Color.WHITE);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        background.add(button2);

        // Botão Signup (exemplo extra)
        button3 = new JButton("Sign Up");
        button3.setBounds(325, 400, 230, 30);
        button3.setBackground(new Color(0, 200, 0));
        button3.setForeground(Color.WHITE);
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        background.add(button3);

        // Ícone do cartão
        ImageIcon cardIcon = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image cardImage = cardIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel cardLabel = new JLabel(new ImageIcon(cardImage));
        cardLabel.setBounds(650, 350, 100, 100);
        background.add(cardLabel);

        // Adiciona background ao JFrame
        add(background);

        // Configurações da janela
        setTitle("Sistema de Banco");
        setSize(850, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                JOptionPane.showMessageDialog(this, "Login clicado!");
            } else if (e.getSource() == button2) {
                JOptionPane.showMessageDialog(this, "Cancel clicado!");
                System.exit(0);
            } else if (e.getSource() == button3) {
                JOptionPane.showMessageDialog(this, "Sign Up clicado!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
