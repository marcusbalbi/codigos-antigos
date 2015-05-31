#include <cstdlib>
#include <iostream>
#include <conio.h>

int somavet(int *vet, int tam)
{
    if (tam==0)
    return 0;
    else
    {
        if(vet[tam-1]%2!=0)
        {
    return (vet[tam-1] + somavet(vet, tam-1));
         }
         else
         return(somavet(vet, tam-1));
    }
}

int main()

{
    int v[5];
    
    for(int i=0;i<5;i++)
    {
            scanf("%d", &v[i]);
    }
    printf("%d", somavet(v, 5));
    getch();
}
