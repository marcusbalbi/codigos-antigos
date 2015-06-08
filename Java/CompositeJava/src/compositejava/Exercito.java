/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositejava;

/**
 *
 * @author Marcus
 */
public class Exercito {
    
       private Unidade[] unidades;
       private int TAM_EXERCITO;
       private int CONTADOR_UNIDADE = 0;
       
       
    public Exercito(int tamanhoExercito)
    {
        TAM_EXERCITO = tamanhoExercito;
        this.unidades = new Unidade[TAM_EXERCITO];
        
    }
    /**
     * 
     * @param unit
     * @throws Exception Lança Exception caso seja estourado a capacidade do exercito
     */
    public void AdicionarUnidade(Unidade unit) throws Exception {
       if(CONTADOR_UNIDADE < unidades.length)
       {
           this.unidades[CONTADOR_UNIDADE] = unit;
           CONTADOR_UNIDADE++;
       }
       else
       {
           throw  new Exception("CAPACIDADE DO EXERCITO ESTOURADA\n"
                   + "Tentou adicionar:1\n"
                   + "Tamanho atual do exercito:"+CONTADOR_UNIDADE+"\n"
                    + "Tamanho total do exercito:"+unidades.length);
       }
    }
    
    /**
     * Adicionar um array de unidades para o exercito
     * @param unit Array de unidades 
     */
    public void AdicionarUnidade(Unidade[] unit) throws Exception
    {
       if(CONTADOR_UNIDADE + unit.length -1 < unidades.length)
       {
           for(int i=0;i<unit.length;i++)
           {
               this.unidades[CONTADOR_UNIDADE] = unit[i];
               CONTADOR_UNIDADE++;
           }
           
       }
       else
       {
            throw  new Exception("CAPACIDADE DO EXERCITO ESTOURADA\n"
                   + "Tentou adicionar:"+unit.length+"\n"
                   + "Tamanho atual do exercito:"+CONTADOR_UNIDADE+"\n"
                    + "Tamanho total do exercito:"+unidades.length);
       }
        
    }
    
    /**
     * 
     * @return Retorna o dano causado pelo exercito
     */
    public int TotalBombardStreght()
    {
        int total = 0;
       
       
        for(int i=0;i <CONTADOR_UNIDADE;i++)
        {    
            total+= unidades[i].BombardStreght();
        }
        
        return total;
    }
    
    
    public void AumentarCapacidadeExercito(int NumeroUnidades) throws Exception
    {
        if(NumeroUnidades <=0)
            throw new Exception("O numero de unidades não pode ser menor ou igual a 0");
        
        int totalDesejado = this.unidades.length + NumeroUnidades;
        
        Unidade[] provisorio  = this.unidades;
        
        this.unidades = new Unidade[totalDesejado];
        
        System.arraycopy(provisorio, 0, this.unidades, 0, provisorio.length);
        
        
    }
    
    public int GetTotalUnidades()
    {
        return this.CONTADOR_UNIDADE;
    }
}
