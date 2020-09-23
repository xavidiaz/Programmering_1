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
 * En operatör for mobiltelefoni erbjuder tre olika abonnemang:
 * Kontant, Normal och Plus. Om man jämför villkoren för abonnemangen
 * visar det sig högst 33 minuter per månad, Normal lönar sig bäst
 * om man ringer mella 33 coh 66 minuter per månad och Plus är
 * mest förmånligt om man ringer ännu mer. Skriv ett program som läser
 * in antalet minuter man uppskattar att man kommer att ringa per
 * månad. Programmet skall i en dialogruta tala om vilket
 * abonnemang man för välja.
 */
public class OfyraSult_01 {
    public static void main(String[] arg){
        // variabler
        String
                title = "Abonnemang val",
                meddelande = "För dig passar bäst: ",
                val;
        Integer
                minuter;
        // Inputruta
        minuter = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Skriv in uppskattade minuter:",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
        // metod
        if(minuter < 33){
            val = "Kontant";
        } else if(minuter > 33 && minuter < 66){
            val = "Normal";
        } else {
            val = "Plus";
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                meddelande + val,
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
