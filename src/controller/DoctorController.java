package controller;

import model.DoctorGeneral;
import java.util.ArrayList;
import java.util.List;

public class DoctorController {
    private List<DoctorGeneral> data;

    public DoctorController() {
        data = new ArrayList<>();
        data.add(new DoctorGeneral("Dr. André Meléndez", "andre.melendez@hospital.com", "DoctorGeneral", "555-0001", "Andre", "12345"));
        data.add(new DoctorGeneral("Dra. Ana Gómez", "ana.gomez@hospital.com", "Dermatología", "555-0002", "anagomez", "contraseña456"));
        data.add(new DoctorGeneral("Dr. Carlos Pérez", "carlos.perez@hospital.com", "Cardiología", "555-0003", "carlosperez", "pass789"));
        data.add(new DoctorGeneral("Dra. María Martínez", "maria.martinez@hospital.com", "Neurología", "555-0004", "mariam", "neurologia123"));
        data.add(new DoctorGeneral("Dr. Luis Fernández", "luis.fernandez@hospital.com", "Pediatría", "555-0005", "luisfer", "pediatra567"));
        data.add(new DoctorGeneral("Dra. Gabriela Sánchez", "gabriela.sanchez@hospital.com", "Ginecología", "555-0006", "gaby", "gineco8910"));
        data.add(new DoctorGeneral("Dr. Francisco Ruiz", "francisco.ruiz@hospital.com", "Urología", "555-0007", "franruiz", "uro456"));
        data.add(new DoctorGeneral("Dra. Laura Castillo", "laura.castillo@hospital.com", "Oncología", "555-0008", "laurac", "onco321"));
        data.add(new DoctorGeneral("Dr. Javier Morales", "javier.morales@hospital.com", "Traumatología", "555-0009", "javmor", "trauma654"));
        data.add(new DoctorGeneral("Dra. Patricia Torres", "patricia.torres@hospital.com", "Psiquiatría", "555-0010", "paty", "psiquiatra123"));
    }

    public DoctorGeneral validateLogin(String username, String password) {
        for (DoctorGeneral doctor : data) {
            if (doctor.getUsername().equals(username) && doctor.getPassword().equals(password)) {
                return doctor;
            }
        }
        return null;
    }

    public List<DoctorGeneral> getDoctors() {
        return data;
    }
}
