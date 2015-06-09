

package clientes;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class cliente {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private  String email;
    private Formatter cadastro;
    
    
    public String getnome()
    {
        return nome;
    }
    public String getsobrenome()
    {
        return sobrenome;
        
    }
    public int getidade()
    {
        return idade;
    }
    public double getaltura()
    {
        return altura;
    }
    public double getpeso()
    {
        return peso;
    }
    public String getemail()
    {
        return email;
    }
    public void setnome(String n)
    {
        nome = n;
            
    }
    public void setsobrenome(String s)
    {
        sobrenome = s;
    }
    public void setidade(int i)
    {
        idade = i;
    }
    public void setpeso(double pe)
    {
        peso = pe;
    }
    public void setaltura(double al)
    {
        altura = al;
    }
    public void setemail(String em)
    {
        email = em;
    }
    
    
           
    
    

}
