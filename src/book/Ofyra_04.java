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
 * I Postens anvisningar finns följande föreskrifter för hur stora och små
 * vanliga brev får vara:
 * - Maximalmått: länge 600mm, Tjocklek 10mm, Bredd + längd + tjocklek högst 900 mm.
 * - Minimalmått: Längd 140mm , bredd 90mm.
 * Skriv en program som läser in ett brevs längd, bred och tjocklek och som
 * undersöker om brevet har tillåta mått eller inte. Programmet skall visa en
 * dialogruta med texten "Måtten OK eller Fellaktiga mått".
 */
public class Ofyra_04 {
    public static void main(String[] arg){
        // Variabler
        int maxlang = 6000,
                maxTjock = 10,
                maxTotal = 900,
                maxBredd = maxTotal,
                minLang = 140,
                minBredd = 90,
                iBredd,
                iLangd,
                iTjock,
                iTotal;
        String title = "Beräkning brevs storlek",
                meddelande;

        // Inputruta
        iBredd = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bred?",
                title, JOptionPane.INFORMATION_MESSAGE));
        while(minBredd > iBredd || iBredd > maxBredd){
            JOptionPane.showMessageDialog(null,
                    "Fellaktiga mått.\nTillåta lang är mellan" + minBredd + " och "+ maxBredd + "",
                    title, JOptionPane.INFORMATION_MESSAGE);
        iBredd = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bred?",
                title, JOptionPane.INFORMATION_MESSAGE));
        }
        iLangd = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Längd?",
                title, JOptionPane.INFORMATION_MESSAGE));
        while(minLang > iLangd || iLangd > maxlang){
            JOptionPane.showMessageDialog(null,
                    "Fellaktiga mått.\nTillåta lang är mellan" + minLang + " och "+ maxlang + "",
                    title, JOptionPane.INFORMATION_MESSAGE);
            iLangd = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Längd?",
                    title, JOptionPane.INFORMATION_MESSAGE));
        }
        iTjock = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Tjocklek?",
                title, JOptionPane.INFORMATION_MESSAGE));
        while(iTjock > maxTjock){
            JOptionPane.showMessageDialog(null,
                    "Fellaktiga mått.\n Maximal Tjocklek är " + maxTjock + "",
                    title, JOptionPane.INFORMATION_MESSAGE);
            iTjock = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Tjocklek?",
                    title, JOptionPane.INFORMATION_MESSAGE));
        }
        // Metod
        iTotal = iBredd + iLangd + iTjock;
        int Skyllnad = iTotal - maxTotal;
        if (iTotal > maxTotal) {
            meddelande = "Fellaktiga mått.\nBrev är över maximal\n" + Skyllnad + "mm.";
        } else if (iTotal > maxTotal) {
            meddelande = "Måtten OK.";
        } else {
            meddelande = "Fellaktiga mått.\nBrev är under minimal\n" + Skyllnad + "mm.";
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                meddelande,
                title, JOptionPane.INFORMATION_MESSAGE);
        }
}
