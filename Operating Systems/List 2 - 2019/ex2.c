#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include<sys/types.h>
#include<sys/wait.h>

int nfilho; 
void proc_filho() { 
		printf("Processo FILHO %d iniciado\n",nfilho); 
		printf("Vair dormir por %d segundos\n",nfilho*10); 
		sleep(nfilho*10); 
		printf("Processo FILHO %d encerrado\n",nfilho); 
} 

void main() {
    	pid_t pid1, pid2, pid3;
    	printf("Processo Pai iniciado \n");
   	pid1 = fork();
   	if (pid1 == 0) {
		nfilho = 1;
       		proc_filho();
    	}else if (pid1>0) {
        	pid2 = fork ();
		if (pid2==0) {
		    nfilho = 2;
		    proc_filho();
		    exit (0);
	    	}else if (pid2>0) {
		    pid3 = fork();
		    if (pid3==0) {
			 nfilho = 3;
		         proc_filho();
		         exit(0);
	   	    }else if (pid3>0) {
			wait(NULL);
			wait(NULL);
			wait(NULL);
			printf("processo pai encerrado \n");
		    }
		}
	}
	printf("erro no fork()");
	exit(1);
}
