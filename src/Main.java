import view.LoginView;
import model.Doctor;
import controller.LoginController;

public class Main {

    public static void main(String[] args) {
        Doctor doctorController = new Doctor();
        LoginView loginView = new LoginView();
        new LoginController(loginView, doctorController);
        loginView.setVisible(true);
    }
}
