/*16. Fazer um algoritmo que dado três valores A, B e C verificar se eles formam um
 triângulo. Formando triângulo, dizer se é triângulo equilátero, isósceles ou escaleno.*/

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
	
	if (a==b && b==c){ //TODOS OS LADOS IGUAIS
		printf("Triangulo Equilatero!");
	}else if (a!=b && b!=c && c!=a){ //TODOS OS LADOS DIFERENTES
		printf("Triangulo Escaleno!");
	}else{ //DOIS LADOS IGUAIS
		printf("Triangulo Isosceles!");
	}
}
