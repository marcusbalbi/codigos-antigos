/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package contador;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main {

        int hh;
        int mm;
        int ss;

    public static void main(String[] args) throws InterruptedException, IOException {
        
       
       setTempo();

       private static  void contador(int hh,int mm,int ss) throws InterruptedException, IOException
    {
        int h=0;
        int m=0;
        int s=0;
        JFrame janela = new JFrame("contador");
        janela.setVisible(true);
        janela.setSize(300, 80);
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        janela.setLayout(new FlowLayout());
        janela.add(l1);
        janela.add(l2);
        janela.setDefaultCloseOperation(3);
        janela.setResizable(false);

        while((h!=hh) || (m!=mm) || (s!=ss))
        {

            l1.setText("tempo para desligamento:    "+hh+":"+mm+":"+ss);
            l2.setText("Tempo corrido:  "+String.format("%d:%d:%d", h,m,s));
            Thread.sleep(1000);
            s++;
            if(s>59)
            {
                m++;
                s=0;
            }
            if(m>59)
            {
                h++;
                m=0;

        }



    }
        Runtime.getRuntime().exec("SHUTDOWN /R");

}
    public  void setTempo()
    {
    try
       {
        hh = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de horas para desligar o Windows"));

        mm =Integer.parseInt(JOptionPane.showInputDialog("digite o numero de Minutos para desligar o Windows"));

        ss= Integer.parseInt(JOptionPane.showInputDialog("digite o numero de segundos para desligar o Windows"));
        contador(hh,mm,ss);
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Apenas numeros sao permitidos, abra o programa novamente");


       }



        
       





        
    }

    
}
}