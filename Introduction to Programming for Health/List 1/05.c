/*5. Um posto de combustível vende três tipos de combustíveis: álcool, diesel e gasolina. O
 preço de cada litro dos combustíveis é apresentado na tabela abaixo. Faça um
 algoritmo que leia um caractere que representa o tipo de combustível comprado (a, d
 ou g) e a quantidade em litros. O algoritmo deve escrever o valor em reais a ser pago
 pelo combustível.
 Combustível Preço por Litro
 A – Álcool 2,489
 D – Diesel 1,589
 G – Gasolina 3,299*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    char tipo;
    double l, valor;

    printf("\nCOMBUSTIVEL - PRECO POR LITRO");
    printf("\nA - ALCOOL              R$2,489");
    printf("\nD - DIESEL              R$1,589");
    printf("\nG - GASOLINA            R$3,299");
    printf("\n\n\n");

    printf("INFORME O TIPO DE COMBUSTIVEL: ");
    scanf("%c", &tipo);

    if (tipo == 'a'){
        printf("INFORME A QUANTIDADE DE LITROS A SER ABASTECIDO: ");
        scanf("%lf", &l);

        valor = l*2.489;

        printf("\nALCOOL - TOTAL A PAGAR: R$%lf\n", valor);
    }else if (tipo == 'd'){
        printf("INFORME A QUANTIDADE DE LITROS A SER ABASTECIDO: ");
        scanf("%lf", &l);

        valor = l*1.589;

        printf("\nDIESEL - TOTAL A PAGAR: R$%lf\n", valor);
    }else if (tipo=='g'){
        printf("INFORME A QUANTIDADE DE LITROS A SER ABASTECIDO: ");
        scanf("%lf", &l);

        valor = l*3.299;

        printf("\nGASOLINA - TOTAL A PAGAR: R$%lf\n", valor);
    }else{
        printf("TIPO DE COMBUSTIVEL INVALIDO!");
    }


}
