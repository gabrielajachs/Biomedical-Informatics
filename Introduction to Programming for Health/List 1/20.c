/*20. O nœmero 3025 possui a seguinte caracter’stica:
 30 + 25 = 55
 552 = 3025
 Fazer um algoritmo que dado um nœmero de 4 d’gitos calcule e escreva se este
 nœmero possui ou n‹o tal caracter’stica.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	
	int num, ab, cd, sum, squared;
	  
	  printf("Informe um numero inteiro de 4 digitos: ");
	  scanf("%i", &num);

		ab=num/100; //vai sobrar os dois primeiros numeros
		cd=num%100; //vai ficar os dois ultimos numeros
		sum=ab+cd; 
		squared=sum*sum;
		if (squared == num){
			printf("POSSUI A CARACTERISTICA\n\n");
			printf("%i+%i = %i", ab, cd, sum);
			printf("\n%i² = %i", sum, squared);
		} else {
			printf("NAO POSSUI A CARACTERISTICA\n\n");
			printf("%i+%i = %i", ab, cd, sum);
			printf("\n%i² = %i", sum, squared);
		}
	
}
