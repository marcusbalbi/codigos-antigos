
package consultacredito;

public enum  option {
    
    ZERO_BALANCE(1),CREDIT_BALANCE(2),DEBIT_BALANCE(3),END(4);
    
    private final int valor;

     option(int valor) {
         
         this.valor = valor;
         
         
        
    }
     
     public int get_valor()
     {
         return valor;
     }
         
             
    
    
    

}
