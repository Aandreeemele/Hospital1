package model;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private List<DoctorGeneral> data;

    public Doctor() {
        data = new ArrayList<>();
        data.add(new DoctorGeneral("Dr. André Meléndez", "andre.melendez@hospital.com", "Doctor General", "555-0001", "Andre", "12345"));
        data.add(new DoctorGeneral("Dra. Ana Gómez", "ana.gomez@hospital.com", "Dermatología", "555-0002", "anagomez", "contraseña456"));
        data.add(new DoctorGeneral("Dr. Luis Fernández", "luis.fernandez@hospital.com", "Pediatría", "555-0003", "luisfernandez", "contraseña789"));
        data.add(new DoctorGeneral("Dr. Angel Lopez", "angel.lopez@hospital.com", "Pediatría", "555-7703", "angel", "contraseña247"));
        data.add(new DoctorGeneral("Dr. Samuel Ajcu", "samuel.ajcu@hospital.com", "Pediatría", "555-0363", "samuel", "contraseña369"));
    }

    public DoctorGeneral validateLogin(String username, String password) {
        for (DoctorGeneral doctor : data) {
            if (doctor.getUsername().equals(username) && doctor.getPassword().equals(password)) {
                return doctor;
            }
        }
        return null;
    }
}
