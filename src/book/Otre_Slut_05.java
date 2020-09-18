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
 * Vid radiaoaktiv sönderfall kan man beräkna mänden kvarvarande
 * radioaktiv manerial n efter en viss tid t med formeln XXX.
 * Där n0 är mängden radioaktivt material vid tiden t=0. Konstanten
 * ℷ är en materialkonstant. Man brukar för dent mesta ange halverigstiden
 * (den tid det tar innan hälften av det radioaktiva materialet sönderfallit).
 * Om halvveringstiden betecknas med T kan man räkna ut att XXX
 *
 * Halverings för isotopen 14C är 5730 år. Skriv ett program som skriver ut
 * hur många procent av denna isotop som återstår efter S år.
 * S ges som indata till programmet.
 */
public class Otre_Slut_05 {
    public static void main(String[] arg) {
        // values
        String in0, it;
        double n0; //mängden radioaktiv vid t=0
        double t; // input tid
        double k; // ℷ Konstant
        double n;
        int T = 5730; // Halveringstiden

        // inputruta
        it = JOptionPane.showInputDialog(null,
                "Skriv tid(År):",
                "Radioaktiv sönderfall beräkning",
                JOptionPane.INFORMATION_MESSAGE);
        in0 = JOptionPane.showInputDialog(null,
                "Skriv nängden radioaktiv material vid tid 0:",
                "Radioaktiv sönderfall beräkning",
                JOptionPane.INFORMATION_MESSAGE);

        // metod Konstatn beräkning isotopen 14C
        k = Math.log(2)/T;

        //metod 2 formel kvarander radioaktiv material
        t = Double.parseDouble(it);
        n0 = Double.parseDouble(in0);
        n = n0 * Math.exp(-1 * k * t);
        // till 3 decimal
        String nString = String.format("%.03f", n);

        // metod 3 pass resultat heltal
        double procent = (100 * n) / n0;
        int nProcent = (int)procent;

// Dialogruta
        JOptionPane.showMessageDialog(null,
                "Isotopen kvar:\n" + nString + " g.\n"
                + nProcent + "%",
                "Radioaktiv sönderfall beräkning",
                JOptionPane.INFORMATION_MESSAGE);
    }}