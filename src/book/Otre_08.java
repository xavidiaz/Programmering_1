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
 * Skriv en program som läser in de temperaturer som uppmäst på en viss ort
 * kl 13 under en vecka. Programmet skall sedan visa den högsta uppmätta temperaturen.
 *
 */
public class Otre_08 {
    public static void main(String[] arg) {
        // variables
        String stringDagTemp;
        float dagTemp, maxTemp=0;
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Måndags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Tisdags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Onsdags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Torsdags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Fredags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Lördags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Närvarande vekans maximal temperatur: " + maxTemp + " °C.");
        // Dag inputruta
        stringDagTemp = JOptionPane.showInputDialog(null,"Söndags temperatur?");
        // till float
        dagTemp = Float.parseFloat(stringDagTemp);
        // Räkna max
        maxTemp = Math.max((float)dagTemp, (float)maxTemp);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Vekans maximal temperatur blev: " + maxTemp + " °C.");
    }}


