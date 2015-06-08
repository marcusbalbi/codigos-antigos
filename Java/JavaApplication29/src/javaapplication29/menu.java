
package javaapplication29;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;


public class menu extends JFrame {
    
    private final Color cores[] ={Color.BLACK ,Color.BLUE,Color.RED , Color.GREEN};
    private JRadioButtonMenuItem colorItem [];
    private JRadioButtonMenuItem fonts[];
    private JCheckBoxMenuItem StyleItems [];
    private JLabel l1;
    private ButtonGroup grupofonte;
    private ButtonGroup grupocores;
    private int estilo=0;
    private JTextArea area1 = new JTextArea();
    
    
    public menu()
    {
        super("aprendendo menus");
        
      
        JMenu menu1 = new JMenu("arquivos");
        menu1.setMnemonic('A');
        
        JMenuItem aboutItem = new JMenuItem("sobre...");
        menu1.add(aboutItem);
        aboutItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               JOptionPane.showMessageDialog(menu.this, "exemplo de como usar menus", "sobre", JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        JMenuItem Sair = new JMenuItem("sair");
        Sair.setMnemonic('S');
        menu1.add(Sair);
        Sair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                dispose();
                System.exit(1);
            }
        });
        
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(menu1);
       
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(bar, BorderLayout.NORTH);
        
        JMenu menu2 = new JMenu("formatar");
        menu2.setMnemonic('F');
        
        String cores[]={"Preto","azul","vermelho","Verde"};
        
        JMenu menu3 = new JMenu("cores");
        menu3.setMnemonic('c');
        
        colorItem = new JRadioButtonMenuItem[cores.length];
        grupocores = new ButtonGroup();
        ItemHandler  itemHandler = new ItemHandler();
        
        
        for(int i=0;i<cores.length;i++)
        {
            colorItem[i] = new JRadioButtonMenuItem(cores[i]);
            menu3.add(colorItem[i]);
            grupocores.add(colorItem[i]);
            colorItem[i].addActionListener(itemHandler);
            
        }
        
        colorItem[0].setSelected(true);
        menu2.add(menu3);
        bar.add(menu2);
        menu2.addSeparator();
        JMenuItem mh = new JMenuItem("nao faço nada");
        menu2.add(mh);
        menu2.addSeparator();
        
        String nomesFonte [] ={"serif","MoNoSpAcEd","SANSERIF"};
        
        JMenu menu4 = new  JMenu("Fontes");
        menu4.setMnemonic('v');
        
        fonts = new JRadioButtonMenuItem[nomesFonte.length];
        grupofonte = new ButtonGroup();
        
        for(int i=0;i<fonts.length;i++)
        {
            fonts[i] = new JRadioButtonMenuItem(nomesFonte[i]);
            menu4.add(fonts[i]);
            grupofonte.add(fonts[i]);
            fonts[i].addActionListener(itemHandler);
        }
        
      
        
        menu2.add(menu4);
        l1 = new JLabel();
        add(l1, SwingConstants.CENTER);
        l1.setText("OLA MUNDO");
        
        
        String nomesEstilo [] ={"bold", "italic"};
        
        StyleItems = new JCheckBoxMenuItem[nomesEstilo.length];
        
        estilohandler est = new estilohandler();
       
        menu2.addSeparator();
        menu4.addSeparator();
        
        for(int i=0;i<nomesEstilo.length;i++)
        {
            StyleItems[i] = new JCheckBoxMenuItem(nomesEstilo[i]);
            menu4.add(StyleItems[i]);
            StyleItems[i].addItemListener(est);
        }
       
       
        
        
        
        
        
        
        
        
        
        
        
    }
    private class ItemHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent arg0) {
            
            for(int i = 0; i<colorItem.length;i++)
            {
                if(colorItem[i].isSelected())
                {
                    l1.setForeground(cores[i]);
                    break;
                }
            }
            
            for(int i=0;i<fonts.length;i++)
            {
                if(arg0.getSource() == fonts[i])
                {
                    l1.setFont(new Font(fonts[i].getText(),estilo,72));
                }
            }
            repaint();
            
        }  
        }
        
        private class estilohandler implements ItemListener
        {
            

            public void itemStateChanged(ItemEvent arg0) {
                
                estilo=0;
                for(int i=0;i<StyleItems.length;i++)
                {
                    if(StyleItems[0].isSelected())
                    {
                        estilo+=Font.BOLD;
                    }
                    
                    if(StyleItems[1].isSelected())
                    {
                        estilo+=Font.ITALIC;
                    }
                    break;
                    
                }
                
                l1.setFont(new Font(l1.getFont().getName(), estilo,72));
                repaint();
            
            
        }
        
        
        
    }
    
    }       


