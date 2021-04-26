#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<sys/types.h>

int varGlobal;

int main(){
	pid_t pid;
	varGlobal = 8;

	pid = fork();

	if(pid > 0){
		printf("Eu sou o processo pai. A variavel que eu recebi foi: %d \n", varGlobal);
		varGlobal = 28;
		printf("A variavel global foi trocada para: %d \n", varGlobal);			
	}else if(pid == 0){
		sleep(3);
		printf("Eu sou o processo filho. A variavel global que eu recebi foi: %d \n", varGlobal);
		varGlobal = 5;
		printf("A variavel global foi trocada para: %d \n", varGlobal);
	}else {
		printf("Erro no fork.");
	}
	return 0;
}
