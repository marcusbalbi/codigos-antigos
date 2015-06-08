

package javaapplication25;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;


public class desenho1 extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        this.setBackground(Color.WHITE);
        
        g.setColor(new Color(255,0,0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("cor selecionada?"+g.getColor(), 130, 40);
        
        //novo
        g.setColor(new Color(0.50f , 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Cor Selecionada:" + g.getColor(), 130, 65);
        
        //outra
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Cor Selecionada:" + g.getColor(), 130, 90);
        
        //manual
        
        Color cc = Color.CYAN;
        g.setColor(cc);
        g.fillRect(15, 100, 100, 20);
        g.drawString("cor Selecionada:"+ g.getColor(),130 ,115 );
        
//        g.drawString("valores RGB"+ Color.getRed() +""+Color.getBlue()+""+Color.getGreen(),
//                WIDTH, WIDTH);
        
        
    }
    
    
    
    

}
