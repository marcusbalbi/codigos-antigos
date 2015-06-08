/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mouse1;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class janela extends JFrame {
    
    private JPanel mouse1 = new JPanel();
    private JLabel statusbar = new JLabel();
    private JButton b1 = new JButton("clique aqui");
    public janela()
    {
        
        
       super("mouse eventos");
        mouse1.setBackground(Color.WHITE);
        add(mouse1, BorderLayout.CENTER);
        statusbar.setText("fora do painel");
        add(statusbar,BorderLayout.SOUTH);
      
         
        tratamouse handler = new tratamouse();
        mouse1.addMouseListener(handler);
        mouse1.addMouseMotionListener(handler);
        setVisible(true);
        
        
    }
    private class tratamouse implements MouseListener, MouseMotionListener{

        public void mouseClicked(MouseEvent arg0) {
            statusbar.setText(String.format("mouse clicado em %d %d", arg0.getX(),arg0.getY()));
            
        }

        public void mousePressed(MouseEvent arg0) {
            statusbar.setText(String.format("mouse pressionado em %d %d", arg0.getX(),arg0.getY()));
        }

        public void mouseReleased(MouseEvent arg0) {
            statusbar.setText(String.format("mouse parado em %d %d", arg0.getX(),arg0.getY()));
        }

        public void mouseEntered(MouseEvent arg0) {
            statusbar.setText(String.format("entrou nos dominios em: %d %d", arg0.getX(),arg0.getY()));
            mouse1.setBackground(Color.GREEN);
        }

        public void mouseExited(MouseEvent arg0) {
                        statusbar.setText(String.format("saiu dos dominios em %d %d", arg0.getX(),arg0.getY()));
            mouse1.setBackground(Color.WHITE);
        }

        public void mouseDragged(MouseEvent arg0){
                        statusbar.setText(String.format("Arrastado em %d %d", arg0.getX(),arg0.getY()));
        }

        public void mouseMoved(MouseEvent arg0) {
            
        statusbar.setText(String.format("X: %d  Y:%d", arg0.getX(),arg0.getY()));
        }
            
            
        }

}
