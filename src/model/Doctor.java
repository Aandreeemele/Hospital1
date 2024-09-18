package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Doctor {

    private ArrayList<DoctorGeneral> data;

    public Doctor() {
        data = new ArrayList<>();

        data.add(new DoctorGeneral("Dr. André Meléndez", "andre.melendez@hospital.com", "DoctorGeneral", "555-0001", "Andre", "12345"));
        data.add(new DoctorGeneral("Dra. Ana Gómez", "ana.gomez@hospital.com", "Dermatología", "555-0002", "anagomez", "contraseña456"));
        data.add(new DoctorGeneral("Dr. Luis Fernández", "luis.fernandez@hospital.com", "Pediatría", "555-0003", "luisfernandez", "contraseña789"));
        data.add(new DoctorGeneral("Dr. Angel Lopez", "angel.lopez@hospital.com", "Pediatría", "555-7703", "angel", "contraseña247"));
        data.add(new DoctorGeneral("Dr. Samuel Ajcu", "samuel.ajcu@hospital.com", "Pediatría", "555-0363", "samuel", "contraseña369"));
    }

    public HashMap<String, String> validarDatos(String usuario, String contrasena) {
        HashMap<String, String> resultado = new HashMap<>();

        for (DoctorGeneral doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContrasena().equals(contrasena)) {
                resultado.put("status", "success");
                resultado.put("nombre", doctor.getNombre());
                resultado.put("especialidad", doctor.getEspecialidad());
                return resultado;
            }
        }

        resultado.put("status", "error");
        resultado.put("mensaje", "Usuario o contraseña incorrectos");
        return resultado;
    }

    public ArrayList<DoctorGeneral> getDoctores() {
        return data;
    }
}
