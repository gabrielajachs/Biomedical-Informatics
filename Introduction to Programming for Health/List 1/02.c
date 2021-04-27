/*2. Calcular o IMC (índice de massa corpórea) de um indivíduo. 
 Obter o peso (P) em Kg e altura (A) em Metros do paciente e 
 calcular o IMC usando a fórmula IMC= P / A2. Se o
 resultado estiver entre 18,5 e 24,9, informe “peso ideal” , caso contrário informe
 “peso fora do ideal”.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    double peso, altura, imc;

    printf("Informe o seu peso: ");
    scanf("%lf", &peso);
    printf("Informe a sua altura: ");
    scanf("%lf", &altura);

    imc=peso/(altura*altura);

    if(imc>=18.5 && imc<=24.9 ){
    	printf("\n\nPESO IDEAL!");
	}else{
		printf("\n\nPESO FORA DO IDEAL!");
	}
}
