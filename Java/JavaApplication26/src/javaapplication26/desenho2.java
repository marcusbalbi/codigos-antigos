
package javaapplication26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class desenho2 extends JFrame {
    
    private JButton escolhacor = new JButton("escolha a cor de fundo");
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorpanel;
    
    public desenho2()
    {
        super("painel de cores JColorChoose");
        
        
        colorpanel = new JPanel();
        
        colorpanel.setBackground(color);
        
        escolhacor.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                
                color = JColorChooser.showDialog(desenho2.this, "escolha a cor", color);
                
                if(color ==null)
                    color = Color.LIGHT_GRAY;
                
                colorpanel.setBackground(color);
                JOptionPane.showMessageDialog(desenho2.this, "voce escolheu a cor "+color.toString(),"oi",JOptionPane.INFORMATION_MESSAGE);
                
                
                    
                
            }
        });
        
        
        add(colorpanel, BorderLayout.CENTER);
        add(escolhacor, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
        
    }
    

}
