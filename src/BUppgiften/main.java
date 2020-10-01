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

package BUppgiften;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] arg){
        // variabler
        String
                rubrik = "Genomsnittsålder";
        // Ålders array
        List G1 = new ArrayList();
        List G2 = new ArrayList();
        float
                alder,
                A1 = 0,
                nA1 = 0, // alders summa
                A2 = 0,
                nA2 = 0, // alders summa
                M1 = 99, // genomsnittsåldern Kvinnor
                M2 = 99; // genomsnittsåldern Män
        // do while loop för att upprepa "Mata in Person"
        int fler;
        do{
            // Mata in person Ålder
            alder = Float.parseFloat(
                    JOptionPane.showInputDialog(null,
                            "Skriv här ålder:",
                            rubrik, JOptionPane.INFORMATION_MESSAGE)
            );
            // Välja "kategori?" kön
            JFrame dialog = new JFrame();
            String[] genre = new String[2];
            genre[0] = new String("Kvinna");
            genre[1] = new String("Man");

            JOptionPane.showOptionDialog(dialog.getContentPane(),
                    "Välj genre:",
                    "Title", 0,
                    JOptionPane.INFORMATION_MESSAGE,null,genre,null);

            if(true){
                // Addera till A1
                A1 = alder;
                // Addera till G1
                G1.add(A1);
                JOptionPane.showMessageDialog(null,
                        G1);
            } else {
                // Addera till A2
                A2 = alder;
                // Addera till G2
                G2.add(A2);
                JOptionPane.showMessageDialog(null,
                        G2);
            }

            // Dialog fråga Fler?
            fler = JOptionPane.showConfirmDialog(
                    null,
                    "Fler?",
                    rubrik,
                    JOptionPane.YES_NO_OPTION);
        }while(fler == 0);
        // Beräknar genomsnittsåldern för kvinnor respektive män i gruppen
        // Arraylist to float array
        // Skappa float Array
        float[] aG1= new float[G1.size()];
        float[] aG2= new float[G2.size()];
        // ArrayList to Array (Conversion)
        for (int j = 0; j < G1.size(); j++) {
            aG1[j] = (float) G1.get(j);
        }
        for (int j = 0; j < G2.size(); j++) {
            aG2[j] = (float) G2.get(j);
        }
        // addera åldrar
        for(int i=0; i< aG1.length; i++ ){
            nA1+= aG1[i];
        }
        for(int i=0; i< aG2.length; i++ ){
            nA2+= aG2[i];
        }
        // M1 = G1/A1
        M1 = (G1.size()/ nA1);
        // Skriv ut A1 & M1
        JOptionPane.showMessageDialog(null,
                "A1: " + nA1 + ".\n" +
                        "M1: " + M1 + ".\n",
                rubrik, JOptionPane.INFORMATION_MESSAGE);
        // M2 = G2/A2
        M2 = (G2.size()/ nA2);
        // Skriv ut A2 & M2
        JOptionPane.showMessageDialog(null,
                "A2: " + nA2 + ".\n" +
                        "M2: " + M2 + ".\n",
                rubrik, JOptionPane.INFORMATION_MESSAGE);
    }
}


