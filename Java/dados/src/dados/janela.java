
package dados;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Random;
import javax.swing.Box;
import javax.swing.JScrollPane;


public class janela extends JFrame {
    
    private JTextArea result = new JTextArea(10, 30);
    private JRadioButton r1,r2,r3,r4,r5,r6;
    private JButton gerar;
    private JLabel l1 = new JLabel("Selecione o numero de faces:");
    private ButtonGroup grupo = new ButtonGroup();
    private JTextField quant = new JTextField(10);
    private JLabel l2 = new JLabel("quantidade:");
    private Random aleatorio = new Random();
    private JButton limpar = new JButton("limpar");
    Box box;
    public janela()
    {
        
        setSize(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("DADO");
        setLayout(null);
        
        Box bx = Box.createHorizontalBox();
        add(bx);
        l1.setBounds(50, 50, 100, 200);
        add(l1);
        r1 = new JRadioButton("4");
        add(r1);
        r2 = new JRadioButton("6");
        add(r2);
        r3 = new JRadioButton("8");
        add(r3);
        r4 = new JRadioButton("10");
        add(r4);
        r5 = new JRadioButton("12");
        add(r5);
        r6 = new JRadioButton("20");
        add(r6);
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);
        grupo.add(r4);
        grupo.add(r5);
        grupo.add(r6);
        gerar = new JButton("gerar");
        bx.add(new JScrollPane(result));
      
      
        add(l2);
        add(quant);
        add(result);
        result.setEditable(false);
         add(gerar);
         add(limpar);
         quant.setText("1");
         limpar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
               result.setText("");
            }
        });
         
         
         gerar.addActionListener(new ActionListener() {
                
            public void actionPerformed(ActionEvent event) {
                if(r1.isSelected())
                {
                    
                    int t;
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(4,t);
                    
                }
                else if(r2.isSelected())
                {
                    
                    int t; 
                    
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(6,t);
                }else if(r3.isSelected())
                {
                    
                    int t;
                    
                       
                    
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(8,t);
                }else if(r4.isSelected())
                {
                    
                    int t;
                    
                      
                    
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(10,t);
                }else if(r5.isSelected())
                {
                    
                    int t;
                    
                      
                  
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(12,t);
                }else if(r6.isSelected())
                {
                    
                    int t;
                    
                      
                   
                        t = Integer.parseInt(quant.getText());
                         
                    rolar(20,t);
                }
            }
        });{
            
        }
        
        
        
    }
    public void rolar(int face, int quant)
    {
        for(int i=0;i<quant;i++)
        {
            result.setText(result.getText()+","+aleatorio.nextInt((face)+1));
        }
            
    }
    
    

}
