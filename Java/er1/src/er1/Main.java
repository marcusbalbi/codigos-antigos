package er1;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
    
    public static void main(String []args)
    {
        Scanner entrada = new Scanner(System.in);
        boolean cont = true;
        
        
        do
        {
            try{
                System.out.println("digite o denominador");
                int n1 = entrada.nextInt();
                System.out.println("digite o numerador");
                int n2 = entrada.nextInt();
                cont=false;
                System.out.printf("%d / %d =%d", n1,n2,divide(n1,n2));
                
            }catch(InputMismatchException e)
            {
                System.err.println("digite apenas numeros inteiros");
                entrada.nextLine();
            }catch(ArithmeticException e)
            {
                System.err.println("divisao impossivel de ser realizada");
                entrada.nextLine();
            }
                    
        }while(cont);
        
    }
    
    
    public static int divide(int a, int b)
    
        throws ArithmeticException
    {
        return a/b;
    }
    
        
    
}