package book;

import javax.swing.*;

/**
 Skriv program som innehåller fyra String-variable:
 * - Namn
 * - Adress
 * - Telefonnummer
 * - Namn, adress och telefonnummer tilldelas med \n.
 */
public class OvningTvaEtt {
    public static void main (String[] arg){
        // declare variables
        String namn, adress, telefonummer, sammansatta;
        // instate variables
        namn = System.getProperty("user.name");
        adress = "Gatugatan, 16";
        telefonummer = "076 123 4567";
        // variabel tilldelning
        sammansatta = namn + "\n" +adress + "\n" +telefonummer;
        // widow message
        JOptionPane.showMessageDialog(null, sammansatta);
    }
}
