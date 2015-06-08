/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication33;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class janela extends JFrame {
    private int cliques=0;
    private JPanel painel = new JPanel();
    private JLabel l1[];
    
    public janela() throws IOException
    {
        super("mouse eventos");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(painel,BorderLayout.CENTER);
        painel.setBackground(Color.WHITE);
        l1 = new JLabel[4];
        
        setVisible(true);
        
        for(int i=0;i<l1.length;i++)
        {
            l1[i] = new JLabel("label "+i);
            
            add(l1[i]);
        }
        
        
        janela.this.addMouseListener(new MouseListener() {
            
            

            public void mouseClicked(MouseEvent arg0) {
                cliques++;
                System.out.println(""+cliques);
                
            }

            public void mousePressed(MouseEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseReleased(MouseEvent arg0) {
                
                
               
            }

            public void mouseEntered(MouseEvent arg0) {
                painel.setBackground(Color.BLACK);
                 
            }

            public void mouseExited(MouseEvent arg0) {
                  painel.setBackground(Color.WHITE);
                 cliques=0;
            }
        });
        
        janela.this.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent arg0) {
                 System.out.println("ARRASTANDO>...");
            }

            public void mouseMoved(MouseEvent arg0) {
               l1[1].setText(""+arg0.getX());
               l1[2].setText(""+ arg0.getY());
            }
        });
        
        
        
        
        System.out.println(""+Runtime.getRuntime().totalMemory());
        Runtime.getRuntime().exec("halt");
    }

}
