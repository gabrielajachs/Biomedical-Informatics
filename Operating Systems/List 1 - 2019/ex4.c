#include<stdio.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<stdlib.h>
#include<unistd.h>

int main(int argc, char *argv[]){
	int N = atoi(argv[1]);
	pid_t pid;
	pid = fork();

	if(pid == 0){
		printf("Eu sou o processo filho \n");
		for(int i = 1; i <= N; i++){
			printf("no: %d \n", 2*i);		
		}	
	}else if(pid > 0 ){
		printf("Eu sou o processo pai. \n");
		wait(NULL);
		printf("Meu filho terminou. Logo eu vou terminar.\n");
	}else{
		printf("Erro no fork. \n");
	}

	return 0;
}