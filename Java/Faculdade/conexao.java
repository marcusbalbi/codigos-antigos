

package utilitarios;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class conexao
    {
		//Class.forName("org.postgresql.Driver"); para o driver postgreSQL
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); para o driver access
		



        final private String drive="caminho do driver";
        final private  String url="jdbc:odbc:estoque";
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




