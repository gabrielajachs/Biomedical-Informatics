#include<stdio.h>
#include<unistd.h>
#include<signal.h>
#include<sys/wait.h>

void main(){
	int sinal;
	int pid;
	printf("Meu pid eh: %d \n", getpid());
	printf("Digite o numero do pid do processo escravo:");
	scanf("%d",&pid);
	printf("Escolha um sinal: 1 para SIGUSR1, 2 para SIGUSR2 ou 3 para SIGTERM \n");
	scanf("%d",&sinal);
	if(sinal == 1){
		kill(pid, SIGUSR1);
	} else if(sinal == 2){
		kill(pid, SIGUSR2);
	} else if(sinal == 3){
		kill(pid, SIGTERM);
	}
	wait(NULL);
}