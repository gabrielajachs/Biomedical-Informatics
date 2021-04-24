package excecoes;

import java.util.Scanner;

public class ProgramaPrincipal5 {
	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		
		try {
			System.out.println("Informe o indice: ");
			
			Scanner leitura = new Scanner(System.in);
			
			int y = leitura.nextInt();
			System.out.println("y: "+y);
			numeros[y] = 23;	
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erro! Indice inválido!");	
		}
		catch(Exception e) {
			System.out.println("Outro Erro!");
			
		}
	}

}
