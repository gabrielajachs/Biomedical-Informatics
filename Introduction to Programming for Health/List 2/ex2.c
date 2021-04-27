/* 2. Declare um vetor de 07 posições e o preencha com os 07 primeiros números impares e
imprima os valores do vetor da seguinte maneira:
Posição 1 do vetor =1
Posição 2 do vetor =3....
Posição 7 do vetor =13 */

int main(){
    
    int tamPar, tamImpar, i, vetDigitado[7],vetPar[7],vetImpar[7];
    tamPar=0;
    tamImpar=0;
    
    for(i=0;i<7;i++){
        printf("\nDigite o %d.o numero: ", i+1);
        scanf("%d%*c", &vetDigitado[i]);
        
        if(vetDigitado[i] % 2 == 0){
            vetPar[i]=vetDigitado[i];
            tamPar++;
        }
        
        else{
            vetImpar[i]=vetDigitado[i];
            tamImpar++;
        }
    }
    
    for(i=0; i<tamPar; i++){
        printf("\nVetor Par: %d \n", vetPar[i]);
    }
    for(i=0; i<tamImpar; i++){
        printf("\nVetor Impar: %d \n", vetImpar[i]);
    }
    return 0;
}
