


package relatorio;

import java.util.HashMap;
import javax.swing.JOptionPane;
import utilitarios.conexao;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class rel_cidade {

    conexao con_relatorio = new conexao();

    
    public rel_cidade()
    {
        try
        {
            con_relatorio.conecta();
            con_relatorio.executaSQL("SELECT codigo FROM CIDADE");
            JRResultSetDataSource jrrs = new JRResultSetDataSource(con_relatorio.result);
            JasperPrint jasperprint = JasperFillManager.fillReport("relatorios/relatoriocidade.jasper",
                    new HashMap(), jrrs);
            JasperViewer.viewReport(jasperprint);

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void main(String args[])
    {

        new rel_cidade();

    }


}
