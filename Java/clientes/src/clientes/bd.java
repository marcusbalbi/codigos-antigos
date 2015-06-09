

package clientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class bd {

    Formatter cadastro;
    private cliente c1= new cliente();
    public void abrir(int n)
    {
        
        try {
            
            cadastro = new Formatter("cadastros"+n+".txt");
            
        } catch (FileNotFoundException ex) {
           JOptionPane.showConfirmDialog(null,"mensagel", "erro ao criar arquivo", JOptionPane.ERROR);
        }
    }
    
    public void gravar(String nome, String sobrenome, String idade, String altura, String peso, String email)
    {
        
        c1.setnome(nome);
                  c1.setsobrenome(sobrenome);
                  c1.setidade(Integer.parseInt(idade));
                  c1.setaltura(Double.parseDouble(altura));
                  c1.setpeso(Double.parseDouble(peso));
                  c1.setemail(email);
        cadastro.format("%s   %s  %d  %.2f  %.2f  %s \n", c1.getnome(), c1.getsobrenome(), c1.getidade()
                , c1.getaltura(), c1.getpeso(), c1.getemail());
        
        
    }
    
    
    public void fechar()
    {
        if(cadastro != null)
            cadastro.close();
    }
   
}
