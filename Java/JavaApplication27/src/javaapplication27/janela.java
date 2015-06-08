

package javaapplication27;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;
public class janela extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        Font ff = new Font("Serif", Font.BOLD,50 );
        g.setColor(Color.GREEN);
        g.setFont(ff);
      g.drawString(ff.getName()+" a fonte mais lega\n de todas"+ff.getSize(), 100, 150);
      g.fillRect(800, 220, 110, 50);
      g.setColor(Color.BLACK);
      g.fillRect(850, 270,110, 25);
        
    }

}
