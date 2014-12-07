#include <stdio.h>
#include <conio.h>
#define TAM 3  //tamanho das torres

int torre1[TAM],torre2[TAM],torre3[TAM];
int topo;
int push (int *torre, int disco)  //função de pilha para inserir um disco na torre
{
    if(topo>=TAM)
    return 0; //torre cheia impossivel inserir
    
    torre[topo]=num;    //a torre recebe o disco
    topo++;
    
}

int pop(int *torre)
{
    if(topo<=0)
    {
        return -1; //torre vazia nao tem como tirar
    }
    
    torre
    
    
    
