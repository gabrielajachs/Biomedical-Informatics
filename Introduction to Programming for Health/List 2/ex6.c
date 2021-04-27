/*6. Crie dois vetores de 20 posições e leia seus valores, crie um terceiro vetor contendo,
 nas posições pares os valores do primeiro e nas posições impares os valores do
 segundo.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int vetor[20], i, somap=0, somai=0;

    for (i=0; i<20; ++i){
        printf("Digite a %d posicao: ",i);
        scanf("%d", &vetor[i]);

        if((vetor[i] % 2)==0)
            somap+=vetor[i];
    }else{
        somai+=vetor[i];
    }

    for(i=0; i<20; ++i){
        printf("O valores e: %d\n",vetor[i]);
    }
    
    printf("A soma dos numeros impar e: %d\n", somai);
    printf("A soma dos numeros par e: %d\n", somap);
    
system("pause");
}
