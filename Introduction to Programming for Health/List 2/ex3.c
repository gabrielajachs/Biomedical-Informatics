/*3. Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos. Imprima
 o vetor original e depois o vetor obtido com a troca realizada.*/

#include <stdio.h>
#include <stdlib.h>

int main (){
    
    int vet[16], c, a, b;
    float mult=0;
    
    for (c=0;c<8;c++)
    {
        printf("Digite o valor da posicao %d- ", c+1);
        scanf("%d", &vet[c]);
    }
    
    printf("Os 8 primeiros valores sao\n");
    for (c=0;c<8;c++)
    {
        printf("--> %d \n",vet[0+c]);
    }
    printf("Os 8 ultimos sao \n");
    for(c=8;c>0;c--)
    {
        printf("--> %d \n",vet[16-c]);
    }
    
    
    printf("pause");
}
