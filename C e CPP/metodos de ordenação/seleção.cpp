#include <cstdlib>
#include <iostream>
#include "string.h"
#include <conio.h>


void ordena(char *item, int count)
{
     int a, b, c;
     int troca;
     char t;
     
     for(a=0;a<=count;a++)
     {
         troca=0;
         c=a;
         t=item[a];
         for(b=a+1;b<count;b++)
         {
             if(item[b]<t)
             {
                c=b;
                t=item[b];
                troca=1;
             }
             if(troca)
             {
                 item[c]=item[a];
                 item[a]=t;
             }
             troca=0;
         }
     }
     
}

main()
{
      char vet[200];
      
      scanf("%s", &vet);
      ordena(vet, strlen(vet));
      printf("%s", vet);
      getch();
}
