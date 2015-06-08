/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;

import javax.swing.JFrame;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        desenho1 dd = new desenho1();
        
        JFrame fr1 = new JFrame("usando cores");
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr1.add(dd);
        fr1.setSize(600, 500);
        fr1.setVisible(true);
    }

}
