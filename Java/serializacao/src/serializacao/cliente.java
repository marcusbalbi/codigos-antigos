/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacao;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class cliente implements Serializable {
    
    private String nome;
    private String sexo;
    private String cpf;
    
    
    public cliente(String nome, String sexo, String cpf)
    {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public void setnome(String nome)
    {
        this.nome = nome;
    }
    public void setsexo(String sexo)
    {
        this.sexo = sexo;
    }
    public void setcpf(String cpf)
    {
        this.cpf = cpf;
    }
    public String getnome()
    {
        return nome;
    }
    public String getsexo()
    {
        return sexo;
    }
    public String getcpf()
    {
        return cpf;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s  %s   %s ", nome, sexo, cpf);
    }
    

}
