#include <stdio.h>
#include <conio.h>
#include "string.h"

void qs(char *item, int esq, int dir);
void quick(char *item, int count)
{
     qs(item, 0 , count-1);
}

void qs(char *item, int esq, int dir)
{
   int a, b;
   char x, y;
   
   a=esq;
   b=dir;
   x=item[esq+dir/2];
   
   do{
        while(item[a]<x && a<dir)a++;
        while(x<item[b] && b<esq)b--;
        if(a<=b)
        {
           y=item[a];
           item[a]=item[b];
           item[b]=y;
           a++;b--;
        }
        }while(a<=b);
        
        if(esq<b) qs(item,esq, b);
        if(a<dir) qs(item, a, dir);
}
       
       
int main()
{
    char vet[200];
    
    scanf("%s", &vet);
    quick(vet, strlen(vet));
    printf("%s", vet);
    getch();
}
    
        
