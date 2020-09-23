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
import java.text.Collator;
import java.util.Locale;

/**
 * Skriv ett program som först läser in namnen på tva personer och som sedan
 * visar de två namnen i svensk alfaetisk ordning på var sin rad i en dialogruta.
 * Du får anta att namnen matas in enligt modellen efternamn, förnamn.
 */
public class Ofyra_07 {
    public static void main(String[] arg){
        // Variabler
        String
                person1,
                person2,
                title = "i svensk alfaetisk ordning",
                lista;
        // Initiera Svenka locale
        Locale swedishLocale = new Locale("sv", "SE");
        Locale.setDefault(swedishLocale);
        // Inputruta
        person1 = JOptionPane.showInputDialog(null,
                "Skriv Efternamn, Namn:",
                title, JOptionPane.INFORMATION_MESSAGE);
        person2 = JOptionPane.showInputDialog(null,
                "Skriv Efternamn, Namn:",
                title, JOptionPane.INFORMATION_MESSAGE);
        // Deklarera jämförae
        Collator jamn = Collator.getInstance(swedishLocale);
        jamn.setStrength(Collator.PRIMARY);
        // metod
        jamn.compare(person1, person2);
        if(jamn.compare(person1, person2) < 0){
            lista = person1 + "\n" + person2;
        } else {
            lista = person2 + "\n" + person1;
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                lista,
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
