#include <conio.h>
#include <stdio.h>

int pesq_seq(char *vet, int count, char letra)
{
    for(int i=0;i<count;i++)
    {
        if(vet[i]==letra)
        {
        return 1;
        }
    }
    return -1;
    
}

main()
{
      char vet[6]={'g','a','f','c','f'};
      char t;
      int v;
      
      printf("digite a letra a ser pesquisada");
      scanf("%c", &t);
      if(pesq_seq(vet,6,t)==1)
      printf("esse elemento esta nesse vetor");
      else
      printf("nao encontrado");
      getch();
      
}
        
