import javax.swing.JOptionPane;

public class mat{
	
	public static void main(String args[]){
		
		String x,y;
		
		x = JOptionPane.showInputDialog(null, "qual o valor de x");
		long a = Integer.parseInt(x);
		y = JOptionPane.showInputDialog(null, "qual o valor de y");
			long  b = Integer.parseInt(y);
			
			JOptionPane.showMessageDialog(null, "X a potencia Y é igual a:"+Math.pow(a,b));
	}
}