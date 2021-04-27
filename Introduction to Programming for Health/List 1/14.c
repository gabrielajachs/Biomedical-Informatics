/*14. Desenvolver um algoritmo para ler um número “x” e calcular e imprimir o valor de “y”
 de acordo com as condições abaixo:
 
 y = x , se x < 1;
 y = 0 , se x = 1;
 y = x2 , se x > 1;*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int x, y;
	
	printf("Informe um numero inteiro: ");
	scanf("%i", &x);
	
	if (x<1){
		y=x;
	}else if (x==1){
		y=0;
	}else{
		y=x*x;
	}
	
	printf("\n\nX = %i || Y = %i", x, y);
}
