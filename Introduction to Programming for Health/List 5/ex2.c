// Autora: Gabriela Jachs Stepien
// Exercicio 2: Escreva um programa que verifique por meio de uma
//funcao quando um numero é primo (ou nao).

#include <stdio.h>

void primo (int numero) {
    
    int divisores = 0;
    int i;
    
    for (i = 1; i <= numero ; i++){
        if (numero % i ==0){
            divisores = divisores + 1;
        }
    }
    
    if (divisores > 2){
        printf ("O numero informado nao eh primo! \n");
    }else{
        printf ("Eh primo! \n");
    }
}


int main(){
    int valor;
    
    printf("Informe o numero: \n");
    scanf ("%d", &valor);
    
    primo(valor);
    
return 0;
}
