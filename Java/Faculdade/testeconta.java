


class testeconta{
	
	public static void main(String arg[]){
		
		conta c1 = new conta();
		String n;
		
		c1.set_nome("lucas");
		c1.set_saldo(550.00);
		
		System.out.println("seu saldo � :"+ c1.get_saldo()+ " e seu nome � "+ c1.get_nome());
	}
}