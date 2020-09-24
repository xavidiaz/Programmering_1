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
 * I en triangel kan man beteckna sidorna med a, b och c. Om man
 * känner till längderna för sidorna a och b samt vinkeln mellan
 * dessa sidor så kan man räkna ut längden av sidan cd med formeln
 * XXX. Skriv ett program som läser in längderna på två sidor i en
 * triangel och vinkeln mellan sidorna. Programmet skall avgöra om
 * triangel är liksidig, likbent eller oliksidig.
 *
 */
public class OfyraSult_06 {
    public static void main(String[] arg){
        // variabler
        double
                a, b, c, v;
        String
        liksidig = "Triangel är liksidig",
        likbent = "Triangel är likbent",
        oliksidig = "Triangel är oliksidig"
                , title = "Hur är det triangle beroende av sidor?";

        // Inputruta
        a = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "a:",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        b = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "b:",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        v = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "vinkeln:",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        // till int

        // formel
        c = Math.sqrt(
                (a * a) + (b * b) - (2 * a * b * Math.cos(v))
        );

        // Dialogruta
        // likbent
        if(a == b && c != b && c != a){
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " +
c + "\n" + likbent,
                    title, JOptionPane.INFORMATION_MESSAGE);
        } else if(c == a && b != a && b != c){
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " +
c + "\n" + likbent,
                    title, JOptionPane.INFORMATION_MESSAGE);
        } else if(b == c && a != b && a != c){
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " +
c + "\n" + likbent,
                    title, JOptionPane.INFORMATION_MESSAGE);
        } else if(a == b && a == c && b == c){
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " +
c + "\n" + liksidig,
                    title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "a: " + a + "\nb: " + b + "\nc: " +
c + "\n" + oliksidig,
                    title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
