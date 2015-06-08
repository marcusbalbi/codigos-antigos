

package mouse2;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class janela extends JFrame {
    private JLabel l1 = new JLabel("clique o mouse");
    private JButton b1 = new JButton("botao");
    private String detalhes;
    private JPanel mouse2 = new JPanel( );
    
    public janela()
    {
     super("mouse 2");
  
    
     add(l1, BorderLayout.SOUTH);
     setVisible(true);
     setSize(200,200);
     add(mouse2);
     mouse2.addMouseListener(new  MouseClickHandler());
     
    }
    private class MouseClickHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent event)
        {
            int xPos = event.getX();
            int yPos = event.getY();
            
            
            
            
            if(event.isMetaDown())
            {
                detalhes += " mouse direito";
                if(event.isAltDown())
                {
                    detalhes += " mouse esqeurdo";
                    
                }else
                    detalhes += " bota esquerdo";
                
                detalhes = String.format(" mouse clicado %d vezes", event.getClickCount());
                l1.setText(detalhes);
                
        }
            
        
          
        
    }
    

}
}
