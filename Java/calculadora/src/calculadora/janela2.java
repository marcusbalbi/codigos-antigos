

package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class janela2 extends JFrame {
JButton b5 = new JButton("clique");
    public janela2() {
        setLayout(new FlowLayout());
        add(b5);
        setSize(300,200);
        
    b5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });    
    }
    

}
