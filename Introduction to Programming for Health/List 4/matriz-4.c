// MATRIZES:
// Exercicio 4) Crie um algoritmo que leia duas matrizes 2x5
// e crie uma terceira matriz também 2x5 com o
// valor da soma dos elementos de mesmo índice. Ex:
#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    int M1[5][2], M2[5][2], M3[5][2], i, j;

    //preenchendo a matriz 1 por leitura
  	printf("MATRIZ 1: \n");
    for (i=0; i<5; i++){
        for (j=0; j<2; j++){
            printf("\nInforme um número para linha %i | coluna %i: ", i, j);
            scanf("%i", &M1[i][j]);
        }
    }
    printf("\n\nMATRIZ 2:\n");

     //preenchendo a matriz 2 por leitura
    for (i=0; i<5; i++){
        for (j=0; j<2; j++){
            printf("\nInforme um número para linha %i | coluna %i: ", i, j);
            scanf("%i", &M2[i][j]);
        }
    }
	    //imprimindo em forma de matriz
    printf("\n\n===== ELEMENTOS DA MATRIZ 1 =====\n");
    for (i=0; i<5; i++){
        for(j=0; j<2; j++){
            printf("\t%i", M1[i][j]);
        }
        printf("\n");
    }

    printf("\n\n===== ELEMENTOS DA MATRIZ 2 =====\n");
    for (i=0; i<5; i++){
        for(j=0; j<2; j++){
            printf("\t%i", M2[i][j]);
        }
        printf("\n");
    }

    printf("\n\n======= SOMA DAS MATRIZES ==========\n");
    for (i=0; i<5; i++){
        for (j=0; j<2; j++){
            M3[i][j]=M1[i][j]+M2[i][j];
        }
    }

    printf("\n\n===== ELEMENTOS DA MATRIZ 3 (SOMA DA MATRIZ 1 E 2) =====\n");
    for (i=0; i<5; i++){
        for(j=0; j<2; j++){
            printf("\t%i", M3[i][j]);
        }
        printf("\n");
    }
}
