/*1) Crie um programa que calcule o IMC de uma pessoa, sabendo que a formula para o calculo é
 IMC = PESO / (ALTURA * ALTURA)*/

#include <stdio.h>
#include <stdlib.h>

int main (){
    
    double altura, imc, peso;
    
    printf ("Digite o seu peso: ");
    scanf ("%lf", &peso);
    printf ("Digite a sua altura: ");
    scanf ("%lf", &altura);
    
    imc = peso / (altura*altura);
    
    printf ("O IMC eh: %2lf ", imc);
    
}
