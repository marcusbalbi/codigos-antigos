
#include "tpilha.h" // class's header file

#include <stdio.h>
#include <conio.h>

tpilha::tpilha()
{
                QTDE=0;
                torre[0]=0;
                torre[1]=0;
                torre[2]=0;

}

int tpilha::push(int x)
{
    if(QTDE==3)
    {
       return 0;
    }
    else
    { 
    torre[QTDE]=x;
    QTDE++;
    }
}

int tpilha::pop()
{
    if(QTDE==0)
    {
      return 0;
      }
      else
      {
          QTDE--;
          return 1;
      }
      
}

int tpilha::verifica_torre()
{
    if((torre[0])>(torre[1]) && (torre[1]>torre[2]))
    {
       return 1;
    }
    else
    {
        return 0;
    }
}

    
    
    
    
    
    
    
