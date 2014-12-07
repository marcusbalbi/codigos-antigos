import java.util.Scanner;
import javax.swing.JOptionPane;


public class testeheran{
	
	public static void main(String args[])
	{
		
		funcionario f1 = new funcionario();
		gerente g1 = new gerente();
		diretor d1 = new diretor();
		
		if(g1.autentica(JOptionPane.showInputDialog("qual a senha?")))
		{
		
			JOptionPane.showMessageDialog(null, "Bom dia!");
		}
		else{
			System.exit(0);
		}
			
			
		String mensagem = String.format("bom dia senhor %s", "Flavio");
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		f1.set_nome(JOptionPane.showInputDialog("qual o nome do funcionario ?"));
		g1.set_nome(JOptionPane.showInputDialog("qual o nome do gerente ?"));
		d1.set_nome(JOptionPane.showInputDialog("qual o nome do diretor ?"));
		f1.set_salario(JOptionPane.showInputDialog("qual o salario de "+f1.get_nome()+"?"));
		g1.set_salario(JOptionPane.showInputDialog("qual o salario de "+g1.get_nome()+"?"));
		d1.set_salario(JOptionPane.showInputDialog("qual o salario de "+d1.get_nome()+"?"));
		d1.bomensa(12000);
		
		JOptionPane.showMessageDialog(null, f1.get_nome()+"    "+g1.get_nome()+"    "+d1.get_nome()
			+"\n"+f1.get_salario()+"    "+g1.get_salario()+"    "+d1.get_salario(),"relação salario funcionario" , JOptionPane.PLAIN_MESSAGE);
		
	}
}