import controller.LoginController;
import model.Doctor;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        Doctor doctorController = new Doctor();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView, doctorController);
        loginView.setVisible(true);
    }
}
