#include <conio.h>
#include <stdio.h>

int pesq_bin(char *vet, int count, char letra)
{
    int a,b;
    char t;
    int menor, maior, meio;
    int ret=-1;
    
    
    for(a=1;a<count;a++)
    {
       for(b=count-1;b>=a;b--)
       {
          if(vet[b-1]>vet[b])
          {
              t=vet[b-1];
              vet[b-1]=vet[b];
              vet[b]=t;
          }
          
       }
       
    }
    
    
    
    menor=0;
    maior=count-1;
    meio=(menor+maior)/2;
    
    
    while(menor<maior)
    {
    if(vet[meio]==letra)
       return meio;
       
        if(vet[meio]>letra)
        {
        menor=meio+1;
        }
        
        else
        maior=meio-1;
        meio=(menor+maior)/2;
        }
        return ret;    
   
}

main()
{
      char vet[6]={'g','a','f','c','f'};
      char t;
      
      printf("digite a letra a ser pesquisada");
      scanf("%c", &t);
      printf("%d", pesq_bin(vet, 5, t));
      getch();
      
}
        
