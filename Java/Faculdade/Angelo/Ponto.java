public class Ponto {
	private int x,y;
	
	public Ponto(){
		x=400;
		y=300;
	}
	
	public Ponto(int a, int b) {
		x=a;
		y=b;
	}
	
	public void mover(int a, int b){
		x=a;
		y=b;
	}

	public void setX(int a){
		x=a;
	}
	public void setY(int b){
		y=b;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
}