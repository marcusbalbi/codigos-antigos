

public class testeemp {
        

   
    public static void main(String[] args) {
    	
    	System.out.printf("empregados antes:%d\n",empregado.get_count() );
    	empregado emp1 = new empregado("Marcus","balbi");
    	empregado emp2 = new empregado("andré ", "Miranda");
    	
    	
    	System.out.printf("empregados depois:%d\n",empregado.get_count() );
    	emp1 = null;
    	emp2 = null;
    	System.gc();
    	
    	
    	
    
    
    	
    	
    	
    	
    	
        
        
}
}
