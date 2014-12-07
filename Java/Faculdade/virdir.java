import java.io.File;


public class virdir{
	
	public static void main(String args[]){
		
		
		
		for(int i=0;i<10;i++)
		{
		File dir = new File("c:/"+i);
			    dir.mkdir();	
			if(i==i)
				System.out.printf("*");
	
		
			
		}
			
		
	}
}