/*9. Faça um programa que imprima os n termos da sequência de Fibonacci
 (0,1,1,2,3,5,8,13,21,...)*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    int a, b, soma, i;

    a=1;
    b=0;
    //eu escolhi definir 20 loops
    for (i=0; i<20; i++){
      printf(" %i ", b);

      soma = a+b;
      a = b;
      b = soma;


    }


}
