package view.user;

import javax.swing.*;

/**
 * Glavni prozor za korisničko sučelje aplikacije.
 * Omogućuje korisnicima kreiranje novih rezervacija.
 */
public class UserFrame extends JFrame {

    /**
     * Konstruktor koji kreira i konfigurira glavni korisnički prozor.
     * Postavlja naslov, veličinu, menu bar i dodaje glavni panel.
     */
    public UserFrame() {
        setTitle("Make a Reservation - User");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setJMenuBar(new UserMenuBar(this));

        add(new UserPanel());

        setVisible(true);
    }
}