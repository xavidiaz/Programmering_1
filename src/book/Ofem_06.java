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
 * Gör om exempel
 * @<code>
 *     public static void main(String[] arg){
 *         // leta efter vita tecknet i en text
 *         String s = JOptionPane.showInputDialog("Skriv en text");
 *         int i;
 *         for (i=0; i<s.length(); i=i+1)
 *             if(s.charAt(i) == ' ' || s.charAt(i) == '\t')
 *                 break;
 *             if(i < s.length())
 *                 JOptionPane.showMessageDialog(null,
 *                         "Första vita tecken finns på plats n° " + i);
 *             else
 *                 JOptionPane.showMessageDialog(null,
 *                         "Inga vita tecken");
 *     }
 * </code>
 *  att man letar efter det sista vita tecknet i texten.
 */
public class Ofem_06 {
    public static void main(String[] arg){
        // leta efter vita tecknet i en text
        String s = JOptionPane.showInputDialog("Skriv en text");
        int i;
        for (i=s.length()-1; i>=0; i=i-1)
            if(s.charAt(i) == ' ' || s.charAt(i) == '\t')
                break;
            if(i >= 0)
                JOptionPane.showMessageDialog(null,
                        "Första vita tecken finns på plats n° " + i);
            else
                JOptionPane.showMessageDialog(null,
                        "Inga vita tecken");
    }
}
