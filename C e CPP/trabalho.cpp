/*feito por Marcus Balbi dia 17/10/08*/
#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include <conio.h>
#define TAM 5 //definição do tamanho da matriz
int main()
{
    int A [TAM][TAM];  
    int somal[TAM]={0,0};  //soma as linhas
    int somac[TAM]={0,0};  //soma as colunas
    int somadp=0;  //soma a diagonal primcipal
    int B[TAM][TAM]; //matriz transposta de A
    int i, j;  // contador de linha e coluna
    
    for(i=0;i<TAM;i++)  //pegando dados do usuario
    {
       for(j=0;j<TAM;j++)
       {
          printf("digite o valor A[%d][%d]:\n", i, j);
          scanf("%d",&A[i][j]);
       }
    }
    system("CLS");  //limpa a tela(obs:nao sei se compila em todos os compiladores,testei no DEV C++ 4.9.9.2
    
    for(i=0;i<TAM;i++) //somatorio das linhas
    {
       for(j=0;j<TAM;j++)
       {
          
         somal[i]+=A[i][j];
       }
       printf("o somatorio da linha %d: %d  \n",i+1, somal[i]);
     }
     for(j=0;j<TAM;j++) //somatorio da coluna
    {
       for(i=0;i<TAM;i++)
       {
          
         somac[j]+=A[i][j];
       }
       printf("o somatorio da coluna %d: %d  \n",j+1, somac[j]);
    }
    for(i=0;i<TAM;i++) //somatorio da diagonal principal
     {
       somadp+=A[i][i];
     }
      printf("o somatorio da Diagonal principal: %d  \n",somadp);
      
     for(i=0;i<TAM;i++) //faz A transposta em B
    {
       for(j=0;j<TAM;j++)
       {
         B[i][j]=A[j][i];
       }
    }
    printf("Matriz A transposta:\n");
    
    for(i=0;i<TAM;i++) //exibe A transposta (B)
    {
       for(j=0;j<TAM;j++)
       {
          printf("%d  ",B[i][j]);
               
       }
       printf("\n");
       }
        for(i=0;i<TAM;i++)  //verifica se é simetrica
    {
       for(j=0;j<TAM;j++)
       {
       if (B[i][j]!=A[i][j]) //caso o segundo valor testado for diferente ela ja nao é
       {                        //simetrica.pois o primeiro semre vai ser igual.
       printf("nao simetrica");
       getch();
       return(0);
       }
    }
 }
            printf("matriz simetrica");
            getch();
    
    
    
}
