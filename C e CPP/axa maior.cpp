#include <conio.h>
#include <stdio.h>

int div_3(int *vet, int count)
{
                int result=1;
    
    for(int i=0;i<count;i++)
    {

            if(vet[i]%3==0)
            {
               result*=vet[i];
            }
    }
    
               
    
    return result;
            

}


main()
{
      int vet[5]={10,18,27,12,20};
      
      printf("%d", div_3(vet,5));
      getch();
}
        
    
