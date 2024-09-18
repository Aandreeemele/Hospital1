package view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView() {
        this.setTitle("Perfil del doctor");
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);

        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.YELLOW);
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        JLabel doctorName = new JLabel("Andre Meléndez");
        doctorName.setFont(new Font("Arial", Font.BOLD, 14));
        userPanel.add(doctorName, gbc);

        gbc.gridx = 2;
        JLabel doctorSpecialty = new JLabel("Doctor General");
        doctorSpecialty.setFont(new Font("Arial", Font.PLAIN, 14));
        userPanel.add(doctorSpecialty, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);
        this.add(headerPanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

}
