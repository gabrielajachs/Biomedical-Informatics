// Autora: Gabriela Jachs Stepien
// Exercício 3: Escreva um programa de agenda de
// telefones. Para cada pessoa, devem ser
// declarados os seguintes dados:
// nome
// e-mail (possibilidade de adicionar DOIS);
// telefone (possibilidade de adicionar DOIS).
// O programa deve fazer a leitura dos dados e
//imprimí-los na tela.*/


#include <stdio.h>
#include <string.h>

    struct agenda {
    char nome [40];
    char email [2][50];
    char telefone [2][20];
};

    int main () {

        printf ("Digite o nome de um contato: \n");
        scanf ("%s", &agenda.nome);
        printf ("Digite o email: \n");
        scanf ("%d/%d/%d", &agenda.email);
        printf ("Digite o telefone: \n");
        scanf ("%s", &agenda.telefone);
