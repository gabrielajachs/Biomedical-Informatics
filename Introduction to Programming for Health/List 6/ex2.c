// Autora: Gabriela Jachs Stepien
// Exercício 2: Implemente um registro ponto com dois campos x e y (reais).
// Os campos representam as coordenadas desse ponto no sistema cartesiano. Escreva uma função que, dados
// dois pontos, calcule a distância entre eles. As coordenadas dos pontos devem ser lidas no programa
// principal e passadas à função por meio de parâmetros do tipo ponto. O
// resultado da função deve ser informado pelo programa principal.

#include <stdio.h>
#include <math.h>

    struct ponto {
    float x, y;
};

    float dist(struct ponto p[2]) {
        return sqrt(pow((p[0].x-p[1].x), 2) + pow((p[0].y-p[1].y), 2));
}

main(){
    struct ponto p[2];
    printf("Insira coordenadas x e y: \n");
    scanf("%f%f", &p[0].x,&p[0].y);
    printf("Insira coordenadas x e y: \n");
    scanf("%f%f", &p[1].x,&p[1].y);
    printf("Distancia: %.2f", dist(p));
}
