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
 * Skriv ett program som läser antalet telefonsamtal minuter man igenomsnitt ringer per månad
 * samt kostnaden per minut. Som resultat skall det visa en dialogruta där det anges
 * hur stor den beräknade kostnade per månad blir.
 */
public class Otre_04 {
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
        // Output dialog
        JOptionPane.showMessageDialog(null,
                "Pris per månad: " + pManad + " kr.",
                "Telefon räknare",
                JOptionPane.INFORMATION_MESSAGE);
}
}
