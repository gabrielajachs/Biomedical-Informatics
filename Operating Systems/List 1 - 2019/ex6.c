#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(){
	char escreveMsg[50];
	char leMsg[50];

	pid_t pid;
	int pipefds[2];

	if(pipe(pipefds) == -1){
		printf("Erro ao criar o pipe.");
		return 1;		
	}

	pid = fork();

	if(pid == 0){
		sleep(5);
		printf("Eu sou o processo filho.\n");
		read(pipefds[0], leMsg, sizeof(leMsg));
		printf("A mensgaem recebida pelo filho foi: %s",leMsg);

	}else if(pid > 0){
		printf("Eu sou o processo pai.\n");
		printf("Escreve a mensagem deseja para para ser passada ao filho.\n");
		scanf("%s",escreveMsg);
		write(pipefds[1], escreveMsg, sizeof(escreveMsg));
	}else{
		printf("Erro no fork");
	}
}