import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    SignUp() {
        super("Application form");

        // Ícone do banco
        ImageIcon bankIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bankImage = bankIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(bankImage));
        logo.setBounds(25, 10, 100, 100);

        // Painel de fundo
        JPanel background = new JPanel();
        background.setLayout(null);
        background.setBackground(new Color(222, 255, 228));
        background.setBounds(0, 0, 850, 800);
        background.add(logo);

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
