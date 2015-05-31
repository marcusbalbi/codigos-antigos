import javax.swing.JFrame;
import javax.swing.event.*;

public class testedesenho{
	
	public static void main(String args[]){
		
		desenho panel = new desenho();
		
		JFrame janela = new JFrame();
		
		
		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
		janela.add( panel );
		
		janela.setSize(250, 250);
		janela.setVisible( true );
		

			
			
	}
}