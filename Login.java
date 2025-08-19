import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {

        // Terceiro ícone (fundo)
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel background = new JLabel(iii3);
        background.setBounds(0, 0, 850, 480);
        background.setLayout(null); // permite usar setBounds dentro dele

        // Primeiro ícone
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image = new JLabel(ii3);
        image.setBounds(350, 10, 100, 100);
        background.add(image);

        // Texto logo abaixo da imagem
        JLabel label1 = new JLabel("WELCOME TO ATM", SwingConstants.CENTER);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setBounds(250, 120, 300, 40);
        // X = 250 → centraliza mais ou menos em relação à imagem
        // Y = 120 → logo abaixo da imagem (10 + 100 + 10 margem)
        background.add(label1);

        // Segundo ícone
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel iimage = new JLabel(i3);
        iimage.setBounds(650, 350, 100, 100);
        background.add(iimage);

        // Adiciona o fundo (com tudo dentro)
        add(background);

        // Configurações da janela
        setLayout(null);
        setTitle("Sistema de Banco");
        setSize(850, 480);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
