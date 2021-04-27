/*8. Assumindo que a média de aprovação é 7.0, calcule quantos alunos passaram e
 quantos alunos foram reprovados.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main(){
	
	struct aluno{
		char nome[50], situacao[10];
		double n1, n2, n3, media;
	};
	int i, aprovados, reprovados;
	double maior, menor;
	struct aluno notas[10];
	
	aprovados = 0;
	reprovados = 0;

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
		
		if (notas[i].media>=7){
			strcpy(notas[i].situacao , "Aprovado");
			aprovados++;
		}else{
			strcpy(notas[i].situacao , "Reprovado");
			reprovados++;
		}
		
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
	
	printf("RELACAO DOS ALUNOS (Numero - Nome: Media [Situacao])\n");
	
	for (i=1; i<=10; i++){
		printf("\n%i - %s: %.2lf [%s]", i, notas[i].nome, notas[i].media, notas[i].situacao);	
	}
	
	printf("\n\nAlunos Aprovados: %i || Alunos Reprovados: %i", aprovados, reprovados);
	printf("\n\nMenor: %.2lf || Maior: %.2lf", menor, maior);
	
}
