

public class testebaralho{
	
	public static void main (String args[])
	
	{
		
		baralho bar = new baralho();
		
		bar.embaralha();
		
		
		for(int i=0;i<13;i++)
		{
		
		System.out.printf("%-20s%-20s%-20s%-20s", bar.distribui(),bar.distribui(),bar.distribui()
		,bar.distribui());
		}
	
	
		
		
	
	}
}