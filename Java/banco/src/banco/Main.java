

package banco;

import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {


    public static void main(String args[]) throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection thecon = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "25332949");
        Statement sta = thecon.createStatement();
        ResultSet rs;

        rs = sta.executeQuery("SELECT * FROM CLIENTE");

        while(rs.next())
        {
            System.out.printf("%d      ",rs.getInt("codcliente") );
            System.out.printf("%s      ",rs.getString("nome") );
            System.out.printf("%d      \n",rs.getInt("tel") );

        }
        System.out.print("\n\n\n\n\n");
        rs = sta.executeQuery("SELECT * FROM MOVIMENTO");

        while(rs.next())
        {
            System.out.printf("%d      ",rs.getInt("nconta") );
            System.out.printf("%s      ",rs.getString("data") );
            System.out.printf("%.2f      ",rs.getFloat("valor") );
            System.out.printf("%s      \n", rs.getString("tipoop"));

        }

        rs = sta.executeQuery("SELECT * FROM CONTA");
         System.out.print("\n\n\n\n\n");
        while(rs.next())
        {
            System.out.printf("%d      ",rs.getInt("nconta") );
            System.out.printf("%.2f      ",rs.getFloat("saldo") );
            System.out.printf("%d      \n",rs.getInt("codcliente") );

        }

          System.out.print("\n\n\n\n\n");

          rs = sta.executeQuery("SELECT * FROM MOVIMENTO WHERE nconta=5002");

          while(rs.next())
        {
            System.out.printf("%d      ",rs.getInt("nconta") );
            System.out.printf("%s      ",rs.getString("data") );
            System.out.printf("%.2f      ",rs.getFloat("valor") );
            System.out.printf("%s      \n", rs.getString("tipoop"));

        }

          rs = sta.executeQuery("SELECT nome  , saldo from cliente, conta where cliente.codcliente = conta.codcliente and nome='pedro'");

            System.out.print("\n\n\n\n\n");
          while(rs.next())
          {

              System.out.printf("%s      ", rs.getString("nome"));
              System.out.printf("%.2f      \n", rs.getFloat("saldo"));

          }

             System.out.print("\n\n\n\n\n");

             boolean menu=true;

          while(menu)
          {
              Scanner entrada = new Scanner(System.in);
              System.out.println("1 - para exibir o conteudo da tabela movimento");
              System.out.println("2 - para exibir movimento de determinada conta");
              System.out.println("3 - para exibir movimento de determinada conta em determinado periodo \n de tempo com seu total de credito");
              System.out.println("4 - para inserir novo movimento a tabela movimentos");

              int op = entrada.nextInt();

              switch(op)
              {
                  case 0:
                  {
                      menu=false;
                      break;
                  }


                  case 1:
                  {
                      rs = sta.executeQuery("SELECT * FROM MOVIMENTO");

                    while(rs.next())
                    {
                        System.out.printf("%d      ",rs.getInt("nconta") );
                        System.out.printf("%s      ",rs.getString("data") );
                        System.out.printf("%.2f      ",rs.getFloat("valor") );
                        System.out.printf("%s      \n", rs.getString("tipoop"));

                    }
                      break;

                  }

                  case 2:
                  {
                      System.out.println("DIGITE O NUMERO DA CONTA");
                      String conta = entrada.next();
                      rs = sta.executeQuery("SELECT * FROM MOVIMENTO WHERE nconta="+conta);

                        while(rs.next())
                        {
                            System.out.printf("%d      ",rs.getInt("nconta") );
                            System.out.printf("%s      ",rs.getString("data") );
                            System.out.printf("%.2f      ",rs.getFloat("valor") );
                            System.out.printf("%s      \n", rs.getString("tipoop"));

                        }
                      break;
                  }

                  case 3:
                  {
                      System.out.println("DIGITE O NUMERO DA CONTA");
                      String conta = entrada.next();
                      System.out.println("DIGITE A DATA INICIAL: AAAA-MM-DD");
                      String datai = entrada.next();
                      System.out.println("DIGITE A DATA FINAL : AAAA-MM-DD");
                      String dataf = entrada.next();
                      double saldo=0.0;
                      rs = sta.executeQuery("SELECT * FROM MOVIMENTO WHERE DATA BETWEEN '"+datai+"'"+"AND "+"'"+dataf+"'"+"AND nconta="+conta);

                        while(rs.next())
                        {
                            System.out.printf("%d      ",rs.getInt("nconta") );
                            System.out.printf("%s      ",rs.getString("data") );
                            System.out.printf("%.2f      ",rs.getFloat("valor") );
                            System.out.printf("%s      \n", rs.getString("tipoop"));

                            if(rs.getString("tipoop").equals("C"))
                      {
                          saldo+=rs.getFloat("valor");
                      }
                      else
                          saldo-=rs.getFloat("valor");

                        }
                      System.out.printf("SEU SALDO É de : %.2f\n", saldo);



                  }




              }



          }



    }
}