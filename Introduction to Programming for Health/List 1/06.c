/*6. Faça um programa que receba as notas (n1,n2,n3) de 10 alunos e calcule a média de
 cada aluno.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
        struct aluno{
		char nome[50];
		double n1, n2, n3, media;
	};
	int i;
	struct aluno notas[10];
	

	for (i=1; i<=10; i++){
		printf("INFORME AS NOTAS DOS ALUNOS\n\n");
		printf("Aluno %i/10\n\n", i);
		printf("Informe o nome do aluno: ");
		scanf("%s", &notas[i].nome);
		printf("Informe a nota 1: ");
		scanf("%lf", &notas[i].n1);
		printf("Informe a nota 1: ");
		scanf("%lf", &notas[i].n2);
		printf("Informe a nota 1: ");
		scanf("%lf", &notas[i].n3);
		
		notas[i].media = ((notas[i].n1+notas[i].n2+notas[i].n3)/3);	
		system("cls");
		
	}
	printf("RELACAO DOS ALUNOS (Numero - Nome: Media)");
	for (i=1; i<=10; i++){
		printf("\n%i - %s: %.2lf", i, notas[i].nome, notas[i].media);	
	}
	
}
