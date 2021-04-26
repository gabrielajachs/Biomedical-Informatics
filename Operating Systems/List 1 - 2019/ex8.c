#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>
#include<string.h>
#define MAX 100 

int main(int argc, char *argv[]){
	char *operacao;
	operacao = argv[1];
	float numero = atof(argv[2]);
	float numeroEntrada;
	float resposta;
	char buffer[MAX];
	char buf[MAX];

	pid_t pid;
	int pipefds1[2], pipefds2[2];

	if(pipe(pipefds1) == -1){
		printf("Erro ao criar o pipe 1.");
		return 1;		
	}

	if(pipe(pipefds2) == -1){
		printf("Erro ao criar o pipe 2.");
		return 1;		
	}
	
	pid = fork();

	if(pid == 0){
		sleep(3);
		close(pipefds1[1]);
      		close(pipefds2[0]);
		printf("Eu sou o processo filho. \n");
		read(pipefds1[0], buffer, sizeof(buffer));
		numeroEntrada = atof(buffer);
		printf("Estou fazendo o calculo... \n");	
		if(strcmp(operacao,"-d") == 0){
			if(numeroEntrada != 0){
				resposta = numero/numeroEntrada;
				gcvt(resposta, 2, buf);
				write(pipefds2[1], buf, sizeof(buf));
			}else{
				write(pipefds2[1], "Divisao por zero.\n", sizeof(buf));
			}
		}else if(strcmp(operacao,"-m") == 0){
			resposta = numero*numeroEntrada;
			gcvt(resposta, 2, buf);
			write(pipefds2[1], buf, sizeof(buf));
		
		}else if(strcmp(operacao,"-s") == 0){
			resposta = numero-numeroEntrada;
			gcvt(resposta, 2, buf);
			write(pipefds2[1], buf, sizeof(buf));

		}else if(strcmp(operacao,"-a") == 0){
			resposta = numero+numeroEntrada;
			gcvt(resposta, 2, buf);
			write(pipefds2[1], buf, sizeof(buf));
		}
	} else if(pid > 0){
		close(pipefds1[0]);
      		close(pipefds2[1]);
		printf("Eu sou o processo pai. \n");
		printf("Digite um numero para realizar a operação desejada.\n");
		scanf("%s", buffer);
		write(pipefds1[1], buffer, sizeof(buffer));
		read(pipefds2[0],buffer,sizeof(buffer));
		printf("Recebi a resposta do meu filho...\n");
		printf("Resposta: %s \n", buffer);
	} else{
		printf("Erro no fork.");
	}
	return 0;
}