package estruct.visual;
import javax.swing.*;

public class login extends JFrame {

    private JPanel loginPanel;


    public login() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            login l = new login();
            l.setContentPane(l.loginPanel);
            l.setVisible(true);
        });


    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}