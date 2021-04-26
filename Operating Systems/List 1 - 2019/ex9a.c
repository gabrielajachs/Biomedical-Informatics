#include<stdio.h>
#include<unistd.h>
#include<signal.h>
#include<sys/wait.h> 

void handler();

void main(){
	printf("Meu pid eh: %d \n", getpid());
	signal(SIGUSR1, handler);
	signal(SIGUSR2, handler);
	signal(SIGTERM, handler);
	wait(NULL);
}

void handler(int signum){
	if (signum == SIGUSR1){
		printf("Recebi SIGUSR1!\n");
	}else if (signum == SIGUSR2){
		printf("Recebi SIGUSR2!\n");
	}else if (signum == SIGTERM){
		printf("Recebi SIGTERM!\n");
	}
}