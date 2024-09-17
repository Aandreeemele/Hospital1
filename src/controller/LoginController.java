package controller;

import model.Doctor;
import view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginController {

    private LoginView loginView;
    private Doctor doctorController;

    public LoginController(LoginView loginView, Doctor doctorController) {
        this.loginView = loginView;
        this.doctorController = doctorController;

        this.loginView.setLoginActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String usuario = loginView.getUsuario();
        String contrasena = loginView.getContrasena();
        HashMap<String, String> resultado = doctorController.validarDatos(usuario, contrasena);
        if ("success".equals(resultado.get("status"))) {
            System.out.println("Inicio de sesión correcto");
            System.out.println("Nombre: " + resultado.get("nombre"));
            System.out.println("Especialidad: " + resultado.get("especialidad"));
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}
