#include<stdio.h>
#include<sys/types.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>

int main(int argc, char *argv[]){
	char *path;
	char *fileName;
	path = argv[1];
	fileName = argv[2];
	pid_t pid;
	pid = fork();

	if(pid == 0){
		printf("Eu sou o processo filho. Meu pid eh: %d \n", getpid());
		execl(path, fileName, NULL);	
	}else if(pid > 0 ){
		printf("Eu sou o processo pai. \n");
	}else{
		printf("Erro no fork. \n");
	}

	return 0;
}