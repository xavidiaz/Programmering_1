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
 * Skriv ett program som läser in en mening, bestående av minst två ord,
 * från en dialogruta. Programmet skall sedan visa ett meddelande där det dels talar
 * om hur många tecken användaren skrev och dels talr om vilket som var det första
 * och sista ordet.
 */
public class OvninTvaSlut_03 {
    public static void main(String[] arg){
        // Input Dialog
        String input = JOptionPane.showInputDialog(null, "Skriv en mening med minst två ord");
        // räkna tecken-nummer.
        int nTecken = input.length();
        // Initierar forstOrd variable
        String forstOrd = input.substring(0, input.indexOf(' '));
        // Initierar sistaOrd variable
        String sistaOrd = input.substring(input.lastIndexOf(' ') + 1);
        // Dialogruta med resultat
        JOptionPane.showMessageDialog(null, "Du skrev en text med " + nTecken + " tecken. \nDet första ordet var \"" + forstOrd + "\"." +
                " \nDet sista ord var \"" + sistaOrd + "\".");
    }
}
