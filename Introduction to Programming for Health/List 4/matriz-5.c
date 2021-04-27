// MATRIZES:
// Exercicio 5) Crie um algoritmo que leia uma matriz 3x3
// e crie uma segunda matriz que inverta as linhas e colunas
// da primeira matriz. Ex:

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    int M[3][3], MI[3][3];
	int i, j, trianguloInferior=1;

    //preenchendo a matriz 1 por leitura
  	printf("MATRIZ 1: \n");
    for (i=0; i<3; i++){
        for (j=0; j<3; j++){
            printf("\nInforme um número para linha %i | coluna %i: ", i, j);
            scanf("%i", &M[i][j]);
        }
    }

    //invertendo a matriz
    for (j=0; j<3; j++){
        for (i=0; i<3; i++){
            MI[j][i]=M[i][j];
        }
    }

	//imprimindo em forma de matriz
    printf("\n\n===== ELEMENTOS DA MATRIZ =====\n");
    for (i=0; i<3; i++){
        for(j=0; j<3; j++){
            printf("\t%i", M[i][j]);
        }
        printf("\n");
    }
    printf("\n\n===== ELEMENTOS DA MATRIZ INVERTIDA =====\n");
    for (i=0; i<3; i++){
        for(j=0; j<3; j++){
            printf("\t%i", MI[i][j]);
        }
        printf("\n");
    }

}
