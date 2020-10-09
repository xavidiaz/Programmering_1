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

package Slutprov;

import javax.swing.*;

/**
 * Uppgift 1
 * •På ett gym kan man antingen köpa ett årskort eller köpa en biljett vid varje besök.
 * •Skapa ett program som läser in priset för ett årskort, priset för en biljett samt
 * antalet gånger man planerar att besöka gymmet under ett år.
 * •Därefter skall programmet ange om det lönar sig att köpa årskort eller inte.
 */
public class Ett {
    public static void main(String[] arg){
        // variabler
        String title = "Vad passar bäst billjet eller årskort?";
        int iaKort = 0; // årskort
        int iBiljett = 0; // biljett
        int iBesok = 0; // antalet gånger man planerar att besöka
        int summaBiljett;
        String
                meddelande,
                meddelandeA = "Det lönar sig att köpa årskort",
                meddelandeB = "Det lönar sig att köpa biljett";
        boolean errorAr = true,
                errorBiljett = true,
                errorDagar = true;

    // läser in priset för ett årskort
        while (errorAr){
            try{
                errorAr = false;
                iaKort = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                "Skriv in priset för Årskort?",
                                title, JOptionPane.INFORMATION_MESSAGE)
                );

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        "Bara siffor är tillåtna");
                errorAr = true;
            }
        }
        while (errorBiljett){
            try{
                errorBiljett = false;
                iBiljett = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                "Skriv in priset för en biljett?",
                                title, JOptionPane.INFORMATION_MESSAGE)
                );
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        "Bara siffor är tillåtna");
                errorBiljett = true;
            }
        }
        while (errorDagar){
            try{
                errorDagar = false;
        iBesok = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Skriv in antal gånger planerad gym besöknin?",
                        title, JOptionPane.INFORMATION_MESSAGE)
        );
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        "Bara siffor är tillåtna");
                errorDagar = true;
            }
        }

    // Beräkning
        summaBiljett = iBiljett * iBesok;
        if(iaKort < summaBiljett){
            meddelande = meddelandeA;
        } else {
            meddelande = meddelandeB;
        }

    // Dialogruta
        JOptionPane.showMessageDialog(null,
                meddelande,
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
