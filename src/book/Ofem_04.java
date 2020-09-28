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
 * Skriv en ny version av programmet från övning 5.3 så att man kan göra
 * upprepade beräkningar där man släpper bollen från olika höjder. Programmet
 * skall avslutas när användaren klickar på knappen Avbryt.
 */
public class Ofem_04 {
    public static void main(String[] arg){
        while(true){
            String s = JOptionPane.showInputDialog("n?");
            if (s == null)
                break;
        // variabler
        String
                title = "hur många gånger en sådan boll studsar";
        int
                ihojd,
                nGonger = 0;
        // Inputruta
        ihojd = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "höjd, mätt i meter",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        // metod
        while (ihojd > 0) {
            ihojd *= 0.7;
            nGonger ++;
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "bollen studsade " + nGonger + " gånger");

            while (ihojd > 0) {
                ihojd *= 0.7;
                nGonger ++;
            }
            // Dialogruta
            JOptionPane.showMessageDialog(null,
                    "bollen studsade " + nGonger + " gånger");
        }
    }
}
