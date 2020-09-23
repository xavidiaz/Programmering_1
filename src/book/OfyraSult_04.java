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
 * Skriv ett program som med hjälp av en dialogruta frågar dig om
 * du är en kille eller en tjej. Därefter skall proggrammet i en ny
 * dialogruta be sig skriva in ditt personnummer. I personnummer är
 * den näst sista siffran udda för män och jämn för kvinnor.
 * Programmet skal kontrollera att detta stämmer och visa en dialogruta
 * med texten Stämmer eller Stämmer inte.
 */
public class OfyraSult_04 {
    public static void main(String[] arg){
        // variabler
        String
                ja = "Stämmer!",
                nej = "Stämmer inte\nDu är en ",
                title = "Kön berifikering",
                iPersonnummer,
                kon,
                iKon;
        int
                sSiffra;
        // Inputruta
        iKon = JOptionPane.showInputDialog(null,
                "Är du tjej eller kylle?",
                title, JOptionPane.INFORMATION_MESSAGE);
        iPersonnummer =  JOptionPane.showInputDialog(null,
                "Skriv personnummer:\n(ÅÅMMDD-NNNN)");

        sSiffra = Integer.parseInt(
                iPersonnummer.substring(iPersonnummer.length() - 1)
        );
        // metod
        if (sSiffra % 2 != 0) {
            kon = "kylle";
        } else {
            kon = "tjej";
        }
        if((kon == iKon)){
            JOptionPane.showMessageDialog(null,
                    nej + iKon,
                    title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    ja,
                    title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
