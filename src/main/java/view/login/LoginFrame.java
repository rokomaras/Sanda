package view.login;

import javax.swing.*;

/**
 * Prozor za prijavu korisnika u sustav.
 * Omogućuje korisnicima unos korisničkih podataka za autentifikaciju.
 */
public class LoginFrame extends JFrame {

    /**
     * Konstruktor koji kreira i konfigurira prozor za prijavu.
     * Postavlja naslov, veličinu, menu bar i dodaje panel za prijavu.
     */
    public LoginFrame() {
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setJMenuBar(new LoginMenuBar(this));

        add(new LoginPanel());

        setVisible(true);
    }
}
