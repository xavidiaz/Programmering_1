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
 * På ett matteprov kunde man få högst 50 poäng. Gränsen för betyget E var
 * 25 poäng och för betygen D, C, B och A 30, 35, 40 respektive 45 poäng.
 * Skriv ett program som läser in poäng för en elev och som visar vilket
 * betyg hon eller han fick på provet.
 */
public class Ofyra_03 {
    public static void main(String[] arg){
        // Variabler
        String betyg;

        int bM =50,
                bA = 45,
                bB = 40,
                bC = 35,
                bD = 30,
                bE = 25;
        // Inputruta
        int iPoeng = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Hur många poäng fick du?",
                "Betyg räknare",
                JOptionPane.INFORMATION_MESSAGE));
        // Metod
        if(iPoeng < bE){
            betyg = "Du fick betyg: F";
        } else if(iPoeng < bD){
            betyg = "Du fick betyg: E";
        } else if(iPoeng < bC){
            betyg = "Du fick betyg: D";
        } else if(iPoeng < bB){
            betyg = "Du fick betyg: C";
        } else if(iPoeng < bA){
            betyg = "Du fick betyg: B";
        } else if(iPoeng <= bM){
            betyg = "Du fick betyg: A";
        } else {
            betyg = "Fell inslag!\nRutan ska få en siffra mellan 0 och 50 poäng";
        }
        // Dialogruta
        JOptionPane.showMessageDialog(null,
                betyg,
                "Betyg räknare",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
