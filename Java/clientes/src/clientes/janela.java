/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clientes;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Formatter;
import javax.swing.JOptionPane;



public class janela extends JFrame {
    
    private JLabel l1,l2,l3,l4,l5,l6;
    private JButton gravar,fechar;
    private JTextField t1,t2,t3,t4,t5,t6;
    
    
    int j=0;
    public janela()
    {
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        l1 = new JLabel("NOME:");
        add(l1);
        t1 = new JTextField(20);
        add(t1);
        l2 = new JLabel("SOBRENOME:");
        add(l2);
        t2 = new JTextField(20);
        add(t2);
        l3 = new JLabel("IDADE:");
        add(l3);
        t3 = new JTextField(20);
        add(t3);
        l4 = new JLabel("ALTURA:");
        add(l4);
        t4 = new JTextField(20);
        add(t4);
        l5 = new JLabel("PESO:");
        add(l5);
        t5 = new JTextField(20);
        add(t5);
        l6 = new JLabel("EMAIL:");
        add(l6);
        t6 = new JTextField(20);
        add(t6);
        gravar = new JButton("gravar");
        add(gravar);
        fechar = new JButton("fechar");
        add(fechar);
       
        gravar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                 bd  bbd = new bd();
                bbd.abrir(j);
                  
                  bbd.gravar(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText());
                  /*t1.setText("");
                  t2.setText("");
                  t3.setText("");
                  t4.setText("");
                  t5.setText("");
                  t6.setText("");*/
                  
                   
        
       
                   
                  bbd.fechar();
                  j++;
            }
        });
        fechar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                
                
                dispose();
            }
        });
        
       
       
        
        
        
        
        
        
    }

}
