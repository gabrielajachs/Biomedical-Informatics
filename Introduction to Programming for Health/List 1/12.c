/*12. Desenvolver um algoritmo que leia um n�mero inteiro e verifique se o n�mero �
 divis�vel por 5 e por 3 ao mesmo tempo.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int num;
	
	printf("Informe um numero: ");
	scanf("%i", &num);
	
	if (num%5==0 && num%3==0){
		printf("eh divisivel!");
	}else{
		printf("Nao eh divisivel!");
	}
}
