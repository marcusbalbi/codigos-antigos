/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication27;

import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        janela j1 = new janela();
        JFrame fram1 = new JFrame("ola mundo");
        fram1.setVisible(true);
        fram1.add(j1);
    }

}
