package atividadefixacao;

import java.util.LinkedList;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*Escreva um programa que crie uma LinkedList (utilizando o framework Java Collections) contendo as
		String “A”, “B”, “C” e “D” e as imprima na tela da seguinte forma: “A-B-C-D”.*/
		
		LinkedList<Character> lista= new LinkedList<Character>();
		
		lista.add('A');
		lista.add('B');
		lista.add('C');
		lista.add('D');
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(i==0)
				System.out.print(lista.get(i));
			else
				System.out.print("-"+lista.get(i));
			
		}
		
	}
	
}
