/*10. Fa�a um programa para ler dois n�meros reais, fa�a a divis�o do primeiro n�mero pelo
 segundo (se o segundo for diferente de zero).*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    double n1, n2, total;

    printf("INFORME O DIVIDENDO: ");
    scanf("%lf", &n1);
    printf("INFORME O DIVISOR: ");
    scanf("%lf", &n2);

    if(n2==0){
        printf("\n NAO FOI POSSIVEL DIVIDIR POR 0");
    }else{
        total=n1/n2;
        printf("Total: %lf", total);
    }
}
