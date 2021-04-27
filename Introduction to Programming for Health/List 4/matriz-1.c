// MATRIZES:
// Exercicio 1) Crie um algoritmo que calcule a soma dos valores da diagonal principal
// de uma matriz 5x5, e imprima estes valores.
// Veja a diagonal principal da matriz destacada no exemplo abaixo:

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    int M[5][5], i, j, soma=0;

    //preenchendo a matriz por leitura
    for (i=0; i<5; i++){
        for (j=0; j<5; j++){
            printf("\nDigite um número para linha %i | coluna %i: ", i, j);
            scanf("%i", &M[i][j]);
        }
    }

	    //imprimindo em forma de matriz
    printf("\n\n===== ELEMENTOS DA MATRIZ =====\n");
    for (i=0; i<4; i++){
        for(j=0; j<4; j++){
            printf("\t%i", M[i][j]);
        }
        printf("\n");
    }

	//somaos valores da diagonal principal
    for(i=0; i<4; i++){
       soma=soma+M[i][i];
    }
    printf("\n\nSOMA DOS ELEMENTOS DA DIAGONAL PRINCIPAL: %i", soma);
}
