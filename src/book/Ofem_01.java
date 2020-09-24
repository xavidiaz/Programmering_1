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
 * Skriv ett program som läser in ett heltal n och som beräknar summan, dvs.
 * 1 + 4 + 9 + 16 + ...n^2
 */
public class Ofem_01 {
    public static void main(String[] arg){
        // variabler
        String
                title = "Summa beräkning";
        int
                ia1,
                in, // gånger
                id, // differens
                an,
                sn;
        // Inputruta
        //in
        in = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "n gånger?:")
        );
        ia1 = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "a1:")
        );
        id = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "differensen:")
        );
        //ian
        // formel
        an = ia1 + (in-1)*id;
        sn = in * ((ia1 + an)/2);
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Summan är: " + sn,
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
