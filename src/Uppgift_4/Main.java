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

package Uppgift_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
    // Variabler
        String
                halsning = "hej",
                avsked = "hej då",
                meddelande = "Skriv nummer mellan 0 och 23\n";
        int morgon = 8,
            kvall = 17;
        String [] namns = {"Carl", "Peter", "Tom"};
        System.out.print(meddelande);
        Scanner iTid = new Scanner(System.in);
        int tid = iTid.nextInt();
        // Sekvenser
        System.out.print("-- Sekvenser -- \n");
        System.out.print(halsning + " " + namns[0] + "!\n");
        System.out.print(halsning + " " + namns[1] + "!\n");
        System.out.print(halsning + " " + namns[2] + "!\n");
    // selektion
        System.out.print("-- Selektion -- \n");
        if(tid > kvall){
            System.out.print(avsked + " " + namns[0] + "!\n");
        } else if(morgon < tid && tid < kvall){
            System.out.print(halsning + " " + namns[0] + "!\n");
        } else {
            System.out.print("Vad ska jag säga?\n");
        }
    // Iteration
        System.out.print("-- Iteration -- \n");
        for (String namn:namns
             ) {
            String nanm = namn;
            System.out.print(halsning + " " + nanm + "!\n");
        }
    }
}
