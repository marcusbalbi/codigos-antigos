/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beleza;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class janela extends JFrame {
    private Random r1 = new Random();
    private JButton bsim = new JButton("sim");
    private JButton bnao = new JButton("nao");
   Icon burro = new ImageIcon(getClass().getResource("burro.JPG"));
    private JLabel l1,l2;
    
    
    public janela()
    {
        super("Teste de Belza");
        
        setLayout(new FlowLayout());
       l1 = new JLabel();
       l1.setIcon(burro);
       setResizable(false);
       add(l1);
       l2 = new JLabel("você se considera bonito?");
       add(l2);
        add(bsim);
        add(bnao);
        bnao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(janela.this,"sabia que voce era feio!!!" );
            }
        });
        
        bsim.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               JOptionPane.showMessageDialog(janela.this,"pensou que ia me enganar com o teclado né!?" );
            }
        });
        l1.setToolTipText("esse é voce em duvida");
        bnao.setToolTipText("tem certeza?");
                
        bsim.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent arg0) {
               bsim.setLocation(r1.nextInt(200)+50, r1.nextInt(200)+50);
            }

            public void mousePressed(MouseEvent arg0) {
                bsim.setLocation(r1.nextInt(200)+50, r1.nextInt(200)+50);
            }

            public void mouseReleased(MouseEvent arg0) {
               bsim.setLocation(r1.nextInt(200)+50, r1.nextInt(200)+50);
                
            }

            public void mouseEntered(MouseEvent arg0) {
               bsim.setLocation(r1.nextInt(200)+50, r1.nextInt(200)+50);
            }

            public void mouseExited(MouseEvent arg0) {
                bsim.setLocation(r1.nextInt(200)+50, r1.nextInt(200)+50);
            }
        });
        
        janela.this.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mousePressed(MouseEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseReleased(MouseEvent arg0) {
                
            }

            public void mouseEntered(MouseEvent arg0) {
                System.out.println("ola mundo entrou");
            }

            public void mouseExited(MouseEvent arg0) {
                System.out.println("ola mundo saiu");
            }
        });
        
    }

}
