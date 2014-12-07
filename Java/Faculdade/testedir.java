import java.io.*;


public class testedir{
	
	public static void main(String args[]){
		
		 for(int i=0;i<10;i++)
		 {
		 
		     File dir = new File("C:\\meus_testes"); 
		     	
  
            if(dir.mkdirs()){ 
                System.out.println("Novo diretorio criado em: " + dir.getAbsolutePath()); 
            } 
            else{ 
                System.out.println("Diretorio ja existe"); 
            } 
		 }
  

	}
}