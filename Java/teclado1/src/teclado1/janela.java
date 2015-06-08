
package teclado1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public  class janela extends JFrame implements KeyListener{
    
    private String linha1 = "";
    private String linha2 = "";
    private String linha3 = "";
    private JTextArea txta1;
    
    public janela()
    {
        super("escutando teclas");
         txta1 = new JTextArea(10,15);
        txta1.setText("pressione qualquer tecla");
        txta1.setEditable(false);
        txta1.setDisabledTextColor(Color.BLACK);
        add(txta1);
       txta1.addKeyListener(this);
       
      
        
        
    }

    public void keyTyped(KeyEvent arg0) {
          
         
    }

    public void keyPressed(KeyEvent arg0) {
        txta1.setText("\nvoce pressionou a tecla: "+arg0.getKeyText(arg0.getKeyCode()));
    }

    public void keyReleased(KeyEvent arg0) {
          txta1.setText(txta1.getText()+"\nvoce soltou a tecla: "+arg0.getKeyText(arg0.getKeyCode()));
    }

    

    
    

   
    }


