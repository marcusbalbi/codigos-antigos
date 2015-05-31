import java.sql.*;
import javax.swing.*;



public class pesquisa
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    Statement stmt = con.createStatement();
    String id = JOptionPane.showInputDialog("digite o id da conta");
    int pesquisa = Integer.parseInt(id);
    String sql = "SELECT * FROM CLIENTE WHERE CODCLIENTE ="+pesquisa;
    stmt.execute(sql);
    ResultSet rs = stmt.getResultSet();
    
     JOptionPane.showMessageDialog(null, "oi"+rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
    
        
    }
	}
