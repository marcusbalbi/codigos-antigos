import java.awt.*;
import java.applet.*;
import javax.swing.*;


public class calculator extends Applet{
 
 Label l1,l2;
 Button b1,b2,b3;
 TextField t1 = new TextField(20);
 JTextField t5 = new JTextField(20);
 JPasswordField tt = new JPasswordField(20);
 
 public void init()
 {
  
  l1 = new Label("Cálculos");
  add(l1);
  add(t1);
  b1 = new Button("divi");
  add(b1);
  b2 = new Button("QTDE de divisores");
  add(b2);
  b3 = new Button("primo");
  add(b3);
  l2 = new Label("resultado");
  add(l2);
  add(t5);
  add(tt);
  
  
  
 }
 
 public boolean action(Event evt, Object obj)
 {
  if(evt.target instanceof Button)
  tratabotao(obj);
  return true;
 }
 
 
 protected void tratabotao(Object obj)
 {
  if(obj == "divi")
  {
   int  s =Integer.parseInt( t1.getText());
   
    for(int i=1;i<s;i++)
    {
     if(s % i ==0)
     {
     JOptionPane.showMessageDialog(null, " "+i);
     
     }
     
    }
   
  }else if(obj =="QTDE de divisores")
  {
   int s = Integer.parseInt(t1.getText());
   int c=0;
   for(int i=1;i<s;i++)
   {
    if(s % i == 0)
    {
     c++;
     
     
    }
   }
   l2.setText(""+c);
   
   
  }
  else if(obj == "primo")
  {
   int s = Integer.parseInt(t1.getText());
   int cont=0;
   for(int i=1;i<s;i++)
   {
    if(s % i ==0 && s % s==0)
    cont++;
   }
   if(cont>2)
   {
    l2.setText("nao primo");
   }
   else
   l2.setText("primo");
  }
 }
}