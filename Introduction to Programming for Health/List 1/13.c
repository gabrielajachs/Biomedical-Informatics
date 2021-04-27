/*13. Dados quatro números distintos, desenvolver um algoritmo que determine e imprima
 a soma dos três menores.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
	
	double n1, n2, n3, n4, soma;
	
	printf("Digite o primeiro valor: ");
	scanf("%lf", &n1);
	printf("Digite o segundo valor: ");
	scanf("%lf", &n2);
	printf("Digite o terceiro valor: ");
	scanf("%lf", &n3);
	printf("Digite o quarto valor: ");
	scanf("%lf", &n4);
	
	if (n1<n4 && n2<n4 && n3<n4){
		soma = n1+n2+n3;
	}else if(n1<n3 && n2<n3 && n4<n3){
		soma=n1+n2+n4;
	}else if(n1<n2 && n3<n2 && n4<n2){
		soma=n1+n3+n4;
	}else if(n2<n1 && n3<n1 && n4<n1){
		soma=n2+n3+n4;
	}
	
	printf("%lf", soma);
}
