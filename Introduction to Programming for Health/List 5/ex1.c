// Autora: Gabriela Jachs Stepien
// ExercÌcio 1: Escreva um programa que obtenha os valores de peso e
//altura do console, e os passe como parametro em uma
//funcao para o calculo e retorno do indice de Massa Corporal.

#include<stdio.h>
#include<stdlib.h>

void imc(float peso, float altura){
    
    float imc;
    imc = peso/(altura*altura);
    printf("O IMC eh: %f\n", imc);
}

int main(){
    
    float peso, altura;
    printf("Informe o seu peso: \n");
    scanf("%f", &peso);
    printf("Informe a sua altura: \n");
    scanf("%f", &altura);
    imc(peso, altura);
}

