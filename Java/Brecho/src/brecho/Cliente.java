/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package brecho;

import javax.swing.JOptionPane;


public class Cliente {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String email;
    private String descricaoCliente;


    public String getNome()
    {
        return nome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public String getEmail()
    {
        return email;
    }
    public String getDescricaoCliente()
    {
        return descricaoCliente;
    }
    public void setNome(String n)
    {
        if(n==null)
        {
            JOptionPane.showMessageDialog(null, "Campo nome nao pode ficar em branco", "Atenção",JOptionPane.ERROR_MESSAGE);


        }
        else
        {
            nome=n;
        }

    }

    public void setSobrenome(String s)
    {
        sobrenome = s;
    }
    public void setEndereco(String end)
    {
        endereco = end;
    }
    public void setEmail(String email)
    {
        if(email.indexOf('@') == 0)
        {
            JOptionPane.showMessageDialog(null, "O email Deve Conter @", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.email = email;
        }
    }

    public void setDescricaoCliente(String desc)
    {
        descricaoCliente = desc;
    }


}
