import javax.swing.JOptionPane;

public class inter{
	
	public static void main(String args[])
	{
		int num;
	
		 
		JOptionPane.showMessageDialog( null, "Olá mundo", "primeiro programa", JOptionPane.PLAIN_MESSAGE);
		String n1 = JOptionPane.showInputDialog("Diga o numero");
		JOptionPane.showOptionDialog(null,"sim ou nao?", JOptionPane.PLAIN_MESSAGE );
		
		num = Integer.parseInt(n1);
		
		
		JOptionPane.showMessageDialog( null, "o numero digitado foi: "+num , "primeiro programa", JOptionPane.PLAIN_MESSAGE);
	}
}