


public class empregado {
	
	private String nome1;
	private String nome2;
	private static int count =0;

    public empregado(String primeiro, String segundo)
    	 {
    	 	
    	 	nome1=primeiro;
    	 	nome2=segundo;
    	 	count++;
    	 	System.out.println("no momento existem "+count+" empregados");
    	 }
    	 
    	 protected void finalize()
    	 {
    	 	count --;
    	 	
    	 	System.out.println("empregado demitido numero de empregados:"+count);
    	 }
    	 
    	 public String get_name()
    	 {
    	 	return nome1;
    	 }
    	 
    	 public String get_name2()
    	 {
    	 	return nome2;
    	 }	
    	 	
    	 	
    	 	public static int  get_count()
    	 	{
    	 		return count;
    	 	}
    	 
    	 
    	 
    	 
    	
    	
    	
    
    
    
}