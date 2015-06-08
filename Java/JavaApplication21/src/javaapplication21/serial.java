/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.io.Serializable;
public class serial implements Serializable {

    
    private int conta;
    private String nome;
    private String sobrenome;
    private double balan;
    
    
    public serial()
    {
        this(0,null,null,0.0);
    }
    public serial(int conta, String nome, String sobrenome, double balan)
    {
        setconta(conta);
        setnome(nome);
        setsobrenome(sobrenome);
        setbalan(balan);
        
        
    }
    
    public void setconta(int conta)
    {
        this.conta = conta;
        
    }
    public void setnome(String nome)
    {
        this.nome = nome;
    }
    public void setsobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    public void setbalan(double balan)
    {
        this.balan = balan;
        
    }
    public int getconta()
    {
        return conta;
    }
    public String getnome()
    {
        return nome;
    }
    public String getsorbrenome()
    {
        return sobrenome;
    }
    public double getbalan()
    {
        return balan;
    }
            
}
