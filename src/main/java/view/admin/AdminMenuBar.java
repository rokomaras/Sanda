package view.admin;

import view.admin.manager.ManagerFrame;
import view.login.LoginFrame;
import javax.swing.*;

/**
 * Menu bar za administratorski prozor s opcijama za upravljanje restoranima i povratak na prijavu.
 */
public class AdminMenuBar extends JMenuBar {

    /**
     * Konstruktor koji kreira menu bar za administratorski prozor.
     * 
     * @param frame glavni prozor s kojim je menu bar povezan
     */
    public AdminMenuBar(JFrame frame) {
        JMenu adminMenu = new JMenu("Admin");

        JMenuItem restaurantManagerItem = new JMenuItem("Restaurant Manager");
        restaurantManagerItem.addActionListener(e -> {
            frame.dispose();
            new ManagerFrame().setVisible(true);
        });
        adminMenu.add(restaurantManagerItem);

        JMenuItem goBackItem = new JMenuItem("Go to login form");
        goBackItem.addActionListener(e -> {
            frame.dispose();
            new LoginFrame().setVisible(true);
        });
        adminMenu.add(goBackItem);

        add(adminMenu);
    }
}