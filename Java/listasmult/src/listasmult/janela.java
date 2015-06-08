
package listasmult;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.MouseInputAdapter;


public class janela extends JFrame {
    private String nomes[]={"Marcus", "joao","joelma", "fernanda","maria","sandra", "cristal"};
    private JList list1 = new JList(nomes);
    private JList coplist;
    private JButton b1 = new JButton("copiar>>>");
    
    
    
    
    public janela()
    {
        super("lista multipla");
        setLayout(new FlowLayout());
        list1.setVisibleRowCount(5);
        
        add(list1);
        add(new JScrollPane(list1));
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(b1);
        b1.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                coplist.setListData(list1.getSelectedValues());
                
            }
        });
        coplist = new JList();
        coplist.setVisibleRowCount(5);
        coplist.setFixedCellHeight(15);
        coplist.setFixedCellWidth(100);
        coplist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(coplist));
        list1.setToolTipText("vai dar merda");
        
        
        
        
        
    }

}
