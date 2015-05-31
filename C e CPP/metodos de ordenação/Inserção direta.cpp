#include <stdio.h>
#include <conio.h>
#include "string.h"

void ordena (char *item, int count)
{
     int a, b;
     char t;
     
     for(a=1;a<count;++a)
     {
         t=item[a];
         
         for(b=a-1;b>=0 && t<item[b];b--)
         {
             item[b+1]=item[b];
             item[b]=t;
         }
     }
}

int main()
{
    char vet[25];
    
    printf("digite o vetor");
    scanf("%s",&vet);
    ordena(vet,strlen(vet));
    printf("\n%s\n", vet);
    getch();
    
}
