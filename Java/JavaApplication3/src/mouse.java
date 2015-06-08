
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.jocl.JOCLContentHandler;







public class mouse extends JFrame 
{
JLabel status = new JLabel("FORA DO ALCANCE");


    public mouse()
    {
        super("LOCALIZA POSIÇÂO DO MOUSE");
        
        Panel principal = new Panel();
        
        
        add(principal, BorderLayout.CENTER);
        add(status,BorderLayout.SOUTH);
        principal.setBackground(Color.PINK);
        principal.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
         System.out.println("ola mundo");
            }

            public void mousePressed(MouseEvent e) {
               System.out.println("ola mundo");
            }

            public void mouseReleased(MouseEvent e) {
              System.out.println("ola mundo");
            }

            public void mouseEntered(MouseEvent e) {
             status.setText(String.format("%d        %d", e.getX(), e.getY()));
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("ola mundo");
            }
        });

        principal.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
               status.setText(String.format("Arrastando ...%d        %d", e.getX(), e.getY()));
            }

            public void mouseMoved(MouseEvent e) {
                status.setText(String.format("%d        %d", e.getX(), e.getY()));
            }
        });

  
    }

    public static void main (String args[])
    {
        mouse m = new mouse();
        m.setSize(600,800);
        m.setVisible(true);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);

        

    }

    

}
