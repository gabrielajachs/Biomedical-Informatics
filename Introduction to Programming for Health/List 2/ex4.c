/*4. Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera
fazer uma busca do valor de X no vetor lido e informar a posição em que foi
encontrado ou se não foi encontrado.*/

#include <iostream>
#include <cmath>

int main(){
    int vet[20];
    int x, found=0, position;
    
    cin = x;
    
    for (int i=0; i<20; i++)
    {
        if (vet[i] == x)
        {
            found = 1;
            position = i;
        }
    }
    
    if (found == 0)
    {
        printf ("Numero nao encontrado");
    }
    else{
        printf ("Numero encontrado na posicao ");
    }
}
