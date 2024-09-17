package baxkEnde;
import java.util.HashMap;

public class validarDatos{

    public HashMap<String, String> validarDatos(String usuario, String contrasena) {
        HashMap<String, String> resultado = new HashMap<>();
        boolean usuarioValido = verificarUsuarioEnBaseDeDatos(usuario, contrasena);

        if (usuarioValido) {
            String infoDoctor = obtenerInformacionDelDoctor(usuario);
            resultado.put("Tipo", "Doctor");
            resultado.put("Informacion", infoDoctor);
        } else {
            resultado.put("Tipo", "Error");
            resultado.put("Mensaje", "Usuario o contraseña incorrectos");
        }

        return resultado;
    }

    private boolean verificarUsuarioEnBaseDeDatos(String usuario, String contrasena) {
        return true;
    }
    private String obtenerInformacionDelDoctor(String usuario) {
        return "Información del doctor";
    }
}
