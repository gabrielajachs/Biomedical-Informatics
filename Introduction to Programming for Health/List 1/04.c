/*4. Fa�a um algoritmo para verificar se um n�mero inteiro qualquer � positivo, negativo
 ou nulo (zero).*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    int num;

    printf("Informe um numero: ");
    scanf("%i", &num);

    if(num<0){
        printf("O numero %i eh NEGATIVO!", num);
    }else if(num>0){
        printf("O numero %i eh POSITIVO!", num);
    }else{
        printf("O numero %i eh NULO!", num);
    }

}
