/*1. Fazer a verifica��o se uma pessoa est� apta a votar ou n�o, baseado em sua idade.
 Escrever o pseudoc�digo.*/

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

