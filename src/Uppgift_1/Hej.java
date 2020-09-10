/* This is my first Java Class */
package Uppgift_1;

// Import class with components
import javax.swing.*;

/**
 * Print out 'Hej Javi!'
 *  on the screen in an alert window.
 *<p>
 *     <b>Note: </b>The file name match the class name and have a .java extension.
 *
 * @author Javier Diaz
 * @version 0.1
 */
public class Hej {
    /**
     * Void: keyword to specify that a method doesn’t return anything.
     * Executable statements are contained within a method named main().
     * @param arg Unused.
     */
    public static void main(String[] arg){
        /**
         * Print out Alert window
         */
        JOptionPane.showMessageDialog(null,"Hej!");
    }
}
