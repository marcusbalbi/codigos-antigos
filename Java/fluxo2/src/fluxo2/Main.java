/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fluxo2;

import java.io.FileNotFoundException;


public class Main {

   
    public static void main(String[] args) throws FileNotFoundException {
        
        gravaconta g1 = new gravaconta();
        
        g1.abre();
        g1.grava();
        g1.fecha(); 
        
        
        
        
        
    }

}
