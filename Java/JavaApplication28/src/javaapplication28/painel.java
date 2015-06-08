/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication28;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public class painel extends JPanel {
    
    private int diametro = 110;
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        
        g.fillOval(10, 10, diametro, diametro);
        
        
        
        
    }
    public void setDiametro(int diametro)
    {
        this.diametro = (diametro>=0?diametro: 110);
        repaint();
        
         
        
        }
    
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(200,200);
        
    }
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }

}
