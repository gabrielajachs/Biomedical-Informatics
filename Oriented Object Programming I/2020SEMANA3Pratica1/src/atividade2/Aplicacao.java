package atividade2;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		numero1 = s1.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = s1.nextInt();
		
		System.out.println("O primeiro numero em binario eh: " +Integer.toBinaryString(numero1));
		System.out.println("O segundo numero em binario eh: " +Integer.toBinaryString(numero2));
		
		s1.close();
	}
}
