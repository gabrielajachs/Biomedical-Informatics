package atividadefixacao;

import java.util.Scanner;

public class Questao3Alternativa {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[] somaLinha = new int[3];
		int[] elementosdiag = new int[3];
		int[] produtoColuna = {1, 1, 1};
		
		System.out.println("Informe os elementos da matriz 3x3: \n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				matriz[i][j] = leitura.nextInt();
				somaLinha[i]=somaLinha[i] + matriz[i][j];
				
				if(i==j)
					elementosdiag[i] = matriz[i][j];
			}
			
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				produtoColuna[i] = produtoColuna[i] * matriz[j][i];
			}
		}
		
		System.out.println("\n\nSoma dos elementos da linha: ");
		for (int i = 0; i < somaLinha.length; i++) {
			System.out.print(somaLinha[i] + " ");
			
		}
	
		System.out.println("\n\nProduto dos elementos da linha: ");
		for (int i = 0; i < produtoColuna.length; i++) {
			System.out.print(produtoColuna[i] + " ");
		
		}
		System.out.println("\n\nProduto dos elementos da linha: ");
		for (int i = 0; i < elementosdiag.length; i++) {
			System.out.print(elementosdiag[i] + " ");
		
		}
	}

}
