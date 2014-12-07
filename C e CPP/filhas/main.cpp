#include <stdio.h>
#include <conio.h>

class TFila
{
private:
	char letra[5];
	int ini, fim;
	void incrementa(int*ponteiro);

public:
       TFila::TFila()
{
	ini = fim = -1;
}

void TFila::incrementa(int*ponteiro)
{
	if(*ponteiro == 4)
	{
		*ponteiro = 0;
	}
	else
	{
		*ponteiro++;
	}
}

int TFila::verifica_vazia()
{
	if (ini == -1)
	{
		return(1);
	}
	else
	{
		return(0);
	}
}

int TFila::verifica_cheia()
{
	int aux;
	aux = fim;
	incrementa(&aux);

	if (aux == ini)
	{
		return(1);
	}
	else
	{
		return(0);
	}
}

int TFila:: insere(char x)
{
	if (verifica_vazia() == 1)
	{
		ini = fim = 0;
		letra[fim] = x;
		incrementa(&fim);
		return(1);
	}
	else
	{
		if(verifica_cheia() == 1)
		{
			return(0);
		}
		else
		{
			letra[fim] = x;
			incrementa(&fim);
			return(1);
		}
	}
};

int main()
{
	TFila filaA, filaB;

	int cont=0;

	while(filaA.verifica_cheia() == 1)
	{
		int posicao;
		char temp;
		posicao = cont + 1;
		printf("\n\nDigite uma letra da Fila A na %d posicao: ", posicao);
		scanf("%c", &temp);
		filaA.insere(temp);
		cont++;
	}
	getch();
}