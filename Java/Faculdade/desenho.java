import java.awt.Graphics;
import javax.swing.JPanel;


public class desenho extends JPanel{
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
	
	int width = getWidth();
	int height = getHeight();
	
	for(int i=0;i<=(width);i+=15)
	{
	  g.drawLine( 0, 0, i, (height-i));
	  g.drawLine((width), (height), i,(height-i));
	  g.drawLine(0,height,i,(i));
	  g.drawLine(width,0,i,(i));
	
	
	}
	
	/*g.drawOval(20,20,width,height);
	g.drawOval(10,10,width,height);
	g.drawOval(5,5,width,height);
	g.drawOval(2,2,width,height);
	g.drawOval(-19,-19,width,height);
	g.drawOval(100,100,width,height);*/
	
	
	
	
	
	
	}
	
}