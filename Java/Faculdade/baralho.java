import java.util.Random;


public class baralho{
	
	private carta baralho[];
	private int carta_corrente;
    private final int  NUMERO_DE_CARTAS = 52;
	private Random ale;
	
	
	public baralho()
	{
		String faces[] = { "ás", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito",
		"nove", "dez", "valete", "dama", "reis"};
		
		String naipe[] ={ "espadas", "copas", "paus", "ouros"};
		
		
		 baralho = new carta[NUMERO_DE_CARTAS];
		 
		 carta_corrente = 0;
		 
		 ale = new Random();
		 
		 for(int i=0;i<baralho.length;i++)
		 {
		 	baralho[i] =  new carta(faces[i % 13], naipe[i / 13]);
		 	
		 	
		 }
		 
		 

		}
		public void embaralha()
		 {
		 	carta_corrente =0;
		 	
		 	for(int primeiro=0;primeiro<baralho.length;primeiro++)
		 	{
		 		int segundo = ale.nextInt(NUMERO_DE_CARTAS);
		 		
		 		carta temp = baralho[primeiro];
		 		baralho[primeiro] = baralho[segundo];
		 	    baralho[segundo] = temp;
		 	}
		 	
		 	
		 	
		 } 
		 public carta distribui()
		 	{
		 		if(carta_corrente<baralho.length)
		 		return baralho[carta_corrente ++];
		 		
		 		else
		 		return null;
		 	}
		
	}