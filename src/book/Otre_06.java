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
 * Antag att en mycket komplicerad datorberäkning tog ett stor antas sekunder att utföra och
 * detta antal finns sparat i variabeln tid som har typen int. Antalet sekunder skall nu
 * räknas om så att det kan uttryckas i timmar, minuter och sekunder, där förstårs antalet
 * minuter och sekunder skall ligga i intervallet 0 till 59. Deklarera tre heltalsvvariabler
 * tim, min, och sek. Skriv sedan satser som beräknar till bariablerna.
 */
public class Otre_06 {
    public static void main(String[] arg) {
        // variables
        String iTSek;
        int tim, min, sek, iSek;
        // Inputruta
        iTSek = JOptionPane.showInputDialog(null,
                "Skriv in sekunder:",
                "Skunder till tt/mm/ss",
                JOptionPane.INFORMATION_MESSAGE);
        // calculation
        iSek = (int) Integer.parseInt(iTSek);
        sek = (int) iSek % 60;
        tim = (int) iSek / 3600;
        min = (int) (iSek % 3600)/60;
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "" + tim + " timar." +
                        "\n" + min + " minuter." +
                        "\n" + sek + " sekunder.",
                "Skunder till tt/mm/ss",
                JOptionPane.INFORMATION_MESSAGE);

    }
}

