/*  >1.	Insira, atrav�s do MySql, 3 a 4 registros em cada tabela.
 	>2.	Fa�a um programa em Java que gere um relat�rio que exiba em seq��ncia os conte�dos das tabelas Conta, Cliente e Movimento. Utilize como apoio o programa-exemplo dado em laborat�rio.
	>3.	Fa�a um programa em Java que mostre todo o movimento da conta 5002.
	>4.	Fa�a um programa em Java que mostre quanto dinheiro Pedro tem no banco.
	>5.	Fa�a um programa em Java que mostre um menu de op��es a serem realizadas sobre a base de dados Banco. Inicialmente as op��es devem ser as seguintes:
		1- Exibir conte�do da tabela Movimento
		2- Exibir conte�do da tabela Movimento para determinada Conta
		3- Exibir conte�do da tabela Movimento para determinada Conta, em determinado per�odo, com os totais de cr�ditos e d�bitos
		4- Inserir novo registro na tabela Movimento
		0- Sair
 **/
import java.sql.*;

public class Clientes {
  public static void main(String args[]) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    Statement stmt = con.createStatement();
    
    //tabela conta
    ResultSet rs_conta = stmt.executeQuery("select * from conta;");
   	
   
   
   System.out.println("====== CONTA =====");
   System.out.println("nconta\t saldo \t codcliente");
    while (rs_conta.next()) {
        System.out.printf("%d\t",rs_conta.getInt("nconta"));
        System.out.printf("%s\t",rs_conta.getFloat("saldo"));
        System.out.printf("\t%s\n",rs_conta.getInt("codcliente"));
     }

//tabela cliente
ResultSet rs_clientes = stmt.executeQuery("select * from cliente;");

   System.out.println("\n\t     ====== CLIENTE =====");
   System.out.println("codcliente\t nome \t\t tel ");
    while (rs_clientes.next()) {
        System.out.printf("%d\t\t",rs_clientes.getInt("codcliente"));
        System.out.printf("%s\t\t",rs_clientes.getString("nome"));
        System.out.printf("%s\n",rs_clientes.getString("tel"));
     }
//tabela movimento
 ResultSet rs_movimento = stmt.executeQuery("select * from movimento;");

   System.out.println("\n\t====== MOVIMENTO =====");
   System.out.println("nconta\t         data \t                  valor         tipoop ");
    while (rs_movimento .next()) {
        System.out.printf("%d\t\t",rs_movimento.getInt("nconta"));
        System.out.printf("%s\t\t",rs_movimento.getString("data"));
        System.out.printf("%s\t",rs_movimento.getFloat("valor"));
        System.out.printf("%s\n",rs_movimento.getString("tipoop"));
     }

    stmt.close();
    con.close();
  }
}