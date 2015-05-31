public class TesteConta {
	public static void main(String args[]) {
						    //Nome   Salario Conta
		Conta c = new Conta("Angelo",8932.12,17695);
		
		System.out.println("Saldo: "+c.getSaldo());
		
		c.deposito(233.54);
		System.out.println("Saldo: "+c.getSaldo());
		
		if (!c.saque(900.00))
			System.out.println("Limite insuficiente para saque!");
		System.out.println("Saldo: "+c.getSaldo());

		System.out.println("Disponivel para saque: "+c.getLimite());
	}
}