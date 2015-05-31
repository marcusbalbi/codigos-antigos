import java.util.Scanner;

public class gradebookteste{

public static void main(String args[])
{
	String nome_curso;
	int d=5;
	grade g1 = new grade();
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("ENTRE COM O NOME DO CURSO O VALOR INICIAL DO NOME é :"+g1.get_nome());
	nome_curso = entrada.next();
	g1.set_nome(nome_curso);
	System.out.println("o nome agora é "+g1.get_nome());
	
}

}