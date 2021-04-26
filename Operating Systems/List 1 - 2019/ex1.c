#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

void main(){
	pid_t pid;
	pid = fork();

	if(pid == 0){
		printf("Eu sou o processo filho. Meu pid eh: %d\n", getpid());	
	}else if(pid > 0){
		printf("Eu sou o processo pai. Meu pid eh: %d\n", getpid());	
	}else{
		printf("Erro no fork.");
	}
}

