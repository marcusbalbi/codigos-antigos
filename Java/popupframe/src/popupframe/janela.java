/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package popupframe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;


public class janela extends JFrame {
    
    private JRadioButtonMenuItem radio;
    private String cores[] ={ "vermelho", "amarelo", "azul"};
    JPopupMenu menu1;
    ButtonGroup grupo1 = new ButtonGroup();
    public janela()
    {
        
        
    super("popupmenus");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(600,500);
    
    radio = new JRadioButtonMenuItem("AZUL");
    
    menu1.add(radio);
    
    
    
    

    
    janela.this.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent arg0) {
                
            }

            public void mousePressed(MouseEvent arg0) {
                checar(arg0);
            }

            public void mouseReleased(MouseEvent arg0) {
                checar(arg0);
            }

            public void mouseEntered(MouseEvent arg0) {
                
            }

            public void mouseExited(MouseEvent arg0) {
                
            }
            private void checar(MouseEvent e)
    {
        
        if(e.isPopupTrigger())
        {
            menu1.show(janela.this, e.getX(), e.getY());
        }
        
        
        
    }
        });
    
    
    
    
    }
    
    
    
    
    

}
