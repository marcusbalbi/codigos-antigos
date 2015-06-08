/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication28;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class janela extends JFrame {
    
    private painel pp = new painel();
    private JSlider j1;
    
    
    public janela()
    {
        super("JSlider master");
        setLocation(0,0 );
        
       // pp.setBackground(Color.BLACK);
        pp.setBackground(Color.YELLOW);
        add(pp, BorderLayout.CENTER);
        
        j1= new JSlider(SwingConstants.VERTICAL,0,500,100);
        j1.setMajorTickSpacing(10);
        j1.setPaintTicks(true);
        
        j1.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent arg0) {
                pp.setDiametro(j1.getValue());
            }
        });
        add(j1, BorderLayout.EAST);
        
        
        
    }

}
