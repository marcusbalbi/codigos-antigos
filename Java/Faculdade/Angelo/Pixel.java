public class Pixel extends Ponto {
	private int cor;
	
	public Pixel() {
		super(400,600);
		cor=0;
	}
	
	public Pixel(int a, int b) {
		super(a,b);
		cor=0;
	}
	
	public void setCor(int a) {
		cor=a;
	}
	
	public int getCor() {
		return cor;
	}
}