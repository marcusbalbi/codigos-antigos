//classe funcionario


public class func{
	
	private String nome;
	private String depart;
	private double salario;
	private String rg;
	private boolean  ativo;
	
	
	 public void set_nome(String n){
	 	
	 	nome = n;
	 }
	 public void set_depart(String d){
	 	
	 	depart = d;
	 }
	 public void set_salario(double s){
	 	
	   salario = s;
	 		
	 }
	 
	 public void set_rg(String rg){
	 	
	 	this.rg = rg;
	 }
	 
	 public void set_ativo(boolean atv )
	 {
	 	ativo = atv;
	 }
	 
	 public String get_nome(){
	 	return nome;
	 }
	 public String get_depart()
	 {
	 	return depart;
	 }
	 public double  get_salario()
	 {
	 	return salario;
	 }
	 public String get_rg()
	 {
	 	return rg;
	 }
	 public boolean get_ativo()
	 {
	 	return ativo;
	 }
	 
	 public void bonifica_sal(double bon)
	 {
	 	salario+=bon;
	 }
	 
	 public void demite(boolean escolha)
	 {
	 	if(escolha == true)
	 		ativo = false;
	 		
	 		else
	 			ativo = true; 
	 }
	 
	 
}