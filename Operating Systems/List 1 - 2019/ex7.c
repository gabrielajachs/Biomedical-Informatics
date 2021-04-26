#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<stdlib.h>

int main(){
	char escreveMsg[50];
	char leMsg[50];

	pid_t pid;
	int pipefds[2];

	if(pipe(pipefds) == -1){
		printf("Erro ao criar pipe.\n");
		return 1;
	}
	
	pid = fork();

	if(pid == 0){
		printf("Eu sou o processo filho. \n");
		printf("Escreve a mensagem deseja para para ser passada ao pai.\n");
		scanf("%s",escreveMsg);
		write(pipefds[1], escreveMsg, sizeof(escreveMsg));
	} else if(pid > 0){
		sleep(5);
		printf("Eu sou o processo pai. \n");
		read(pipefds[0], leMsg, sizeof(leMsg));
		printf("A mensgaem recebida pelo pai foi: %s",leMsg);
	} else{
		printf("Erro no fork \n");
	}
}