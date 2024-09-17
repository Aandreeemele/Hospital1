package model;

import java.util.HashMap;
import java.util.List;

public class DoctorController {
    private Doctor doctor;

    public DoctorController() {
        doctor = new Doctor();
    }

    public HashMap<String, String> validarDatos(String usuario, String contrasena) {
        HashMap<String, String> respuesta = new HashMap<>();

        for (DoctorGeneral doc : doctor()) {
            if (doc.getUsuario().equals(usuario) && doc.getContrasena().equals(contrasena)) {
                respuesta.put("Nombre", doc.getNombre());
                respuesta.put("Correo", doc.getNombre());
                respuesta.put("Especialidad", doc.getEspecialidad());
                respuesta.put("Teléfono", doc.getNombre());
                return respuesta;
            }
        }

        respuesta.put("Error", "INCORRECTO");
        return respuesta;
    }

    private DoctorGeneral[] doctor() {
        return new DoctorGeneral[0];
    }
}
