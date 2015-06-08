/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositejava;

/**
 *
 * @author Marcus
 */
public class ArqueiroFactory extends UnidadeFactory {

    @Override
    public Unidade GerarUnidade() {
        return new Arqueiro();
    }

        @Override
    public Unidade[] GerarUnidades(int quantidade) throws Exception{
        
        if(quantidade == 0)
            throw new Exception("Quantidade de unidades não pode ser 0");
        
        
          Arqueiro[] arqueiros = new Arqueiro[quantidade];
          
          for(int i=0;i<arqueiros.length;i++)
              arqueiros[i] = new Arqueiro();
        
        
        return  arqueiros;
        
    }

    
    
}
