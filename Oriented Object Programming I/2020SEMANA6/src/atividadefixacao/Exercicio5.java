package atividadefixacao;

import java.util.LinkedList;

public class Exercicio5 {
	/*O que seria necessário modificar no código da questão 1 para implementarmos uma pilha com a classe
	LinkedList?*/
	
	public static void main(String[] args) {

		LinkedList<Double> pilha = new LinkedList<Double>();
		
		pilha.push(10.5);
		pilha.push(25.5);
		pilha.push(14.6);
		pilha.push(14.7);
		pilha.push(19.5);

		System.out.println("Impressao da pilha:");
		for (int i = 0; i < pilha.size(); i++) {
			System.out.println(pilha.get(i));
		}

		int tamanho = pilha.size();
		double soma = 0.0;
		for (int i = 0; i < tamanho; i++) {
			soma += pilha.pop();

		}
		System.out.println("######################");
		double media = soma / tamanho;
		System.out.println("A Media da Pilha É: " + media);
	}

}
