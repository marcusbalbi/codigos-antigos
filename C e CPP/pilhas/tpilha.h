#ifndef TPILHA_H
#define TPILHA_H
#include <conio.h>

class tpilha
{
	private:
		int torre[2];
		int QTDE;
		public:
         int push(int x);
		tpilha();
		int pop();
		int verifica_torre();
};

#endif // TPILHA_H
