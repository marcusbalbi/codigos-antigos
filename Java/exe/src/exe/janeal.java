/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exe;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class janeal extends JFrame {
    
    private JCheckBox ch1 = new JCheckBox("Snap to Grid");
    private JCheckBox ch2 = new JCheckBox("show GRID");
    private JLabel l1 = new JLabel("X:");
    private JLabel l2 = new JLabel("Y:");
    private JButton b1 = new JButton("OK");
    private JButton b2 = new JButton("cancel");
    private JButton b3 = new JButton("help");
    private JTextField t1 = new JTextField("8",5);
    private JTextField t2 = new JTextField("8",5);
    private FlowLayout layout = new FlowLayout();
    public janeal()
    {
        setLayout(layout);
        add(ch1);
        add(ch2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        setVisible(true);
        setSize(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

}
