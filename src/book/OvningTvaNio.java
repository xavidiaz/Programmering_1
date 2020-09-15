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
 * Utöka det sista exempel
 * <code>
 *     a
 * </code>
 * med med en sats som gör att b kommer att innehålla födelsedagen enligt modelen dd/mm.
 */
public class OvningTvaNio {
    public static void main(String[] arg){
        String a = "Erick Andersson 860314-2714";
        a = a.trim(); // a får värdet "Erick Andersson 860314-2714"
        int i = a.lastIndexOf(' ') + 1; // i får värdet 15
        int j = a.indexOf('-') + 1; // j får värdet 21
        String b = a.substring(i, j); // b får värdet "860314"
        int k = b.length(); // k får värdet 7
        String dd = b.substring(k-3, k-1);
        String mm = b.substring(k-5, k-3);
        JOptionPane.showMessageDialog(null, "Datum: " + dd + "/" + mm);
    }
}
