package view.admin.manager;

import view.admin.AdminFrame;
import javax.swing.*;

/**
 * Menu bar za prozor upravljanja restoranima s opcijama za upravljanje korisnicima.
 */
public class ManagerMenuBar extends JMenuBar {

    /**
     * Konstruktor koji kreira menu bar za prozor upravljanja restoranima.
     * 
     * @param frame glavni prozor s kojim je menu bar povezan
     */
    public ManagerMenuBar(JFrame frame) {
        JMenu managerMenu = new JMenu("Manager");

        JMenuItem userManagerItem = new JMenuItem("User Manager");
        userManagerItem.addActionListener(e -> {
            frame.dispose();
            new AdminFrame().setVisible(true);
        });
        managerMenu.add(userManagerItem);

        add(managerMenu);
    }
}