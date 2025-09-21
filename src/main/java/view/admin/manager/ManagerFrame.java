package view.admin.manager;

import javax.swing.*;

/**
 * Prozor za upravljanje restoranima u administratorskom sučelju.
 * Omogućuje administratorima dodavanje i upravljanje restoranima.
 */
public class ManagerFrame extends JFrame {

    /**
     * Konstruktor koji kreira i konfigurira prozor za upravljanje restoranima.
     */
    public ManagerFrame() {
        setTitle("Restaurant Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setJMenuBar(new ManagerMenuBar(this));

        add(new ManagerPanel(this));

        setVisible(true);
    }
}