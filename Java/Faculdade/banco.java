import java.sql.*;

public class banco {
  public static void main(String args[]) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    Statement stmt = con.createStatement();
    
   stmt.executeUpdate ("update movimento set data = 20090911 where nconta='5001'");
   
    ResultSet rs = stmt.executeQuery("select * from cliente");
    while (rs.next()) {
        System.out.printf("%d\t",rs.getInt("codcliente"));
        System.out.printf("%s\t",rs.getString("nome"));
        System.out.printf("%s\n",rs.getString("tel"));
     }

    
System.out.print ("--------------------------------------------\n"); 
    ResultSet rs1 = stmt.executeQuery("select * from conta");
    while (rs1.next()) {
        System.out.printf("%d\t",rs1.getInt("nconta"));
        System.out.printf("%f\t",rs1.getFloat("saldo"));
        System.out.printf("%d\n",rs1.getInt("codcliente"));
     }

System.out.print ("--------------------------------------------\n");    
    ResultSet rs2 = stmt.executeQuery("select * from movimento");
    while (rs2.next ()){
    	
    	System.out.printf("%d\t",rs2.getInt("nconta"));
        System.out.printf("%s\t",rs2.getString("data"));
        System.out.printf("%f\t",rs2.getFloat("valor"));
        System.out.printf("%s\n",rs2.getString ("tipoop"));
    	
    }
   
   
   System.out.print ("--------------------------------------------\n");
   
   ResultSet rs3 = stmt.executeQuery ("select * from movimento where nconta='5002'");
   while (rs3.next ()){
   	
   	System.out.printf("%d\t",rs3.getInt("nconta"));
        System.out.printf("%s\t",rs3.getString("data"));
        System.out.printf("%f\t",rs3.getFloat("valor"));
        System.out.printf("%s\n",rs3.getString ("tipoop"));
   	
   }
       System.out.print ("--------------------------------------------\n");
   
   ResultSet rs4 = stmt.executeQuery ("select * from conta where codcliente='104'");
   while (rs4.next ()){
   	
   	System.out.printf("%d\t",rs4.getInt("nconta"));
        System.out.printf("%f\t",rs4.getFloat("saldo"));
        System.out.printf("%d\n",rs4.getInt("codcliente"));
   }
 
 
 
    stmt.close();
    con.close();
  
 }
}