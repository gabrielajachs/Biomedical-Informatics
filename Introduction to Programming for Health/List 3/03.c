/*3) Crie um programa que calcule a formula de Friedwald (LDL) de uma pessoa sabendo que a formula é
 LDL = CT - HDL - (TG/5)
 
 Onde CT = Colesterol Total
 HDL = ìHDL-Colesterolî
 TG = TriglicerÌdeos
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){
    float ct, hdl, tg, ldl;
    
    printf("\nInforme o Coleterol Total: ");
    scanf ("%f", &ct);
    printf ("\nInforme o HDL - Colesterol: ");
    scanf ("%f", &hdl);
    printf ("\nInforme o TG - Triglicerideos: ");
    scanf ("%f", &tg);
    
    ldl = ct - hdl - (tg/5);
    
    printf("\nO resultado do LDL eh: %f \n\n", ldl);
}
