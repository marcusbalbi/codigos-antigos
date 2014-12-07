/*exercicio 10 de POO 03/03/09*/

import java.util.Scanner;


public class exe10{
	
  public static void main (String[] args) {
  	
  	Scanner entrada=new Scanner (System.in);
  	
  	int maior=0;
  	int  num;
  	
  	for(;;)
  	{
  		num = entrada.nextInt();
  		if(num==0)
  			break;
  			
  			if(num>maior)
  			{
  				maior = num;
  			}
  	}
  	System.out.printf("%d", maior);
}
}