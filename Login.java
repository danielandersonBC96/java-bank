import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JLabel label1, getLabel2, getLabel3;
    JTextField textFieldCard;
    JPasswordField passwordField;

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

        // Botões Login e Cancelar
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(325, 310, 100, 30);
        loginBtn.setBackground(new Color(0, 128, 255));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        background.add(loginBtn);

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(455, 310, 100, 30);
        cancelBtn.setBackground(new Color(255, 0, 0));
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setFocusPainted(false);
        background.add(cancelBtn);

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

    public static void main(String[] args) {
        new Login();
    }
}
