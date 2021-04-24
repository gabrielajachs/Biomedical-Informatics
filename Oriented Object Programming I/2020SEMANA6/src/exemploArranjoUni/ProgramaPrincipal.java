package exemploArranjoUni;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//int[] vetorInteirosA, vetorInteirosB;
		
		int[] vetorInteirosA = new int[5];
		int[] vetorInteirosB = new int[4];
		int[] vetorInteirosC = {1, 2, 3};
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe cinco valores: ");
		
		for (int i = 0; i < vetorInteirosA.length; i++) {
			vetorInteirosA[i] = leitura.nextInt();
		}
		
		leitura.close();
		
		System.out.println("\n");
		
		vetorInteirosB[0] = 2;
		vetorInteirosB[1] = 4;
		vetorInteirosB[2] = 6;
		vetorInteirosB[3] = 8;
		
		System.out.println("\n");
		
		for (int i = 0; i < vetorInteirosC.length; i++) {
			System.out.println(vetorInteirosC[i]);
			
		}
		
	}
	
}
