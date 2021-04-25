package questao3;

import java.util.Scanner;

public class Aplicação {	
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			 
			double media, total = 0, freqAux;
			
			boolean op = true;
			while(op) {
				
				System.out.println("Digite 1: para consultar frequência do aluno na UFCSPA. Digite 2 para fechar.");
				int n = input.nextInt();
				
				if (n == 1) {
					System.out.println("Digite a frequência do aluno (Número entre 0 e 100%): ");
					
					freqAux = input.nextInt();
					
						if (freqAux < 75) {
							System.out.println("Reprovado por frequência menor que 75%.");
						}
						else if (freqAux>= 75){
							System.out.println("Frequência maior ou igual a 75%.");
						}
			 
			for (int i = 1; i < 4; i++) {
				System.out.println("Digite a nota "+ i+ ":");
				total += input.nextDouble();
			}

			media = total/3;
			
			
			 if(media >= 7) {
		            System.out.println("Aprovado com média: "+media);
		        }
		        else if(media >=4) {
		            System.out.println("Faça o exame. Média: "+media);
		        }
		        else {
		            System.out.println("Reprovado com média: "+media);
		       }
		   }
		}
	}
}

		
