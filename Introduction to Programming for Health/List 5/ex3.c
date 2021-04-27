// Autora: Gabriela Jachs Stepien
// Exercicio 3: Escreva um programa que utilize uma funcao para o
// calculo do fatorial de um numero.

#include <stdio.h>
#include <stdlib.h>

    void fatorial(int fat){
        int fatorial=1, i = 1;
            for(i=1; i<=fat; i++){
                fatorial = fatorial * i;
    }
    printf("O fatorial e: %d \n", fatorial);
}

    int main(){
        int fat;
        printf("Digite um numero para fazer o fatorial: \n");
        scanf("%d", &fat);
        fatorial(fat);
}
