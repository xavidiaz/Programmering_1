package book;

import javax.swing.*;
import java.awt.*;

/**
 * Använda klass Toolkit med metoder (getDefaultToolkit och beep) för att låta programmet ge ifrån sig ljud.
 * Utöka programmet OvingEttSex med ljud addering after tryka 'ok'.
 */
public class OvningEttSju {
    public static void main(String[] arg){
        JOptionPane.showMessageDialog(null, "Namn");
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null, "Telefon");
    }
}
