package book;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Visa ett dialogruta med två rader.
 *  - text: Datum och tid.
 *  - visa närvarande: Datum och tid
 */
public class OvningEttSlut {
    public static void main(String[] arg){
        // format datum utseende.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/dd hh:mm:ss");
        String date = sdf.format(new Date());

        JOptionPane.showMessageDialog(null, "Datum - Tid\n"+ date);
    }
}
