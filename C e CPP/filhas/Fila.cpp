#include <stdio.h>
#include <conio.h>
#include "Fila.h"
     

int Tfila :: incrementa(int pos)
{
     if (pos == 11)
        pos = 0;
     else
        pos++;
	 return 0;
}


int Tfila :: verifica_cheia()
{
    int subs;
    subs = fim;
    incrementa(&subs);
    if (subs == ini)
       return 1;
    else
       return 0;
}

int Tfila :: verifica_vazia()
{
    if (ini == -1)
       return 1;
    else
       return 0;
}

int Tfila :: verifica_1_elemento()
{
    if ((ini == fim) && (ini !=1))
       return 1;
    else
       return 0;
}

int Tfila :: insere(char Letra)
{
    if (verifica_cheia() == 1)
       return 0;
    else
        {
              if (verifica_vazia() == 1)
              {
                 ini = fim =0;
              }
              else
                  {
                     incrementa(fim);
                  }
    fila[fim] = Letra;
    }
    return 1;
}

char Tfila :: atende()
{
     char L;
     if (verifica_vazia() == 1)
        return '*';
     else
        {
               L = fila[ini];
               if (verifica_1_elemento() == 1)
                  {
                      ini = fim = -1;
                  }
               else
                  {
                      incrementa(&ini);
                  }
        return (L);
        }
}
 main (void)
{
	Tfila fila1, fila2, fila3;
	char letra;


		printf("\ndigite a  letra \n");
		scanf("%c", &letra);
		fila1.insere(letra); 
        printf("%c", fila1.atende());
	getch();
}
