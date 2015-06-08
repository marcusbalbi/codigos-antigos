/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositejava;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcus
 */
public class CompositeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Exercito exerc1 = new Exercito(15);
         ArqueiroFactory fabricaArqueiros = new ArqueiroFactory();
         
        try {
            
            exerc1.AumentarCapacidadeExercito(80);
            exerc1.AdicionarUnidade(fabricaArqueiros.GerarUnidades(80));
           
         System.out.println("Total de dano do exercito 1 é:"+exerc1.TotalBombardStreght());
            
        } catch (Exception ex) {
            Logger.getLogger(CompositeJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
