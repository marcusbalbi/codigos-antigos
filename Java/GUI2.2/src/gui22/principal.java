
package gui22;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;



public class principal extends JFrame {


   private final Color cores[] ={Color.BLACK, Color.BLUE,
   Color.RED, Color.GREEN};
   private JRadioButtonMenuItem colorItems[];
   private JRadioButtonMenuItem fonts[];
   private JCheckBoxMenuItem estilositem[];
   private JLabel texto;
   private ButtonGroup colorButtonGroup;
   private ButtonGroup fontButtonGroup;
   private int estilo;
   private JPanel princ = new JPanel(null);
  private JPopupMenu popup = new JPopupMenu("Cores");


   public principal()
   {



      super("            BREXO  MAX             ");

      princ.setBackground(Color.BLACK);
      add(princ, BorderLayout.CENTER);
       setExtendedState(MAXIMIZED_BOTH);
       setSize(500,500);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);








       JMenu file = new JMenu("arquivo");
       file.setMnemonic('a');
       
       JMenuItem sobre = new JMenuItem("sobre...");
       sobre.setMnemonic('s');
JMenuItem sair = new JMenuItem("Sair");
sair.setMnemonic('x');
file.add(sair);


       file.add(sobre);

       sair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });


      sobre.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(principal.this, "feito Marcus Balbi" +
                        " no dia: 11/10/2009 ");

            }
        });
JMenuBar jj = new JMenuBar();
       setJMenuBar(jj);
        jj.add(file);

        JMenu cad = new JMenu("Cadastros");
        cad.setMnemonic('c');

        JMenuItem cadcli = new JMenuItem("Cadastrar Cliente");
        cad.add(cadcli);

        cadcli.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setEnabled(false);
                cadclientejanela cad = new cadclientejanela();
                
            }
        });
        
        JMenuItem cadpro = new JMenuItem("Cadastrar Produto");
        cad.add(cadpro);
        JMenu cadfunc = new JMenu("Cadastrar Funcionario");
        JMenuItem func_adm = new JMenuItem("Administrador");
        JMenuItem func_empregado = new JMenuItem("empregado");
        cadfunc.add(func_empregado);
        cadfunc.addSeparator();
        cadfunc.add(func_adm);
        cad.add(cadfunc);
        jj.add(cad);


        
        


       


   }





}


