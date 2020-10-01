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
 *En kommun har gjort följande prognos för befolningsutvecklingen
 * de närmaste året.
 *  - 2013
 *  - 26000 invånare
 *  - 0,6 - 0,7 -> avlidna.
 *  - 300 -> inflytade
 *  - 325 -> utflytande
 *  Skriv ett program som beräknar kommunens uppskattade invånarantal
 *  i början av ett visst år. Vilket år det gäller skall läsas som indata
 *  till programmet.
 *
 * @link http://skansholm.com/javasteg/uppgifter/kap5/uppg5-6.txt
 */
public class OfemSlut_06 {
    public static void main(String[] arg){
    int invånare = 26000,
            inflytande = 300,
            utflytade = 325,
            år = 2013,
            iÅr;
    double avlidna = 0.7;

    // Inputruta
        iÅr = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                "Sriv år här:")
        );

    double invånareantal = (invånare * 99.4) + inflytande - utflytade ;
    for(int i=2013; i<=iÅr; i++){
        invånareantal = invånare +  (invånare * 0.6) + inflytande - utflytade ;

    }
// Dialogruta
        JOptionPane.showMessageDialog(null,
                invånareantal+"");

    }
}
