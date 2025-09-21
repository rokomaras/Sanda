package view.admin;

import javax.swing.*;

/**
 * Glavni administratorski prozor za upravljanje sustavom.
 * Omogućuje administratorima pristup funkcijama za upravljanje korisnicima i restoranima.
 */
public class AdminFrame extends JFrame {

    /**
     * Konstruktor koji kreira i konfigurira administratorski prozor.
     */
    public AdminFrame() {
        setTitle("Admin Panel");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setJMenuBar(new AdminMenuBar(this));

        add(new AdminPanel(this));

        setVisible(true);
    }
}