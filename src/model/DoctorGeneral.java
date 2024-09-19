package model;

public class DoctorGeneral {
    private String name;
    private String email;
    private String specialty;
    private String phone;
    private String username;
    private String password;

    public DoctorGeneral(String name, String email, String specialty, String phone, String username, String password) {
        this.name = name;
        this.email = email;
        this.specialty = specialty;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
