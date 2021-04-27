/*12. Desenvolver um algoritmo que leia um nœmero inteiro e verifique se o nœmero Ž
 divis’vel por 5 e por 3 ao mesmo tempo.*/

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
