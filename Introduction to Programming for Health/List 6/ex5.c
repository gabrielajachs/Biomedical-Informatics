// Exercicio 5: Fa�a um programa em C para ler o nome
// de 10 pacientes e armazen�-los em um
// arquivo texto chamado pacientes.txt

#include <stdio.h>
#define P 10

    main(){
        char nome[30];
        int i;
        FILE *f;
        f = fopen("C:/Users/Pamela/Desktop/pacientes.txt","w");
        for(i=0;i<P;i++){
            printf("Insira o nome do paciente:\n");
            scanf("%s",&nome);
            fprintf(f,"Nome:%s\n",nome);
}

    fclose(f);
}
