package atividade3;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		String nome;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		nome = s1.nextLine();
		
		System.out.println("Numero de caracteres da String: "+nome.length());
		System.out.println("O indice da ultima letra do seu primeiro nome: "+nome.lastIndexOf("a"));
		System.out.println("String em maisculo: "+nome.toUpperCase());
		System.out.println("String substituindo o seu primeiro nome pela String 'Teste': "+nome.replaceFirst(nome, "Teste"));
		s1.close();
	}
}
 