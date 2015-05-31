import java.sql.*;

public class Tabelas {
  public static void main(String args[]) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    Statement stmt = con.createStatement();
    
    // Exibindo a tabela Cliente
    System.out.printf("Tabela: Cliente\n");
    System.out.printf("Codigo\tNome\tTelefone\n");
    ResultSet rs = stmt.executeQuery("select * from cliente");
    while (rs.next()) {
    	System.out.printf("%d\t",rs.getInt("codcliente"));
        System.out.printf("%s\t",rs.getString("nome"));
        System.out.printf("%s\n",rs.getString("tel"));
     }

    // Exibindo a tabela Conta
    System.out.printf("\n\nTabela: Conta\n");
    System.out.printf("Conta\tSaldo\tCliente\n");
    rs = stmt.executeQuery("select * from conta");
    while (rs.next()) {
    	System.out.printf("%d\t",rs.getInt("nconta"));
        System.out.printf("%.2f\t",rs.getFloat("saldo"));
        System.out.printf("%d\n",rs.getInt("codcliente"));
     }

    // Exibindo a tabela Movimento
    System.out.printf("\n\nTabela: Movimento\n");
    System.out.printf("Conta\tData\t\tValor\tOp\n");
    rs = stmt.executeQuery("select * from movimento");
    while (rs.next()) {
    	System.out.printf("%d\t",rs.getInt("nconta"));
        System.out.printf("%s\t",rs.getDate("data"));
        System.out.printf("%.2f\t",rs.getFloat("valor"));
        System.out.printf("%s\n",rs.getString("tipoOP"));
     }

    stmt.close();
    con.close();
  }
}