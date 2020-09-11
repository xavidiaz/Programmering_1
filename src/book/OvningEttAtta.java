package book;

import javax.swing.*;

/**
 * Visa en dialog ruta med text 'Du kör "Namn på OS" idag'
 */
public class OvningEttAtta {
    public static void main(String[] arg){
        JOptionPane.showMessageDialog(null, System.getProperty("os.name", "os.version"));
    }
}
