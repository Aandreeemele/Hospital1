package baxkEnde;

import java.util.HashMap;
import java.util.Map;

class BackEnd {
    private Map<String, String> doctoresDB;

    public BackEnd() {
        doctoresDB = new HashMap<>();
        doctoresDB.put("Andre", "12345");
        doctoresDB.put("anagomez", "contraseña456");
        doctoresDB.put("carlosperez", "pass789");
        doctoresDB.put("mariam", "neurologia123");
        doctoresDB.put("luisfer", "pediatra567");
        doctoresDB.put("gaby", "gineco8910");
        doctoresDB.put("franruiz", "uro456");
        doctoresDB.put("laurac", "onco321");
        doctoresDB.put("javmor", "trauma654");
        doctoresDB.put("paty", "psiquiatra123");
    }

    public Map<String, String> validarDatos(String usuario, String contraseña) {
        Map<String, String> resultado = new HashMap<>();

        if (doctoresDB.containsKey(usuario)) {
            if (doctoresDB.get(usuario).equals(contraseña)) {
                resultado.put("Estado", "Éxito");
                resultado.put("Mensaje", "Acceso permitido");
                resultado.put("Usuario", usuario);
            } else {
                resultado.put("Estado", "Error");
                resultado.put("Mensaje", "Contraseña incorrecta");
            }
        } else {
            resultado.put("Estado", "Error");
            resultado.put("Mensaje", "Usuario no encontrado");
        }

        return resultado;
    }

}

