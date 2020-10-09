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
 * Uppgift 2
 * •Anta att en viss typ av vattenalger under gynnsamma förhållanden förökar sig så fort
 * att de varje dygn fördubblar den area de täcker.
 * •Anta vidare att man i en liten sjö råkat få in sådana alger och att de efter en dag
 * täcker en area av 1 dm2, dvs. 0,01 m2.
 * •Sjön är ungefär 100 gånger 100 m stor, dvs. dess area är 10000 m2.
 * •Skapa ett program som beräknar hur lång tid det tar innan hela sjön blir täckt med alger.
 */
public class Tva {
    public static void main(String[] arg){
        // variabler
        double
                dArea = 0.01,  // are alger för en dag
                sjoArea = 10000; // sjonArea
        int
                dagar = 1;
        String
                title = "Tid beräkning sjö täckning av Algar";
        // Beräkning
        while(dArea < sjoArea){
            dArea *= 2;
            dagar++;
        }

        // Dialogruta
        JOptionPane.showMessageDialog(null,
                "Sjön blir täckt med alger i " + dagar + "dagar.",
                title, JOptionPane.INFORMATION_MESSAGE);
    }
}
