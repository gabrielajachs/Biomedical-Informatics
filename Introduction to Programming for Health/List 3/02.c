/*2) Crie um programa que calcule a ·rea de um cÌrculo, sabendo que a formula para o calculo é
 A = 3.1415 * RAIO2
 
 DICA: #include <math.h>
 float raio = 3; \
 float area = pow(raio, 2);*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    float raio = 3;
    float area = powf(raio, 2);
    
    printf("\nInforme o raio de uma circunferência: ");
    scanf("%f", &raio);
    
    area = 3.14 * (raio * raio);
    
    printf("\nA area da circunferencia eh: %f \n\n", area);

    
}
