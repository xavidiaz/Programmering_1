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
 * Ett postnummer består som du vet av fem siffror. Av dessa anger
 * de två första siffrorna vilket distrikt det är fråga om. Om de två
 * första siffrorna ligger i intervvalllet 20-62 eller om de är 65 eller 66
 * så ligger distriktet i Götaland. Är det två första siffrorna större än
 * eller lika med 80 så är det fråga om ett distrikt i Norland. Övriga
 * siffror betecknar distrikt i Svealand. Skriv ett program som läser
 * in ett postnummer och som visar om distriktet ligger i Götaland,
 * Svealand eller Norrland.
 */
public class OfyraSult_03 {
    public static void main(String[] arg){
        // deklarera variabler
        String
                title = "Götaland, Svealand eller Norrland",
                meddelande = "distriktet ligger i ",
                postord = null;
        int
                iSiffor,
                siffor;
        // Inputruta
        iSiffor = Integer.parseInt(
                (JOptionPane.showInputDialog(null,
                        "Skriv postord här:",
                        title, JOptionPane.INFORMATION_MESSAGE)).substring(0,2)
        );
        // metod
        if (20 < iSiffor && iSiffor < 62 || iSiffor == 65  || iSiffor == 66){
            postord = "Götaland";
        } else if(iSiffor >= 80) {
            postord = "Norland";
        } else {
            postord = "Svealand";
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                meddelande + postord,
                title, JOptionPane.INFORMATION_MESSAGE);

    }
}
