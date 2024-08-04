import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    
    public Login() {
        // Configuración de la ventana
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Componentes
        userField = new JTextField(15);
        passField = new JPasswordField(15);
        loginButton = new JButton("Iniciar Sesión");
        
        // Panel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuario:"));
        panel.add(userField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passField);
        panel.add(loginButton);
        
        add(panel);
        
        // Acción del botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());
                if (validarCredenciales(user, pass)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + user);
                    // Abrir ventana principal
                    new MainFrame().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private boolean validarCredenciales(String user, String pass) {
        // Aquí se valida el usuario y contraseña, es un ejemplo básico
        return user.equals("admin") && pass.equals("admin");
    }
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
