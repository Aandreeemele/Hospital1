package controller;

import model.Doctor;
import model.DoctorGeneral;
import view.DoctorView;
import view.LoginView;

import javax.swing.*;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;
    private Doctor doctorController;

    public LoginController(LoginView loginView, Doctor doctorController) {
        this.loginView = loginView;
        this.doctorController = doctorController;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {
        String email = loginView.getEmail();
        String password = loginView.getPassword();
        DoctorGeneral loggedInDoctor = doctorController.validateLogin(email, password);

        if (loggedInDoctor != null) {
            HashMap<String, String> doctorData = new HashMap<>();
            doctorData.put("nombre", loggedInDoctor.getName());
            doctorData.put("especialidad", loggedInDoctor.getSpecialty());

            DoctorView doctorView = new DoctorView(doctorData);
            doctorView.setVisible(true);

            loginView.dispose();
        } else {
            JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas");
        }
    }
}
