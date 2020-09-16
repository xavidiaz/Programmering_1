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
 * Skriv ett program som läser in en varas pris, inklusive moms. Programmet skall också till
 * en int variable läsa in momssatsen sm skall var ett helt antal procent.
 * Programmet skall beräkna dels varans pris exklusive moms och dels momsen.
 * De två resultaten skall visas i en dialogruta.
 */
public class Otre_05 {
    public static void main(String[] arg) {
        // variables
        String iPris;
        // Inputruta
        iPris = JOptionPane.showInputDialog(null,
                "Sriv in varan med moms",
                "Moms beräkning",
                JOptionPane.INFORMATION_MESSAGE);
        // calculation
            //variables
            float pris, fMoms, moms;
            pris = Float.parseFloat(iPris);
            fMoms = (float) (pris * 0.75);
            moms = (float) (pris * 0.25);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Belopp före moms: " + fMoms + "." +
                        "\nTotal moms: " + moms + ".",
                "Moms beräkning",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
