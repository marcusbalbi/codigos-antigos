import java.util.*;




public class contas{
	int numero;
	String nome;
	double saldo;
	double limite;

	
	public static void main (String arg[]){
			int teste;
	
		contas c1=new contas();
		Scanner entrada = new Scanner(System.in);
		
		c1.numero = entrada.nextInt();
	
		
		System.out.println(c1.numero);
		
		
	}
}