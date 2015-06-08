
package fluxo2;


import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class gravaconta {
    
    
    private Formatter saida;
    
    public void abre() throws FileNotFoundException
    {
        try{
            saida = new Formatter("clientes.txt");
            
            
        }catch(SecurityException e)
        {
            System.err.printf("voce nao tem permissao para escrever aqui" );
            System.exit(1);
            
        }catch(FileNotFoundException e)
        {
            System.err.printf("erro ao criar arquivo");
            System.exit(1);
            
        }
    }
    public void grava()
    {
        conta c1 = new conta();
        Scanner entrada = new Scanner(System.in);
        saida.format("%s  %s  %s  %s \n","ID","nome","Sobrenome","balança" );
        System.out.println("digite ID nome Sobrenome e balança");
        while(entrada.hasNext())
        {
            try{
            c1.setid(entrada.nextInt());
            c1.setnome(entrada.next());
            c1.setSnome(entrada.next());
            c1.setbalança(entrada.nextDouble());
            
            if(c1.getid()>0)
            {
                saida.format("%d  %s %s %.2f\n ", c1.getid(),c1.getnome(),c1.getSnome(),c1.getBalança());
            }
            else
            {
                System.out.println("voce deve especificar um numero de id valido");
                return;
            }
            
            
            }catch(FormatterClosedException e)
            {
                System.out.println("erro ao gravar no arquivo");
                return;
            }catch(NoSuchElementException elementException)
            {
                System.err.println("entrada invalida");
                entrada.nextLine();
            }
            System.out.println("digite ID nome Sobrenome e balança");
            
        }
    }
    
    public void fecha()
    {
        if(saida != null)
            saida.close();
    }

}
