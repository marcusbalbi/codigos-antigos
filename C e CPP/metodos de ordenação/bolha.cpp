#include <cstdlib>
#include <iostream>
#include <string.h>

void bolha(char *item, int count)
{
           int a, b;
           char t;
           
           for(a=1;a<count;a++)
           {
               for(b=count -1;b>=a;b--)
               {
                   if(item[b-1]>item[b])
                   {
                         t=item[b-1];
                         item[b-1]=item[b];
                         item[b]=t;
                   }
               }
           }
}

int main()
{
    char vet[25];
    
    printf("digite o vetor");
    scanf("%s",&vet);
    bolha(vet,strlen(vet));
    printf("\n%s\n", vet);
    system("PAUSE");
    
}
