#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>


int main (){

	int i;
	pid_t pid;

	pid = fork();
	if (pid < 0 ){
		printf ("Erro no fork()\n");
		exit(-1); // quando o pid for menor que zero, vai dar um erro, pra poder
		// terminar aqui

	}else if (pid == 0){
		printf("Eu sou o processo filho, com pid= %d\n", pid);
		printf("O valor herdado do pai eh: %d \n", i);
		exit (0); // para dizer que terminou com sucesso

	}else {
		printf("Eu sou o processo pai, com pid= %d\n", pid);
		printf("O valor herdado: %d \n", i);
	}
	return 0;

}


// depois de fazer tudo, colocar no terminal pra compilar o arquivo
// gcc exercicio2.c -o exercicio2

// Exercicio2:
// são tres opcoes que podem acontecer no pid, ele pode ser menor que zero
// ou seja, ele não conseguiu fazer um fork, e se ele conseguiu fazer um fora,
// então tu ja vai ter dois processos: um if e um else. 2 processos que estão
// sendo gerados
// depois que colocar no terminal o gcc, colocar o seguinte
// ./exercicio2

