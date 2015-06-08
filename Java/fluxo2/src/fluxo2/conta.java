
package fluxo2;


public class conta {
    
    private int id;
    private String nome;
    private String Snome;
    private double balança;
    
    
    public conta()
    {
        id=0;
        nome="";
        Snome="";
        balança=0.0;
    }
    
    public conta(int cont, String primeiro, String ultimo,double bal)
    {
        setid(cont);
        setnome(primeiro);
        setSnome(ultimo);
        setbalança(bal);
        
    }
    
    public void setid(int id)
    {
        this.id = id;
    }
    public void setnome(String nome)
    {
        this.nome = nome;
    }
    public void setSnome(String Snome)
    {
        this.Snome = Snome;
    }
    public void setbalança(double bal)
    {
        balança = bal;
    }
    
    public int getid()
    {
        return id;
    }
    public String getnome()
    {
        return nome;
    }
    public String getSnome()
    {
        return Snome;
    }
    public double getBalança()
    {
        return balança;
    }
}
