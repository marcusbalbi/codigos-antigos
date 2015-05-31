import java.sql.*;
import java.util.Scanner;

public class MovMenu {
  public static void main(String args[]) throws SQLException, ClassNotFoundException {
	float acc,acd,v;
	int op=1, conta;
	String SQL="",d1,d2,T_OP;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banco2","root","");
    Statement stmt = con.createStatement();
    ResultSet rs;
    Scanner input = new Scanner(System.in);
    Scanner inputS = new Scanner(System.in);
    Scanner inputF = new Scanner(System.in);
    
    // Montagem do Menu
    while (op!=0) {
	   	System.out.printf("\n\nMenu - Tabela Movimento\n\n");
    	System.out.printf("1- Exibir o conteudo da tabela\n");
    	System.out.printf("2- Exibir movimento de uma conta\n");
    	System.out.printf("3- Exibir movimento de uma conta por periodo\n");
    	System.out.printf("4- Inserir movimento\n");
    	System.out.printf("0- Sair\n");
    	System.out.print("Opcao: ");
     	op = input.nextInt();
    	switch (op) {
    		case 0: break;
    		case 1:	System.out.printf("\nMovimento\n");
			    	System.out.printf("Conta\tData\t\tValor\tOP\n");
    				rs = stmt.executeQuery("select * from movimento");
    				while (rs.next()) {
    					System.out.printf("%d\t",rs.getInt("nconta"));
			        	System.out.printf("%s\t",rs.getDate("data"));
        				System.out.printf("%.2f\t",rs.getFloat("valor"));
        				System.out.printf("%s\n",rs.getString("tipoOP"));
     				}
     				break;

    		case 2: System.out.printf("\nMovimento de uma conta\n");
    				System.out.print("Digite a conta a ser consultada: ");
    				conta = input.nextInt();
    				SQL = "Select * from movimento where nconta="+conta;
				    System.out.printf("Data\t\tValor\tOP\n");
    				rs = stmt.executeQuery(SQL);
    				acc=0;acd=0;
    				while (rs.next()) {
			        	System.out.printf("%s\t",rs.getDate("data"));
			        	v = rs.getFloat("valor");
        				System.out.printf("%.2f\t",v);
        				T_OP = rs.getString("tipoOP");
        				System.out.printf("%s\n",T_OP);
        				if (T_OP.equals("C"))
        					acc=acc+v;
        				else
        					acd=acd+v;
     				}
					System.out.printf("\nTotal Credito: %.2f\tTotal Debito: %.2f\n",acc,acd);
					break;
					
    		case 3: System.out.printf("\nMovimento de uma conta por periodo\n");
    				System.out.print("Digite a conta a ser consultada: ");
    				conta = input.nextInt();
    				System.out.print("Digite a data inicial (AAAA-MM-DD): ");
    				d1 = inputS.nextLine();
    				System.out.print("Digite a data final (AAAA-MM-DD): ");
    				d2 = inputS.nextLine();
    				SQL = "Select * from movimento where nconta="+conta+" and data >= '";
    				SQL=SQL+d1+"' and data <= '"+d2+"'";
				    System.out.printf("Data\t\tValor\tOP\n");
    				rs = stmt.executeQuery(SQL);
    				acc=0;acd=0;
    				while (rs.next()) {
			        	System.out.printf("%s\t",rs.getDate("data"));
			        	v = rs.getFloat("valor");
        				System.out.printf("%.2f\t",v);
        				T_OP = rs.getString("tipoOP");
        				System.out.printf("%s\n",T_OP);
        				if (T_OP.equals("C"))
        					acc=acc+v;
        				else
        					acd=acd+v;
     				}
					System.out.printf("\nTotal Credito: %.2f\tTotal Debito: %.2f\n",acc,acd);
					break;

    		case 4: System.out.printf("\nInserindo um novo movimento\n");
    				System.out.print("Digite a conta: ");
    				conta = input.nextInt();
    				System.out.print("Digite a data: ");
    				d1 = inputS.nextLine();
    				System.out.print("Digite o valor: ");
    				v = inputF.nextFloat();
    				System.out.print("Digite a operacao (C/D): ");
    				T_OP = inputS.nextLine();
    				SQL = "insert into movimento values ("+conta+",'"+d1+"',"+v;
    				SQL = SQL+",'"+T_OP+"')";
    				int in = stmt.executeUpdate(SQL);
    				break;
    									
			default: System.out.printf("Opcao invalida!!!");
    	} 
    }

    stmt.close();
    con.close();
  }
}