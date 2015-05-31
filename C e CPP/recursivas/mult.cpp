#include <cstdlib>
#include <iostream>
#include <conio.h>
#include <stdio.h>


int mult(int m,int n)
{
    if(mult(0,m))
    {
    return 0;
     }
    else
     {
           if((m==1) || (n==1))
            {
                    return 1;
            }
            
     return (mult(m-1,n-1)+(m+n-1));
 
}

}
main()
{
       int num1, num2;
       
       printf("digite os dois argumentos");
       scanf("%d", &num1);
       scanf("%d", &num2);
       printf("%d",mult(num1,num2));
       getch();
}
