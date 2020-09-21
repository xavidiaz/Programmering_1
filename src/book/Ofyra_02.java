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
 * På ett gym kan man antingen köpa ett årskort eller köpa biljett vid varje
 * besök. Skriv ett program som läser in priset för ett årskort, priset för en
 * biljett samt antalet gånger man planera att besöka gymmet under ett år.
 * Där efter skall programmet ange om det lönar sig att köpa årskort eller inte.
 */
public class Ofyra_02 {
    public static void main(String[] arg){
        // variabler
        Integer dVecka,
                dKort = 150,  // dagaspris
                aKort = 8500, // Årpris
                aVeckor = 52, // nummer veckor per år.
                akostnad = 0;
        // Fråga om hur många dagar per vecka skall deltas i gymet
        dVecka = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Hur många dagar\nfundera du att vara med\ni gymet per vecka?",
                "Beräkning årsgymskostnaden",
                JOptionPane.INFORMATION_MESSAGE));
        // metod
        String spara = null;
        akostnad = dVecka * aVeckor * dKort;
        if(akostnad > aKort){
            int skyllnad = akostnad - aKort;
            spara = "\n\nOm du köper årskort\n" + aKort + "kr.\nkommer du att spara\n<html><b>" + skyllnad + "kr.</b></html>";
        }
        // dialogruta
        JOptionPane.showMessageDialog(null,
                "Årspris blir:\n" + akostnad + "Kr." + spara + "");
        System.out.print(akostnad);
    }
}
