import java.util.*;

public class novos{
	public static void main(String args[]){
		int n, x, y;
		boolean t=true;
		Scanner entrada = new Scanner(System.in);
		
		/*n = entrada.nextInt();
		x = entrada.nextInt();
		y = entrada.nextInt();

		for(;x<=y;x++)
		{
			if(n % x == 0)
			{
				System.out.printf("%d ", x);
			}
			
		}*/
		y=0;
		System.out.println("digite um numero para saber se ele e primo");
		
		
		
		n = entrada.nextInt();
		
		
		for(int i=n;i>0;i--)
		{
			if(n%i==0)
			y++;
			
			if(y==2)
			{
				t=true;
				
				
				
			}
			else
			{
				t=false;
				
			}

			
		}
		if(t)
		System.out.println("PRIMO");
			else
			System.out.println("NAO e PRIMO");
			
			
			
			System.out.printf(" digite  um termo para saber o numero fibonacci equivalente");
			
			y = entrada.nextInt();
			
			int a=1;
			int b=0;
			int c =0;
			for(int i=0;i<y;i++)
			{
				System.out.println(c+",");   
            c=a+b;
            b=a;
            a=c; 
				
				
				
				
				
			}
			
			
		
		
		
	}
}