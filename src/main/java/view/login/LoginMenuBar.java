package view.login;

import view.admin.AdminFrame;
import javax.swing.*;

/**
 * Menu bar za prozor prijave s opcijama za administratorski panel i izlaz.
 */
public class LoginMenuBar extends JMenuBar {

    /**
     * Konstruktor koji kreira menu bar za prozor prijave.
     * 
     * @param frame glavni prozor s kojim je menu bar povezan
     */
    public LoginMenuBar(JFrame frame) { // pass the frame so we can switch panels
        JMenu fileMenu = new JMenu("File");

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));

        // Admin Panel option
        JMenuItem adminItem = new JMenuItem("Admin Panel");
        adminItem.addActionListener(e -> {
            frame.dispose(); // Close the current frame
            new AdminFrame().setVisible(true); // Open the AdminFrame
        });
        fileMenu.add(adminItem);
        fileMenu.add(exitItem);

        add(fileMenu);
    }
}
