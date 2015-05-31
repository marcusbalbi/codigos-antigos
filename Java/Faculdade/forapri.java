

public class forapri{
	
	public static void main(String args[])
	{
		
		int array[] ={20,50,80,78,65,99,45679};
		
		int total=0;
		
		
		for(int num=0;num<array.length;num++)
		{
			total+=array[num];
		}
		
		System.out.printf("TOTAL DE ELEMENTOS NO ARRAY é %d\n",total);
		
		total=0;
		for(int num :array)
		{
			total+=num;
			
		}
		System.out.printf("TOTAL DE ELEMENTOS NO ARRAY é %d\n",total);
	}
}