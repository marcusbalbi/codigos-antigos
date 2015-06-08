
package gui21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class janela extends JFrame {

    private JSlider sli1;
    private OvalPanel mypanel;
    private Dimension d = new Dimension(200, 500);


    public janela()
    {
        super("meu slider");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(d);
        mypanel = new OvalPanel();
        mypanel.setBackground(Color.BLUE);

        sli1= new JSlider(SwingConstants.HORIZONTAL,0,200,10);

        sli1.setMajorTickSpacing(100);
        sli1.setPaintTicks(true);

        sli1.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                mypanel.setDiameter(sli1.getValue());
            }
        });
        add(sli1,BorderLayout.SOUTH);
        add(mypanel,BorderLayout.CENTER);

    }

}
