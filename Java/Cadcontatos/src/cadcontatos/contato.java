/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadcontatos;

import javax.swing.JOptionPane;




public class contato {

    private String nome;
    private String sobrenome;
    private String tel1;
    private String tel2;
    private String cel;

    private String datanasc;
    private String email;

    //sql
    private bd b1 = new bd();

//public contato(String n,String s, String t1, String t2, String c, String e)
//{
//    set_nome(n);
//    set_sobrenome(s);
//    set_tel1(t1);
//    set_tel2(t2);
//    set_cel(c);
//    set_email(e);
//
//}

{

}
    public void set_nome(String n)
    {
        nome=n;
    }
    public void set_sobrenome(String s)
    {
        sobrenome=s;
    }
    public void set_tel1(String t1)
    {
        tel1 =t1;
    }
    public void set_tel2(String t2)
    {
        tel2 = t2;
    }
    public void set_cel(String c)
    {
        cel = c;
    }

    public void set_datanasc(String d)
    {
        datanasc = d;
    }
    public void set_email(String e)
    {
        email = e;
    }

    public void gravar()
    {
        
        b1.gravarcad(nome,sobrenome,tel1,tel2,cel,email);
        
    }





}