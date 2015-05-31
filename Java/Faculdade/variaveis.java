//programa java, treinando variaveis por Marcus V. Balbi 08/02/2009


import java.util.Scanner;

class variaveis
{
	public static void main(String args[])
	{
		Scanner entrada	=new Scanner(System.in);
		int a, b, c;
		float d, f;
		char q, w, o;
		String nome;
		
		System.out.println("ola bem vindo ao programa treinando variaveis\n\n" );


		//treinando variaveis inteiras
		a=87;
		b=34;
		c=11;
		
		System.out.printf("a+b= %d\n", a+b);
		a = entrada.nextInt();
		
		for(;a<100;a++)
		{
			if(a<=100)
			{
			System.out.println("\n");
		}
			System.out.printf("%d ", a);
			Thread.sleep(1000);
		}
			
	}
		
}
        
