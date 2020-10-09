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

package AUppgift;

import javax.swing.*;

/**
 * Instruktioner
 *
 * Skapa ett program som beräknar en persons statliga inkomstskatt.
 * Läs in årsinkomsten i programmet och beräkna skatten.
 * För att underlätta beräkningen, använd det lägsta grundavdraget (13 400 kr).
 * OBS! Om årsinkomsten är mindre än den nedre skiktgränsen
 * så behöver man inte betala statlig inkomstskatt.
 *
 * Användaren ska kunna beräkna statlig inkomstskatt för flera personer (årsinkomster)
 * utan att behöva starta om programmet.
 * Det innebär att programmet ska fråga användaren om den vill utföra ytterligare
 * en skatteberäkning när en skatteberäkning har utförts och redovisats för användaren.
 */
public class Auppgift {
    public static void main(String[] args) {
        // Variablern
        String
                arsinkomstInput = "Skriv in bruts årsinkomst:",
                NoNumber = "Det är bara tillåtna siffor!\n",
                InputNull = "Rad får inte vara tumt!\n",
                skattInput = "Vilket procent är du plikt att betala in din kommun?",
                skatteProcent = "Det är bara tillåtna heltal mellan 29 och 35.\n",
                title = "Beräknar persons statliga inkomstskatt";
        float
                arsinkomst,
                skatt;
        int
                lGrundavdrag = 13400;// lägsta grundavdraget (13 400 kr).
        String
                meddelande;
        int fler = 0;
        while(fler == 0){
            // Årsinkomst
            meddelande = arsinkomstInput;
            while (true) {
                try {
                    arsinkomst = Float.parseFloat(
                            JOptionPane.showInputDialog(null,
                                    meddelande, title, JOptionPane.INFORMATION_MESSAGE)
                    );
                    break; // om inga undantag bryts loop
                } // validering med anpasan meddelande.
                catch (NumberFormatException e) {
                    if(e.getMessage().equals("empty String")){
                        meddelande =  InputNull + arsinkomstInput;
                    } else {
                        System.out.print(e.getMessage());
                        meddelande = "Du skrev: " + e.getMessage().substring(e.getMessage().lastIndexOf(" ")+1) + "\n" + NoNumber + arsinkomstInput;
                    }
                }
            }
            if(lGrundavdrag > arsinkomst){
                // Dialogruta under det lägsta grundavdraget (13 400 kr).
                JOptionPane.showMessageDialog(null,
                        "Du ligger under den lägsta grundavdraget (13 400 kr).\n" +
                                "Du ska inte betala någon skatt.");
            } else {
                // Skatt
                meddelande = skattInput;
                while (true) {
                    try {
                        skatt = Float.parseFloat(
                                JOptionPane.showInputDialog(null,
                                        meddelande, title, JOptionPane.INFORMATION_MESSAGE)
                        );
                        break; // om inga undantag bryts loop
                        // validering med anpasan meddelande.// validering med anpasan meddelande.
                    } catch (NumberFormatException e) {
                        if(e.getMessage().equals("empty String")){
                            meddelande =  InputNull + skattInput;
                        } else {
                            System.out.print(e.getMessage());
                            meddelande = "Du skrev: " + e.getMessage().substring(e.getMessage().lastIndexOf(" ")+1) + "\n" + skatteProcent + skattInput;
                        }
                    }
                }
                // Beräkning
                float attBetala = arsinkomst * skatt / 100;

                // Dialog ruta summa att betala
                JOptionPane.showMessageDialog(null,
                        "Du får betala: " + (int)attBetala + " kr.",
                        title, JOptionPane.INFORMATION_MESSAGE);
            }

            // Fråga om beräkna igen
            // Messadedialog
            int igen = JOptionPane.showConfirmDialog (null, "Önskar du beräkna igen?",
                    title, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(igen == JOptionPane.YES_OPTION) {
                fler = 0;
                System.out.print(igen);
            } else {
                fler = 1;
                System.out.print(igen);
            }
        }

    }
}
