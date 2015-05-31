

import java.awt.*;
import java.applet.*;
import javax.swing.JOptionPane;

public class calculadora extends java.applet.Applet {
    
   	Label l1, l2,l3;
    	TextField campo1, campo2,result;
    	Button b1,b2,b3,b4,b5,b6;
    	Button b15  = new Button("ola garotones");
    
    public void init() {
    	
    	
    	l1 = new Label("valor 1:");
    	l2 = new Label("valor 2:");
    	l3 = new Label("Resultado:");
    	
    	
    	campo1= new TextField(20);
    	campo2= new TextField(20);
    	result= new TextField(20);
    	
    	b1= new Button("soma");
    	b2= new Button("mult");
    	b3= new Button("div");
    	b4= new Button("sub");
    	b5 = new Button("primo");
    	b6 = new Button("QTDE de divisore");
    	add(l1);
    	add(campo1);
    	add(l2);
    	add(campo2);
    	add(l3);
    	add(result);
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	add(b5);
    	add(b6);
    	add(b15);
    	
    	
    	//int x = Integer.parseInt(s);
    	
    	
    	
    }
    	
    	public boolean action(Event evt, Object arg)
    	{
    		if(evt.target instanceof Button)
    			tratabut(arg);
    			else
    				JOptionPane.showMessageDialog(null, "clique no botao da operação desejada");
    			return true;
    	}
    	
    	protected void  tratabut(Object rot)
    	{
    		if(rot == "soma")
    		{
    			
    			
    			double s= Double.parseDouble(campo1.getText());
    			double t = Double.parseDouble(campo2.getText());
    			result.setText(String.valueOf(s+t));
    			
    			
    			
    			
    			
    			
    			
    		}else if(rot == "mult")
    		{
    			double s= Double.parseDouble(campo1.getText());
    			double t = Double.parseDouble(campo2.getText());
    			result.setText(String.valueOf(s*t));
    			
    		}else if(rot == "div")
    		{
    			double s= Double.parseDouble(campo1.getText());
    			double t = Double.parseDouble(campo2.getText());
    			result.setText(String.valueOf(s/t));
    		}
    		else if(rot == "sub")
    		{
    			double s= Double.parseDouble(campo1.getText());
    			double t = Double.parseDouble(campo2.getText());
    			result.setText(String.valueOf(s-t));
    		}else if(rot == "primo")
    		{
    			
   				int s = Integer.parseInt(campo1.getText());
   				int cont=0;
   				for(int i=1;i<s;i++)
   				{
    				if(s % i ==0 && s % s==0)
    				cont++;
    			
    			}
    			
   					if(cont>2)
   					{
    					result.setText("nao primo");
   					}
   					else
   						result.setText("primo");
    				
    			
    		
    		
    	}
    			
}
}
