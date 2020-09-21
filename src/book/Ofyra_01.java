/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org>
 *
 */

package book;

import javax.swing.*;

/**
 * I övning 3.4 skrev du ett program som beräknar kostnaden för
 * att ringa med mobiltelefon. Antag nu att amn får 10% rabatt om man
 * ringger för minst 10000 kr. Lägg till några rader i programmet så
 * att det tar hänsyn till detta då det beräknar det totala priset.
 */
public class Ofyra_01 {
    public static void main(String[] arg){
        // variables
        String iMinuter, iPris;
        // Input dialog
        iMinuter = JOptionPane.showInputDialog(null,
                "Antal minuter per månad?",
                "Telefon räknare",
                JOptionPane.INFORMATION_MESSAGE);
        iPris = JOptionPane.showInputDialog(null,
                "Pris per minute?",
                "Telefon räknare",
                JOptionPane.INFORMATION_MESSAGE);
        // calculation
        // values
        float minuter, pris, pManad;
        minuter = Float.parseFloat(iMinuter);
        pris = Float.parseFloat(iPris);
        pManad = minuter * pris;
        // rabatt
        String  rabatt = "";
        if(pManad > 999){
            pManad *= .90;
            rabatt = "\nEfter 10000 får man 10% rabatt";
        }
        // Output dialog
        JOptionPane.showMessageDialog(null,
                "Pris per månad: " + pManad + " kr."
                + rabatt,
                "Telefon räknare",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
