

package loginsenha;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class conexao
    {
        final private String drive="sun.jdbc.odbc.JdbcOdbcDriver";
        final private  String url="jdbc:odbc:login";
        final private  String usuario="";
        final private String senha="";
        private Connection thecon;
        public Statement sta;
        public ResultSet result;



        public void conecta()
        {
        try {
            Class.forName(drive);
            thecon = DriverManager.getConnection(url,usuario,senha);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao foi possivel conectar ao banco o erro informado foi:\n "+e.toString());
        }



        }

        public void desconecta()
        {
            try
            {
                sta.close();
                thecon.close();

            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "nao foi possivel desconectar do banco de dados o erro informado foi:\n"+e);


            }
        }

        public void executaSQL(String sql)
        {
            try
            {
                sta = thecon.createStatement(result.TYPE_SCROLL_SENSITIVE, result.CONCUR_READ_ONLY);
                result = sta.executeQuery(sql);


            }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "nao foi possivel executar a pesquisa\n "+e);
            }
        }

        public void executaUpdate(String sql)
        {
            try
            {
                sta = thecon.createStatement(result.TYPE_SCROLL_SENSITIVE, result.CONCUR_READ_ONLY);
                 sta.executeUpdate(sql);


            }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "nao foi possivel gravar no banco \n "+e);
            }
        }



    }




