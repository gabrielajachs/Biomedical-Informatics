/*17. Implementar um algoritmo capaz de encontrar o maior dentre 3 nœmeros quaisquer.
 Suponha todos serem distintos.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	double a, b, c;
	
	printf("Informe o valor de A: ");
	scanf("%lf", &a);
	printf("Informe o valor de B: ");
	scanf("%lf", &b);
	printf("Informe o valor de C: ");
	scanf("%lf", &c);

	if (a>b && a>c){
		printf("O maior valor eh: %lf", a);
	}else if (b>a && b >c){
		printf("O maior valor eh: %lf", b);
	}else{
		printf("O maior valor eh: %lf", c);
	}
}
