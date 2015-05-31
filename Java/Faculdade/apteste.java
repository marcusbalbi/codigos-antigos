import java.awt.*;
import java.applet.*;


public class apteste extends Applet{
	
	Button b1,b2,b3;
	
	
	public void init()
	{
		b1 = new Button("button1");
		b2 = new Button("button2");
		b3 = new Button("button3");
		add(b1);
		add(b2);
		add(b3);
		
		
	}
	
	public boolean action(Event evt, Object arg)
	{
		if(evt.target instanceof Button)
		tratabotoes(arg);
		return true;
		
	}
	
	protected void tratabotoes(Object label)
	{
		if(label == "button1")
		b1.setLabel("doidera");
		else if(label == "button2")
		 b2.setLabel("azaração");
	     else if(label == "button3")
		 b3.setLabel("loucuras");
		 else
		{
		
		b1.setLabel("button1");
		b2.setLabel("b2");
		b3.setLabel("b3");
		}
		
		
	}
	
	
}