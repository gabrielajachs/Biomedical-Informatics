/*19. Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicando se
 este número é par ou impar, se é positivo ou negativo.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int num;
	
	printf("Digite um numero: ");
	scanf("%i", &num);
	
	if (num>=0){
		if (num%2==0){
			printf("O numero eh PAR e eh POSITIVO!");
		}else{
			printf("O numero eh IMPAR e eh POSITIVO!");
		}
	}else{
		if(num%2==0){
			printf("O numero eh PAR e eh NEGATIVO!");
		}else{
			printf("O numero eh IMPAR e eh NEGATIVO!");
		}
	}
}
