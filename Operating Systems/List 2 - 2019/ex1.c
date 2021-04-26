#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>


void main() {
	pid_t pid;
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();
	pid = fork();

	
	if (pid == -1){
		printf ("Error \n");
	}else{
		printf("eu estou vivo!!!! \n");
		sleep(20);
	}



}