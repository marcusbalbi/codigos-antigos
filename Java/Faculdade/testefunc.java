import java.util.*;

public class testefunc{
	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
			func f1 = new func();
			Text1 gerente = new Text1();
			String nome;
			String rg;
			double sal;
			double bon;
			int escolha;
			int senha=12345600;
			int idades[];
			idades = new int[15];
			
			
			for(int i=0;i<15;i++)
			{
				idades[i] = entrada.nextInt();
			}
			for(int i=0;i<15;i++)
			{
				System.out.printf(" %d\n", idades[i]);
			}
			
			
			gerente.set_nome("CLAUDIO");
			System.out.println(gerente.get_nome());
			
			if(gerente.autentica(senha))
			{
				System.out.println("ACESSO PERMITIDO");
			}
			else
				{
					System.out.println("ACESSO NEGADO");
					
				}
			
			
			
			
			
			/*nome = entrada.next();
			f1.set_nome(nome);
			
		System.out.println("o nome do funcionario e: "+ f1.get_nome());
			
			rg = entrada.next();
			f1.set_rg(rg);
			System.out.println("e o RG é "+ f1.get_rg());
			
			sal = entrada.nextDouble();
			f1.set_salario(sal);
			
			System.out.println("o salario é: "+ f1.get_salario());
			
			
			System.out.println("deseja Bonificar o Funcionario? em quanto?");
	        
			bon = entrada.nextDouble();
			
			f1.bonifica_sal(bon);
			
			System.out.println("o salario do Funcionario"+f1.get_nome() +"agora é de "+ f1.get_salario());
			
			System.out.println("DESEJA DEMITIR O FUNCIONARIO "+f1.get_nome());
			
			escolha = entrada.nextInt();
			
			if(escolha == 1)
			{
				f1.demite(true);
				System.out.println("funcionario "+f1.get_nome()+ "esta demitido");
			}
			else
			{
			
				f1.demite(false);
				System.out.println("funcionario "+f1.get_nome()+ "continua na empresa");
			}*/
		
	}
}