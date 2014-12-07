#include <cstdlib>
#include <iostream>
#include <conio.h>


int main()
{
    int num;
    int result=1;
    printf("digite um numero natural para saber seu fatorial");
    scanf("%d", &num);
    for(int i=1;i<=num;i++)
    {
    result=result*i;
     }
     printf("%d", result);
     getch();

    
}
