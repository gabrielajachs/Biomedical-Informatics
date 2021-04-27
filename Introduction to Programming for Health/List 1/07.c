/*7. Aprimore o programa anterior, calcule também a maior e menor média da turma.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	
	struct aluno{
		char nome[50];
		double n1, n2, n3, media;
	};
	int i;
	double maior, menor;
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
	
	//calculo da menor e maior media
	for (i=1; i<=10; i++){
		if (i==1){
			maior = notas[i].media;
			menor = notas[i].media;
		}else{
			if(notas[i].media>maior){
				maior = notas[i].media;
			}else if (notas[i].media<menor){
				menor = notas[i].media;
			}
		}	
	}
	
	printf("RELACAO DOS ALUNOS (Numero - Nome: Media)");
	
	for (i=1; i<=10; i++){
		printf("\n%i - %s: %.2lf", i, notas[i].nome, notas[i].media);	
	}
	
	printf("\n\nMenor: %.2lf || Maior: %.2lf", menor, maior);
	
}
