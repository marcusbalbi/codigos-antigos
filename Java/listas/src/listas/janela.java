/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class janela extends JFrame{
       
       private final String ncores[] = {"preto", "azul", "vermelho", "verde", "amarelo", "cinza"};
       private final Color cor[]={Color.BLACK, Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW, Color.GRAY};
        private JList cores = new JList(ncores); 
    JButton b1 = new JButton("oi ");
    boolean vjl = true;
    JLabel l1 = new JLabel("hello World");
    public janela()
    {
       
        super("janelitas");
         setLayout(new FlowLayout());
        setVisible(true);
        getContentPane().setBackground(Color.PINK);
        add(cores);
        cores.setVisibleRowCount(3);
        cores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(cores));
        add(b1);
        add(l1);
        l1.setVisible(vjl);
       b1.addActionListener(
               new ActionListener() {
                int i=0;
            public void actionPerformed(ActionEvent arg0) {
             if(arg0.getSource() == b1)
             {
                 
                 i++;
                 l1.setText(""+i);
             }
            }
        });        
        cores.addListSelectionListener(
                new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent arg0) {
                
                getContentPane().setBackground(cor[cores.getSelectedIndex()]);
            }
        });
       
       
        
    }
    
    
    

}
