public class Conta {
	private int nconta;
	private String Nome;
	private double salario;
	protected double saldo;
	
	public Conta(int nc) {
		nconta=nc;
	}
	public Conta(int nc, double sal) {
		nconta=nc;
		salario=sal;
	}
	public Conta(int nc, double sal, String N) {
   		nconta=nc;
		salario=sal;
		Nome=N;
	}

	public void Deposito(double v) {
		saldo = saldo + v;
	}
	
	public boolean Saque(double v) {
		if (v <= (saldo+salario)) {
			saldo = saldo - v;
			return true;
		}
		return false;
	}
	
	public void setNome(String N) {
		Nome = N;
	}
	public void setNConta(int nc) {
		nconta = nc;
	}
	public void setSalario(double sal) {
		salario = sal;
	}
	
	public String getNome() {
		return Nome;
	}
	public int getNConta() {
		return nconta;
	}
	public double getSalario() {
		return salario;
	}
	public double getSaldo() {
		return saldo;
	}

}