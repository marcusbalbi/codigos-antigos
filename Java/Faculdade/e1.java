//descobre se um numero é divisivel pelo outro

import java.util.Scanner;


public class e1{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		int maior, menor, meio;
		
		System.out.printf("bom dia, digite dois numeros  ");
		
		n1 = entrada.nextInt();
		
		System.out.printf("\n\ndigite agora o segundo");
		
		n2 = entrada.nextInt();
		
		
		if(n1 % n2 ==0)
			System.out.printf("o numero %d é divisivel pelo numero %d\n", n1, n2);
			else
			System.out.printf("nao divisivel");
		
		System.out.println("agora digite mais uM");
		n3= entrada.nextInt();
		
		
		if(n1>n2 && n1>n3)
		{
			maior=n1;
		
		}else{
			if(n2>n1 && n2>n3){
				maior=n2;
			}
			else{
				maior=n3;
			
			}
		}
		
		if(n1<n2 && n1<n3){
			menor=n1;
			
		}else{
			if(n2<n1 && n2<n3){
				menor=n2;
				
				
			}
			else
			{menor=n3;
			
			}
			
			
		}
		if(n1<maior && n1>menor)
			{
				meio=n1;
			}else{
				if(n2<maior && n2>menor){
					meio=n2;
					
					
				}else{
					meio=n3;
				}
			}
		
		System.out.printf("%d %d %d", menor, meio, maior);
		
		
	}
	
}