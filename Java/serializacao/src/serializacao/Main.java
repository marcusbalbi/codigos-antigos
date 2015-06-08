/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.util.Formatter;
public class Main {

   
    public static void main(String[] args) {
        File ff = new File("/home/aluno/arquivos");
        
        cliente c1 = new cliente("Marcus","M","0000555");
        c1.setnome("Valdo");
        c1.setcpf("123456/888");
        c1.setsexo("M");
        
        if(ff.mkdir())
            System.out.println("diretorio criado");
        else
        {
            if(ff.exists())
            {
                File ff2 = new File("/home/aluno/arquivos2");
                System.out.println(ff.getClass());
                System.out.println(ff2.mkdir() ? "diretorio arquivo 2 criado" : "diretorios existentes"); 
            }
            
            
            else
                System.out.println("nao foi possivel criar.");
            
        }
        
            
        try
        {
        FileOutputStream arqv = new FileOutputStream("/home/aluno/arquivos/arquivo.opp");
        ObjectOutputStream grvarqv = new ObjectOutputStream(arqv);
        
        grvarqv.writeObject(c1);
        grvarqv.flush();
        grvarqv.close();
        arqv.flush();
        arqv.close();
        System.out.println("conseguiu");
        }catch(Exception e)
        {
            System.err.println("nao consegui");
            
        }
        
        try
        {
        FileInputStream learqv = new FileInputStream("/home/aluno/arquivos/arquivo.opp");
        ObjectInputStream leitor = new ObjectInputStream(learqv);
        Formatter r1;
        System.out.println(leitor.readObject());       
        leitor.close();
        learqv.close();
        
        try
        {
            String teste = c1.getnome();
        r1  = new Formatter("/home/aluno/arquivos/arquivo.txt");
        r1.format("%s", "asdausdh");
        }catch(Exception e)
        {
            System.err.println("arquivo texto normal nao foi criado");
        }
        
        
        }catch(Exception e)
        {
            System.err.println("nao foi possivel ler o arquivo");
            
        }
        
        
        
    }
    

}
