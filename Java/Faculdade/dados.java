

package dado;

import java.util.Random;

public class dados {
    
    private Random aleatorio = new Random();
   
    private int  escolha;
    private int vezes;
    
    
    public void set_escolha(String escolha)
    {
        
       this.escolha = Integer.parseInt(escolha);
        
    }
    
   private   int rolar()
    {
       
               
       return 1 +  aleatorio.nextInt(escolha);
        
        
        
        
        
    }
    
    public int vezes ()
    {
    	
    	int soma=0;
    
    	for(int i=0;i<vezes;i++)
    	{
    		soma +=rolar();
    		
    	}
    return soma;

}

	public void set_vezes(String x)
	{
		
	vezes = Integer.parseInt(x);
	}
	
}