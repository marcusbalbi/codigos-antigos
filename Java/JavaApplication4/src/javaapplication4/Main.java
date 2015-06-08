

package javaapplication4;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

  
    public static void main(String[] args) {

        Connection con = null;
        Statement sta = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/brecho","root","25332949");
             
           sta = con.createStatement();
           sta.execute("DELETE  FROM CLIENTES WHERE cliente_id=3");

            ResultSet resultado = sta.executeQuery("SELECT * FROM CLIENTES");

            while(resultado.next())
            {
                for(int i=1;i<4;i++)
                {
                   System.out.printf("%-8s\t",resultado.getObject(i));
                   System.out.println();
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }

}
