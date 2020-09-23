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
 * I övning 3.3 sukulle du skriva ett program som läste in
 * en cirkels radie och beräknade cikelns omkrets och area. Utöka
 * programmet med en if-sats som kontrollerar att den inlästa
 * radien är större ön 0. Skulle så inte vara fallet skall programmet
 * visa en felutskrift och sedan avbrytas.
 */
public class OfyraSult_02 {
    public static void main(String[] arg){
        // deklarera variabler
        String iRadie;
        float radie, cArea, cOmkrets;
        float pi = (float) Math.PI;

        // Input Dialog
        iRadie = JOptionPane.showInputDialog(null,
                "Skriv in radie:",
                "Cirkelns beräkning",
                JOptionPane.INFORMATION_MESSAGE);
        radie = Float.parseFloat(iRadie);
        if(radie <= 0){
            JOptionPane.showMessageDialog(null,
                    "Radie ska vara störe än 0.",
                    "Cirkelns beräkning",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        // calculation

        cOmkrets = (float) (2 * pi * radie);
        cArea = (float) (pi * radie * radie);
        // Svarruta
        JOptionPane.showMessageDialog(null,
                "omkrets: " + cOmkrets + ". " +
                        "\narea: " + cArea + ".",
                "Cirkelns:",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
