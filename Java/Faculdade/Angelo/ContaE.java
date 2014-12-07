public class ContaE extends Conta{
	public ContaE(int nc) {
		super(nc);
	}
	public ContaE(int nc, double sal) {
		super(nc,sal);
	}
	public ContaE(int nc, double sal, String N) {
   		super(nc,sal,N);
	}
	public boolean Saque(double v) {
		if (v <= (saldo+(3*getSalario()))) {
			saldo = saldo - v;
			return true;
		}
		return false;
	}
}