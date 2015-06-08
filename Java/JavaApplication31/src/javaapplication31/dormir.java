/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class dormir implements Runnable {
    
    private String sleeper1;
    private static Random gerador = new Random();
    private int soneca;
    
    public dormir()
    {
        sleeper1 = "dorminhoca";
        
        soneca = gerador.nextInt(15000);
        
    }

    public void run() {
        
        try
        {
            
            Thread.sleep(soneca);
            System.out.printf("a tred dormipor %s %d", sleeper1, soneca);
            
            
        }catch(Exception e)
        {
            
        }
        
        
        
    }

}
