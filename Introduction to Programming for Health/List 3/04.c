/*4) Crie um programa que calcula o Ìndice HOMA-IR de uma pessoa diabética, sabendo que a formula para o calculo é
 IR= (insulina jejum x glicose jejum) / 22,5
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    float ir, insulina, glicose;
    
    printf("\nInforme a insulina em jejum: ");
    scanf ("%f", &insulina);
    printf ("\nInforme a glicose: ");
    scanf ("%f", &glicose);
    
    ir = (insulina * glicose) / 22.5;
    
    printf("\nO resultado do IR eh: %f \n\n", ir);
}
