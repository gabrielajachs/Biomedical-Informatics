// Exercicio 6: Faça um programa para leitura de cinco
// elementos de um vetor de carros (conforme
// questão 1, e grave os dados em um arquivo
// chamado locadora.txt.

#include <stdio.h>
#define C 5

    struct Carro{
    char marca[30],cor[15];
    int ano;
    float preco;

};

    main(){
        int i;
        struct Carro c[C];
        FILE *f;
        f = fopen("C:/Users/Pamela/Desktop/locadora.txt","w");
            for(i=0;i<C;i++){
                printf("Insira marca do carro:\n");
                scanf("%s",&c[i].marca);

                printf("Insira cor do carro:\n");
                scanf("%s",&c[i].cor);

                printf("Insira ano do carro:\n");
                scanf("%i",&c[i].ano);

                printf("Insira preco do carro:\n");
                scanf("%f",&c[i].preco);

        fprintf(f,"Carro: \n marca: %s \n cor: %s \n ano: %i \n preco: %.2f \n", c[i].marca, c[i].cor, c[i].ano, c[i].preco);
}
    fclose(f);
}
