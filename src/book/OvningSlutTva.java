package book;

import javax.swing.*;

/**
 * Skriv en program som visar tre dalogrutor:
 * - Info meddelande med texten i ramen.
 * - Varnings meddelande med varning text i ramen.
 * - Fel meddelande med fel text i ramen
 */
public class OvningSlutTva {
    public static void main(String[] arg){
        // Info meddlande i inforam
        JOptionPane.showMessageDialog(null, "Meddelande", "Info", JOptionPane.INFORMATION_MESSAGE);
        // Varning meddlande i varningram
        JOptionPane.showMessageDialog(null, "meddelande text", "Varning", JOptionPane.WARNING_MESSAGE);
        // Fel meddlande i felram
        JOptionPane.showMessageDialog(null, "Fel text", "Felt", JOptionPane.ERROR_MESSAGE);
    }
}