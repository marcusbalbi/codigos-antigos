#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <conio.h>
int fat( int *n)
{
    if((*n==1) || (*n==0))
    return 1;
    else
    {
    
        return (*n * fat(n-1));
        }
}

int main()
{
     int num;
    printf("digite o valor para saber o fatorial\n");
    scanf("%d", &num);
    printf("o fatorial de %d  eh %d",num, fat(&num));
    getch();
    
}
