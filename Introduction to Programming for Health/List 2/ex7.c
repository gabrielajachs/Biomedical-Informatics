/*7. Leia um vetor de 10 posições e verifique se existem valores iguais. Informe o número
 de valores iguais que foram encontrados neste vetor!*/

#include <stdio.h>
#include <stdlib.h>

int main(){

    int vet[10], i, j;

    for (i=0; i<10; i++){
            printf ("\n Digite um n˙mero inteiro para a posiÁ„o %d do vetor: \n", i);
            scanf ("%d", &vet);
    }

    for(i=0; i<10; i++){
        for (j=i; j<11; j++){
            if (vet == vet[j+1]){
                printf("\n Temos um n˙mero repetido no vetor: %d \n", (vet));
            }else{
                printf("\t ");

            }
        } return 0;
    }

