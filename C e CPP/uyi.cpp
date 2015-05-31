#include <stdio.h>
#include <conio.h>

void troca(int *a, int *b)
{
     int troca;
     
     troca=*a;
     a=b;
     *b=troca;
}


main()
{
      int a,b;
      a=5;
      b=8;
      troca(&a,&b);
      printf("%d %d",a,b);
      getch();
      
      
}
      
