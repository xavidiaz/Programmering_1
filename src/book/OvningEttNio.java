package book;

import javax.swing.*;

/**
 * Visa en dialogruta med ditt namn, adress och telefon i tre skylda rader.
 */
public class OvningEttNio {
    public static void main(String[] arg){
        JOptionPane.showMessageDialog(null, System.getProperty("user.name")+".\n adress \ntelefon");
    }
}
