/*3. Verificar se um aluno est‡ aprovado (mŽdia aritmŽtica das 3 notas >= 7.0) ou
 reprovado.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    double n1, n2, n3, media;

    printf("Informe a Nota 1: ");
    scanf("%lf", &n1);
    printf("Informe a Nota 2: ");
    scanf("%lf", &n2);
    printf("Informe a Nota 3: ");
    scanf("%lf", &n3);

    media = (n1+n2+n3)/3;

    if(media>=7.0){
        printf("Aluno aprovado com media %lf!", media);
    }else{
        printf("Aluno reprovado com media %lf!", media);
    }

}
