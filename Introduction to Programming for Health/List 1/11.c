/*11. Faça um programa que peça ao usuário para digitar sua altura, leia o dado digitado e
 imprima o valor.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    
	double h;
	
	printf("Informe a sua altura: ");
	scanf("%lf", &h);
	
	printf("\n\nSua altura eh: %.2lf", h);
}
