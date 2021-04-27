/*1. Fazer a verificação se uma pessoa está apta a votar ou não, baseado em sua idade.
 Escrever o pseudocódigo.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    int idade;

    printf("Informe a sua idade: ");
    scanf("%i", &idade);

    if(idade < 16){
        printf("\nVoce nao possui idade para votar!");
    }else if (idade <18){
        printf("\nSeu voto eh facultativo!");
    }else{
        printf("\nVoce esta apto para votar!");
    }
}

