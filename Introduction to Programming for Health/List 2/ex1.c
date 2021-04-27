// 1. Crie um vetor de 12 posições de valores inteiros, insira aleatoriamente 12 valores
// inteiros neste vetor.
// Leia dois valores X e Y quaisquer correspondentes a duas posições
// no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas
// respectivas posições X e Y.

#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int vet[12], x, y, b, a, soma, i;
    
    for(i=0; i<12; i++){
        printf("Digite os dados do vetor:", vet[i+1]);
        scanf("%d", &vet[i]);
    }
    printf("Digite o numero da primeira posicao:");
    scanf("%d", &x);
    
    printf("Digite o numero da segunda posicao:");
    scanf("%d", &y);
    
    a = vet[x];
    b = vet[y];
    
    soma = a + b;
    
    printf("Resultado: %d\n", soma);
    
    return 0;
    
}
