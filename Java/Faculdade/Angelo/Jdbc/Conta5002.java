import java.sql.*;

public class Conta5002 {
  public static void main(String args[]) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    Statement stmt = con.createStatement();
    
    System.out.printf("Conta: 5002\n");
    System.out.printf("Data\t\tValor\tOp\n");
    ResultSet rs = stmt.executeQuery("select data,valor,tipoOP from movimento where nconta=5002");
    while (rs.next()) {
        System.out.printf("%s\t",rs.getDate("data"));
        System.out.printf("%.2f\t",rs.getFloat("valor"));
        System.out.printf("%s\n",rs.getString("tipoOP"));
     }

    stmt.close();
    con.close();
  }
}