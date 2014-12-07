

package tostring;
public class hist {
	
	private String nome;
	private String sobre;
	private int idade;

    public hist(int id, String n, String s) {
    	idade = id;
    	nome =n;
    	sobre =s;
    	
    }
    
    
    public void set_nome(String n)
    {
    	nome =n;
    }
    public void set_sobre(String s)
    {
    	sobre = s;
    	
    }
    public void set_idade(int id)
    {
    	idade = id;
    }
    
    public String toString()
    {
    	return String.format("ola meu nome é "+nome+" "+sobre+"minha idade é "+idade);
    }
    
    
}