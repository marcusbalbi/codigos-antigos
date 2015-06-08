/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cadcontatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class bd {

    private Connection conn=null;
    
private String sql;




    public void gravarcad(String n, String s, String t1,String t2, String cel, String e)
    {
        
        sql = "INSERT INTO contatos(NOME,SOBRENOME,TELEFONE1,TELEFONE2,CELULAR,EMAIL) VALUE(?,?,?,?,?,?)";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/contatos","root","25332949");


            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1, n);
            psta.setString(2, s);
            psta.setString(3, t1);
            psta.setString(4, t2);
            psta.setString(5, cel);
            psta.setString(6, e);
            psta.executeUpdate();


        }catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                if(conn != null)
                {
                    conn.close();
                }
            }catch(Exception erro)
            {
                erro.printStackTrace();
            }
        }





    }



}

