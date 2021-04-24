package excecoes;

import java.util.Scanner;

public class ProgramaPrincipal4 {
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Informe o y: ");
		Scanner leitura = new Scanner(System.in);
		y = leitura.nextInt();
		
		try {
			x = 3/y;
			System.out.println("y é diferente de zero! X: "+x);
		}
		catch(ArithmeticException e) {
			System.out.println("Erro de divisao por zero");
		}
		System.out.println("Após try catch");
	}

}
