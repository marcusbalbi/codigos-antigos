
package navegador;

import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class janela extends JFrame{

    private JTextField urltf;
    private JEditorPane conteudo;


    public janela()
    {
        super("NAVEGADOR MARCUS BALBI");

        urltf = new JTextField("entre com a url aqui!");
        urltf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                capturarpagina(e.getActionCommand());
            }
        });

        add(urltf, BorderLayout.NORTH);

        conteudo = new JEditorPane();

        conteudo.setEditable(false);
        conteudo.addHyperlinkListener(new HyperlinkListener() {

            public void hyperlinkUpdate(HyperlinkEvent e) {
                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
                {
                    capturarpagina(e.getURL().toString());
                }
            }
        });

        add(new JScrollPane(conteudo),BorderLayout.CENTER);
        setSize(500,500);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }

    private void capturarpagina(String l)
    {
        try
        {
            conteudo.setPage(l);
            urltf.setText(l);
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "nao abriu");


        }

    }


}
