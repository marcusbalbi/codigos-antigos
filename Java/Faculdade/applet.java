import java.awt.*;
import java.applet.*;
import javax.swing.JOptionPane;


public class applet extends Applet{
	
	public void paint(Graphics g)
	{
		g.drawString("ola mundo",25,25);
		JOptionPane.showInputDialog("ola mundo");
		
	}
}