// MATRIZES:
// Exercicio 2) Crie um algoritmo que verifique se uma matriz é
// triangular superior. Uma matriz é triangular superior se todos
// os elementos abaixo da diagonal principal são iguais a 0.

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    int M[5][5]={1,2,5,1,4,0,2,4,2,3,0,0,2,3,7,0,0,0,4,9,0,0,0,0,1};
	int i, j, trianguloSuperior=1;

    // preenchendo a matriz 1 por leitura
  	printf("MATRIZ 1: \n");
    for (i=0; i<5; i++){
        for (j=0; j<5; j++){
            printf("\nInforme um número para linha %i | coluna %i: ", i, j);
            scanf("%i", &M1[i][j]);
        }
    }

	//imprimindo em forma de matriz
    printf("\n\n===== ELEMENTOS DA MATRIZ =====\n");
    for (i=0; i<5; i++){
        for(j=0; j<5; j++){
            printf("\t%i", M[i][j]);
        }
        printf("\n");
    }
    for (i=0; i<5; i++){
    	for (j=0; j<5; j++){
    		if(i>j && M[i][j]!=0){
    			trianguloSuperior=0;
			}
		}
	}

	if(trianguloSuperior){
		printf("\nMATRIZ TRIANGULAR SUPERIOR!");
	}else{
		printf("\nNÃO É UMA MATRIZ TRIANGULAR SUPERIOR!");
	}
}
