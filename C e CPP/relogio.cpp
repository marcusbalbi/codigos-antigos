#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

main()
{
int h=0;
int m=0;
int s=0;

int hh;
int mm;
int ss;

scanf("%d %d %d", &hh, &mm, &ss);

  if(ss==60)
  {
            mm++;
            ss=0;
  }
  if(mm==60)
  {
            hh++;
            mm=0;
  }
  
            
            
            
printf("seu computador sera desligado em %d horas e %d minutos e  %d  segundos \n\n", hh, mm, ss);

while(h!=hh || m!=mm || s!=ss)
{        
        _sleep(1000);
        s++;
        if(s>59)
        {
          s=0;
          m++;
        }
        
        if(m>59)
        {
          m=0;
          h++;
        }
        if(h>23)
        {
          h=0;
        }
        printf("%d :",  h);
        printf("%d :",  m);
        printf("%d\n",  s);

}        
system("SHUTDOWN /s");
}
