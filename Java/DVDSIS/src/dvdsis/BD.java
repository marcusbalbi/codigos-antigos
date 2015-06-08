
package dvdsis;

import java.sql.*;
import javax.swing.JOptionPane;

public class BD  {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/dvdsis";
    Connection thecon;
     public Statement sta;
    public ResultSet rs;

    public void  conecta_bd()
    {

        try
        {
            Class.forName(driver);
            thecon = DriverManager.getConnection(url, "root", "25332949");
            sta = thecon.createStatement();


        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "nao foi possivel conectar no Banco de Dados \n Erro informado pelo banco de dados:\n"+e.toString());
        }

    }

    public void desconecta_bd()
    {
        try
        {
        sta.close();
        thecon.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "nao foi possivel desconectar do bd contate o administrador do sistema erro informado foi:"+e);
        }



    }


}
