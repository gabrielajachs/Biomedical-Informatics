/*15. Fazer um algoritmo que calcule e imprima o sal�rio reajustado de um funcion�rio de
 acordo com as seguintes regras:
 � Sal�rio de at� R$300,00 reajuste de 50%;
 � Sal�rio maiores que R$300,00 reajuste de 30%;*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	
	double salario;
	
	printf("Informe o salario em reais");
	scanf("%lf", &salario);
	
	if (salario<=300){
		salario=salario+(salario*0.50);
	}else{
		salario=salario+(salario*0.30);
	}
	
	printf("Salario reajustado: R$%.2lf", salario);
}
