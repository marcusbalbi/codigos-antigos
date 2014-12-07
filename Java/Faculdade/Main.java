
package dado;
import javax.swing.JOptionPane;

/* programa criado por Marcus Balbi no dia 08/05/2009 esse programa gera
 rolamentos de dados de qualquer face*/
public class Main {


    public static void main(String[] args) {
        
        dados dado = new dados();
     
        
        dado.set_escolha( JOptionPane.showInputDialog("digite o numero de faces " +
                "do dado"));
                
        
        dado.set_vezes(JOptionPane.showInputDialog("digite o numero de vezes que o dado será lançado"));
       JOptionPane.showMessageDialog(null, "o numero é "+dado.vezes());        
    }

}
