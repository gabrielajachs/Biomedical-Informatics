/*5) Crie um programa que calcula a Pressao Arterial Media de uma pessoa sabendo que a formula para o calculo é
 PAM = ((2 * PAD) + PAS)/3
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    float pam, pad, pas;
    
    printf("\nInforme a Pressao Arterial Sistolica: ");
    scanf ("%f", &pas);
    printf ("\nInforme a Pressao Arterial Diastolica: ");
    scanf ("%f", &pad);
    
    pam = ((2*pad) + pas)/3;
    
    printf("\nO resultado da Pressao Arterial Media eh: %f \n\n", pam);
}
