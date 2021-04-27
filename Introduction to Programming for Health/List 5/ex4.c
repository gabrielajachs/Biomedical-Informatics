// Autora: Gabriela Jachs Stepien
// Exercicio 4: Escreva um programa que faca a leitura de um numero do
// console e imprima na tela a tabuada desse numero por
// meio de um procedimento.


#include <stdio.h>

    void tabu (int i, int x) {
    
        for(i=0; i<=10; i++){
            printf("%d x %d = %d \n", x, i, i*x);
    }
}

    int main () {
        int i, x;
        printf("Digite um numero para realizar a tabuada: \n");
        scanf ("%d", &x);
        tabu(i, x);
    return 0;
}
