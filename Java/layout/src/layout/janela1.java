

package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Marcus Balbi
 */
public class janela1 extends JFrame implements MouseMotionListener {
    private JButton b1 = new JButton("tamanho 30,30");
    private JLabel l1 = new JLabel("estou aqui:");
    private boolean t=false;
   
    public janela1()
    {
        setLayout(null);
        b1.setBounds(500,30,150,30);
        add(b1);
        setSize(700,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(l1);
        
        l1.setBounds(420,30,150,30);
//        b1.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent arg0) {
//                String W = JOptionPane.showInputDialog("digite o valor para largura");
//                String H = JOptionPane.showInputDialog("digite o valro para altura");
//                
//                try{
//                setSize(Integer.parseInt(W), Integer.parseInt(H));
//                }catch(NumberFormatException e)
//                {
//                    JOptionPane.showMessageDialog(null,"Tamanho Invalido" ,"ERROR",0);
//                }
//                
//            }
//            
//            
//        });
        b1.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent arg0) {
                l1.setText("crico");
            }

            public void mousePressed(MouseEvent arg0) {
                l1.setText("presso");
            }

            public void mouseReleased(MouseEvent arg0) {
                l1.setText("arrasto");
            }

            public void mouseEntered(MouseEvent arg0) {
                l1.setText("intyro");
            }

            public void mouseExited(MouseEvent arg0) {
                l1.setText("saiu");
            }
        });
        b1.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseMoved(MouseEvent arg0) {
               l1.setText(""+arg0.getX()+"   "+arg0.getY());
            }
        });
        
            
        
        
    }

    

    public void mouseDragged(MouseEvent arg0) {
       
    }

    public void mouseMoved(MouseEvent arg0) {
        System.out.println(""+arg0.getX());
    }
    
    

}
