/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui22;


class cliente {
    private String nome;
    private String sobrenome;
    private String tel1;
    private String tel2;
    private String cel;
    private String endereco;
    private String email;


    private bd b1 = new bd();




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


    public void set_email(String e)
    {
        email = e;
    }

    public void set_endereco(String end)
    {
        endereco = end;
    }

    public void gravar()
    {

        b1.gravarcadcliente(nome,sobrenome,tel1,tel2,cel,email);

    }

}
