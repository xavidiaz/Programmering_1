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
import java.util.Calendar;

/**
 * Skriv ett program närvarande datum på följande set "Klockan är: tt:mm:ss"
 */
public class OvningTvaSlut {
    public static void main(String[] arg){
        // Närvarande tid to string
        String datum = Calendar.getInstance().getTime().toString();
        // deklarera strings
        String tt, mm, ss ;
        // få index att sista colon
        int colon = datum.lastIndexOf(':');
        // initiera tim värde
        tt = datum.substring(colon - 5, colon -3);
        // initiera minuter värde
        mm = datum.substring(colon - 2, colon);
        // initiera sekunder värde
        ss = datum.substring(colon + 1, colon + 3);
        // Skriv ut i dialogruta
        JOptionPane.showMessageDialog(null, "Klockan är: " + tt + ":" + mm + ":" + ss + ".");
    }
}
