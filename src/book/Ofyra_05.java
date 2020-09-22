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
 * Antag att det kostar 2,50 kr/min att ringa med en mobiltelefon med kontantkort
 * under kvallTid. På kvällar och helgen är kostnaden 0,55 kr/min.
 * Öppningsavgiften är alltid 0,60kr per samtal. Skriv ett program som beräknar
 * kostnaden för ett telefonsamtal. Programmet skall först från en
 * dialogruta läsa in antalet minuter samtallet pågår. Sedan skall det fråga
 * användaren om samtalet äger rum under kvallTid? Slutligen skall den totala kostnaden
 * för samtalet (inklusive öppningsavgift) visas i en dialogruta.
 */
public class Ofyra_05 {
    public static void main(String[] arg){
        // variabler
        double
                krMinDag = 2.5, // kvallTid
                krMin = 0.55, // andraTid
                avgift = 0.6,
                subTotalt,
                momms = 1.25,
                iMin;
        int
                totalt;
        String title = "Telefonsamtal kostnaden";
        int kvallTid;
        // Inputruta
        iMin = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "Antal mituner?",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        kvallTid = JOptionPane.showConfirmDialog(null,
                "Samtalet är under dagstid?",
                title, JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);



        // metod
        System.out.print(kvallTid);
        if(kvallTid == 1){
            subTotalt = avgift + (krMin * iMin);
        } else {
            subTotalt = avgift + (krMinDag * iMin);
        }
        totalt = (int) (subTotalt * momms);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "totala kostnaden för samtalet blev: " + totalt + "kr.",
                title, JOptionPane.INFORMATION_MESSAGE);
}
}
