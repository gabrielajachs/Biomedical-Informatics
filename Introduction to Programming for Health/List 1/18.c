/*18. Escrever um algoritmo que leia o c�digo de um aluno e suas tr�s notas. Calcular a
 m�dia ponderada do aluno, considerando que o peso para a maior nota seja 4 e para
 as duas restantes, 3. Mostre o c�digo do aluno, suas tr�s notas, a m�dia calculada e
 uma mensagem �Aprovado� se a m�dia for maior ou igual a 5 e �reprovado� se a
 m�dia for menor que 5.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	
	char codigo[10];
	double n1, n2, n3, media, maior;
	
	printf("Informe o codigo do aluno: ");
	scanf("%s", &codigo);
	printf("Informe a N1: ");
	scanf("%lf", &n1);
	printf("Informe a N2: ");
	scanf("%lf", &n2);
	printf("Informe a N3: ");
	scanf("%lf", &n3);
	
	if (n1>n2 && n1>n3){
		media = ((n1*4)+(n2*3)+(n3*3))/10;
	} else if(n2>n1 && n2>n3){
		media = ((n1*3)+(n2*4)+(n3*3))/10;
	}else if (n3>n1 && n3>n2){
		media = ((n1*3)+(n2*3)+(n3*4))/10;
	}
	system("cls");
	if(media>=5){
		printf("Codigo do aluno: %s", codigo);
		printf("\nNota 1: %.2lf", n1);
		printf("\nNota 1: %.2lf", n2);
		printf("\nNota 1: %.2lf", n3);
		printf("\nMedia Ponderada: %.2lf", media);
		printf("\nSituacao: APROVADO!");
	}else{
		printf("Codigo do aluno: %s", codigo);
		printf("\nNota 1: %.2lf", n1);
		printf("\nNota 1: %.2lf", n2);
		printf("\nNota 1: %.2lf", n3);
		printf("\nMedia Ponderada: %.2lf", media);
		printf("\nSituacao: REPROVADO!");
	}
	
}
