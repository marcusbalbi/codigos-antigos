/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package combo;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.swing.ImageIconUIResource;


public class janela extends JFrame {
    private String names[] = {"1.jpg", "2.jpg", "2.jpg", "1.jpg"};
    private JComboBox box1 = new JComboBox(names);
    private Icon fots[] = { new ImageIcon(getClass().getResource(names[0])),
    new ImageIcon(getClass().getResource(names[1])),
    new ImageIcon(getClass().getResource(names[2])),
    new ImageIcon(getClass().getResource(names[3]))};
    private JLabel l1 = new JLabel();
    
    public janela()
    {
        super("testando combobox");
        setLayout(new FlowLayout());
        add(box1);
        box1.setMaximumRowCount(3);
        box1.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent arg0) {
                       
                if(arg0.getStateChange() == ItemEvent.SELECTED)
                 l1.setIcon(fots[box1.getSelectedIndex()])  ;
            }
        });
        add(l1);
        l1.setToolTipText(names[box1.getSelectedIndex()]);
        setResizable(false);
        setSize(500,1000);
    }
    

}
