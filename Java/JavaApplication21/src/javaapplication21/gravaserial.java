
package javaapplication21;

import com.sun.java_cup.internal.runtime.Symbol;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor.INPUT_STREAM;

public class gravaserial {
    
    
    private ObjectOutputStream saida;
    
    public void abre()
    {
        try {
            saida = new ObjectOutputStream(new FileOutputStream("clientes.txt"));
        } catch (IOException ex) {
            System.err.println("nao foi possivel criar o arquivo");
        }
        
    }
    public void grava()
    {
        serial s1;
        int conta =0;
        String nome;
        String sobrenome;
        double balan;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("bem vindo digite control D para parar");
        
        System.out.println("digite o numero da conta , nome , sobrenome e balança");
        
        while(entrada.hasNext())
        {
            try
            {
                conta = entrada.nextInt();
                nome = entrada.next();
                sobrenome = entrada.next();
                balan = entrada.nextDouble();
                
                if(conta > 0)
                {
                    s1 = new serial(conta, nome, sobrenome, balan);
                    
                    saida.writeObject(s1);
                }else
                {
                    System.err.println("numero da conta tem que ser maior que 0");
                }
                
                
            }catch(IOException e)
            {
                System.err.println("erro ao escrever");
            }catch(NoSuchElementException e)
            {
                System.err.println("entrada invalida");
                entrada.nextLine();
            }
            System.out.println("digite o numero da conta , nome , sobrenome e balança");
        }
        
    }
    
    public void fechar()
    {
        try
        {
            if(saida != null)
                saida.close();
        }catch(IOException e)
        {
            System.err.println("erro ao fechar arquivo");
                    System.exit(1);
        }
        
    }
            
            

}
