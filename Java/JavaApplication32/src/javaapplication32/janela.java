
package javaapplication32;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class janela extends JFrame {
    
    private JTextField t1 = new JTextField(10);
    private JLabel l1 = new JLabel("Digite o valor de temperatura em Farenheit:");
    
    
    public janela()
    {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(l1);
        //add(t1);
        setSize(500,300);
        
        janela.this.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void keyPressed(KeyEvent arg0) {
                if(arg0.getKeyCode() == arg0.VK_ENTER)
                    
                {
                    JOptionPane.showMessageDialog(janela.this, "voce apertou Enter");
                    
                }
                
                JOptionPane.showMessageDialog(janela.this, "voce nao digitou Enter");
            }

            public void keyReleased(KeyEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        
        
        
        
    }
    
 

}
