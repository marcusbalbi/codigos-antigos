


class funcionario{
	
	protected String nome;
	protected int id;
	protected String cpf;
    protected double salario;
    
    public double getbo(){
    	return salario * 0.10;
    }
    
    public void set_nome(String nome)
    {
    	this.nome = nome;
    }
    public void set_salario(String salario)
    {
    	
    	this.salario = Double.parseDouble(salario);
    }
    public String get_nome()
    {
    	return this.nome;
    }
    public double get_salario()
    {
    	return salario;
    }
    
 
}