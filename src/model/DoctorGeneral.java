package model;

public class DoctorGeneral {

    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;
    private String usuario;
    private String contrasena;

    public DoctorGeneral(String nombre, String email, String especialidad, String telefono, String usuario, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
