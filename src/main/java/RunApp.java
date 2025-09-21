import com.formdev.flatlaf.FlatIntelliJLaf;
import view.login.LoginFrame;
import view.restaurant.ReservationFrame;

import javax.swing.*;

/**
 * Glavna klasa aplikacije za sustav rezervacije restorana.
 * Postavlja Look and Feel i pokreće početni prozor za prijavu.
 */
public class RunApp {
    /**
     * Glavna metoda koja pokreće aplikaciju.
     * Postavlja FlatLaf Look and Feel i otvara prozor za prijavu.
     * 
     * @param args argumenti naredbene linije (nisu korišteni)
     * @throws UnsupportedLookAndFeelException ako FlatLaf tema nije podržana
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
        });
    }
}
