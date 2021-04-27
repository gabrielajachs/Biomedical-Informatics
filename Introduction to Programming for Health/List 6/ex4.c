// Exercicio 4: Considere um registro cuja representação
// gráfica é dada a seguir:
// Os dados referentes aos funcionários de um hospital estão
// armazenados em um vetor em que cada elemento tem a forma
// de um registro como o representado acima. Considerando que
// o hospital tem, no máximo, 100 funcionários, construa um
// programa que execute as seguintes tarefas:
// 1) Preencha por leitura os dados de cinco funcionários do hospital;
// 2) Imprima os dados de um determinado funcionário, identificado
// pelo seu código.
// 3) Aumente o salário de um funcionário em 10%, identificando o
// funcionário pelo seu código.
// 4) Informe o número de funcionários homens e o de mulheres.
// 5) Informe a idade média dos funcionários.
// 6) Imprima os nomes, as idades e os salários de todas as
// funcionárias mulheres.


#include <stdio.h>
#define F 100

    struct funcionario {
    int cod,idade;
    float sal;
    char sexo;
};

main(){
    struct funcionario f[F];
    int i, aux, cm=0, ch=0, mi=0;

    for(i=0;i<5;i++){
        printf("Insira o codigo do funcionario:\n");
        scanf("%i",&f[i].cod);

        printf("Insira o sexo do funcionario(M/F):\n");
        fflush(stdin);
        scanf("%c",&f[i].sexo);

        printf("Insira o idade do funcionario:\n");
        scanf("%i",&f[i].idade);

        printf("Insira o salario do funcionario:\n");
        scanf("%f",&f[i].sal);
    }
    printf("Insira um codigo para busca:\n");
    scanf("%i",&aux);
    for(i=0; i<F; i++){
        if(f[i].cod==aux){
            printf("cod:%d\nsexo:%c\nidade:%d\nsalario:%.2f\n",f[i].cod,f[i].sexo,f[i].idade,f[i].sal);
        }
    }
    printf("Insira um codigo para aumentar o salario:\n");
    scanf("%i",&aux);
    for(i=0;i<F;i++){
        if(f[i].cod==aux){
            f[i].sal = f[i].sal + (f[i].sal*0.1);
            printf("cod:%d\nsexo:%c\nidade:%d\nsalario:%.2f\n",f[i].cod,f[i].sexo,f[i].idade,f[i].sal);
        }
    }
    for(i=0;i<F;i++){
        if(f[i].sexo=='F' || f[i].sexo=='f'){
            cm++;
        }
        if(f[i].sexo=='M' || f[i].sexo=='m'){
            ch++;
        }
    }
    printf("Numero de mulheres:%i\nnumero de homens:%i\n",cm,ch);
    aux = 0;
    for(i=0;i<F;i++){
        if(f[i].idade<=200){
            mi = mi + f[i].idade;
            aux++;
        }
    }
    mi = mi/aux;
    printf("Media de idade:%i",mi);
    for(i=0;i<F;i++){
        if(f[i].sexo=='F' || f[i].sexo=='f'){
            printf("cod:%d\nsexo:%c\nidade:%d\nsalario:%.2f\n",f[i].cod,f[i].sexo,f[i].idade,f[i].sal);
        }
    }
}
