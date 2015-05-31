import java.util.*;


public class erros{
	public static void main(String args[]){
		Scanner entrada =new Scanner(System.in);
		String num;
		int n;
		
		num = entrada.next();
		
		try{
			n = Integer.parseInt(num);
			
			if(n % 2==0)
				{
					System.out.println("PAR");
				}else{
				   System.out.println("impar");
				   
					
					
				}
		}
				catch(java.lang.NumberFormatException e){
					System.out.println("formato invalido");
				}
				
				
			
		
		
	}
}