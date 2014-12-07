
public class carta{
	
	private String face;
	
	private String naipe;
	
	
	public carta(String face, String naipe){
		
		this.face =face;
		this.naipe =naipe;
		
	}
	
	public String toString()
	{
		return  face+" de "+naipe;
	}
}