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
 * Skriv ett program som läser in personnumern för två personer och som
 * visar om personerna fyller år på samma dag.
 */
public class Ofyra_06 {
    public static void main(String[] arg){
        // variabler
        String
                iTidPersson1,
                iTidPersson2,
                mdPersson1,
                mdPersson2,
                title = "Fyller dom samma dag år?";
        // Inputruta
        iTidPersson1 = JOptionPane.showInputDialog(null,
                "Födelsedag 1a persson?\n(aa/mm/dd).",
                title, JOptionPane.INFORMATION_MESSAGE);
        iTidPersson2 = JOptionPane.showInputDialog(null,
                "Födelsedag 2a persson?\n(aa/mm/dd).",
                title, JOptionPane.INFORMATION_MESSAGE);
        // substraera dag och månad
        mdPersson1 = iTidPersson1.substring(3, 8);
        mdPersson2 = iTidPersson2.substring(3, 8);
        System.out.print(mdPersson1);
        // Dialogruta
        if(mdPersson1.equals(mdPersson2)){
            JOptionPane.showMessageDialog(null,
                    "De födds samma dag");
        } else {
            JOptionPane.showMessageDialog(null,
                    "De födds olika dag");
        }
    }
}
