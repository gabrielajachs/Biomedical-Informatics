/*11. Fa�a um programa que pe�a ao usu�rio para digitar sua altura, leia o dado digitado e
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
