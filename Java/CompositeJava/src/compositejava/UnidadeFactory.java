/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositejava;

/**
 *
 * @author Marcus
 */
public abstract  class UnidadeFactory {
    
  
    public abstract  Unidade GerarUnidade();
    

    public abstract Unidade[] GerarUnidades(int quantidade) throws Exception;
    
    
}
