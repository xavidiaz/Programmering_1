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
 * Enlift formel skriv program som läser in punkternas koordinater och som
 * beräknar avstående mellan punkterna.
 */
public class Otre_Slut_04 {
    public static void main(String[] arg) {
        // values
        String ix1, ix2, iy1, iy2;
        double x1, x2, y1, y2;
        // Inputruta
        ix1 = JOptionPane.showInputDialog(null,
                "Skriv x1");
        ix2 = JOptionPane.showInputDialog(null,
                "Skriv x2");
        iy1 = JOptionPane.showInputDialog(null,
                "Skriv y1");
        iy2 = JOptionPane.showInputDialog(null,
                "Skriv y2");
        // metod
        x1 = Double.parseDouble(ix1);
        x2 = Double.parseDouble(ix2);
        y1 = Double.parseDouble(iy1);
        y2 = Double.parseDouble(iy2);
        double rs = Math.sqrt (((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        String s = String.format("%.02f", rs);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Avstånd ar: " + s + " eh.");
    }}