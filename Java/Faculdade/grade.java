

public class grade{
	private String nome_curso;
	
	
	public grade (String n){
		
		nome_curso = n;
	}
	
	public void mostra_mess()
	{
		System.out.println(nome_curso);
	}
	public String get_nome()
	{
		return nome_curso;
	}
	public void set_nome(String x)
	{
		nome_curso = x;
	}
}