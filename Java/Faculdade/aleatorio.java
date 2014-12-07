// gera numeros aleatorios


import java.util.*;


public class aleatorio{
	
	public static void main(String args[]){
		int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
		int valdado, tac;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		long semente=123456;
		Random random;
		
		random = new Random(System.currentTimeMillis());
		
		System.out.printf("digite o numero de rolamentos do dado\n");
		tac= entrada.nextInt();
		
		
		System.out.printf("n1	n2	n3	n4	n5	n6\n");
		for(int j=0;j<tac;j++){
		
		int i = random.nextInt(7);
		
		if(i==1){
			n1++;
			
		}if(i==2){
			n2++;
		}
		if(i==3){
			n3++;
		}if(i==4){
			n4++;
		}if(i==5){
			n5++;
		}if(i==6){
			n6++;
		}
			    
		
		
		
		
			//System.out.println(l);
			
		}
		System.out.printf("%d	%d	%d	%d	%d	%d\n",n1, n2, n3, n4, n5, n6);
	}
}