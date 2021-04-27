// Autora: Gabriela Jachs Stepien
// Exercício 1:  Implemente um registro que descreva os veículos de uma determinada montadora, utilizando os campos a seguir:
// marca, ano de fabricação, cor, preço.
// a. Escreva um programa com o registro Carro;
// b. Atribua valores aos campos;
// c. Imprima na tela um relatório com os dados entrados.


#include <stdio.h>

    struct Carro {
    char marca[30], cor[15];
    int ano;
    float preco;
}
    main(){
        struct Carro c;
            printf("Insira marca do carro: \n");
            scanf("%s", &c.marca);
            printf("Insira cor do carro: \n");
            scanf("%s", &c.cor);
            printf("Insira ano do carro: \n");
            scanf("%i", &c.ano);
            printf("Insira preco do carro: \n");
            scanf("%f", &c.preco);
            printf("Carro:\n marca: %s \n cor: %s \n ano: %i \n preco: %.2f", c.marca, c.cor, c.ano, c.preco);
}
