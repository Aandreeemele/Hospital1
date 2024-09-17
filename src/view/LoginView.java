package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
    private JButton btnLogin;

    public LoginView() {
        //Configuración del frame
        setTitle("Login");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        //Correo
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(150, 150, 80, 25);
        panel.add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(250, 150, 180, 25);
        panel.add(txtCorreo);

        //Contrasenna
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(150, 200, 80, 25);
        panel.add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(250, 200, 180, 25);
        panel.add(txtContrasena);

        //Iniciar Sesión
        btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBounds(250, 250, 180, 30);
        btnLogin.setBackground(Color.LIGHT_GRAY);
        panel.add(btnLogin);
    }

    public String getUsuario() {
        return txtCorreo.getText();
    }

    public String getContrasena() {
        return new String(txtContrasena.getPassword());
    }

    public void setLoginActionListener(ActionListener listener) {
        btnLogin.addActionListener(listener);
    }
}
