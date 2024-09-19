package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        // Configuración de la ventana
        this.setTitle("Login");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);  // Centrar la ventana

        // Componentes
        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setBounds(50, 50, 100, 30);
        this.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 50, 200, 30);
        this.add(emailField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 100, 100, 30);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        this.add(passwordField);

        loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(150, 150, 200, 30);
        this.add(loginButton);
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}
