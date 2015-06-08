
package gui21;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class OvalPanel extends JPanel {

    private int diameter =10;

    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);

        g.fillOval(10, 10, diameter, diameter);


        }
        public void setDiameter(int nd)
        {
            diameter = (nd>=0?nd:10);
            repaint();

    }

        public Dimension getPreferredSize()
        {
            return new Dimension(200,200);

        }

        public Dimension getMinimunSize()
        {
            return getPreferredSize();
        }

}
