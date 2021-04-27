// MATRIZES:
// Exercicio 3) Crie um algoritmo que verifique se uma matriz
// é triangular inferior. Uma matriz é triangular inferior se
// todos os elementos acima da diagonal principal são iguais a 0.

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    int M[5][5]={1,0,0,0,0,3,2,0,0,0,4,1,2,0,0,5,5,2,4,0,1,2,4,5,1};
	int i, j, trianguloInferior=1;

    //preenchendo a matriz 1 por leitura
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
    		if(i<j && M[i][j]!=0){
    			trianguloInferior=0;
			}
		}
	}

	if(trianguloInferior){
		printf("\nMATRIZ TRIANGULAR INFERIOR!");
	}else{
		printf("\nNÃO É UMA MATRIZ TRIANGULAR INFERIOR!");
	}

}
