/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package layouts;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class janela extends JFrame implements ActionListener {
    
    private final  String nomes[]={"norte","leste","oeste","sul"};
    private JButton but[];
    private BorderLayout layout = new BorderLayout(5,5);
    
    public janela()
    {
        but = new JButton[nomes.length];
        for(int i=0;i<nomes.length;i++)
        {
            but[i] = new JButton(nomes[i]);
            but[i].addActionListener(this);
        }
        
        add(but[0],BorderLayout.NORTH );
        add(but[1],BorderLayout.EAST );
        add(but[2],BorderLayout.WEST );
        add(but[3],BorderLayout.SOUTH );
    }
    
    public void actionPerformed(ActionEvent e)
    {
        for(JButton bb : but)
        {
            if(e.getSource() == bb)
                bb.setVisible(false);
            else
                bb.setVisible(true);
        }
        layout.layoutContainer(getContentPane());
    }
    
    

}
