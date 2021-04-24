package exemplo_Fila_Pilha;

import java.util.LinkedList;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> fila = new LinkedList<Integer>();
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		
		fila.remove();
		fila.remove();
		System.out.println(fila.peek());
		
		System.out.println("Impressao da fila: ");
		for (int i = 0; i < fila.size(); i++) {
			
			System.out.println(fila.get(i));
			
		}
		
		LinkedList<String> pilha = new LinkedList<String>();
		
		pilha.push("1 - Escreve texto");
		pilha.push("2 - Coloca texto em negrito");
		pilha.push("3 - Coloca texto em italico");
		
		pilha.poll();
		
		System.out.println("\n Impressao da pilha:");
		for (int i = 0; i < pilha.size(); i++) {
			System.out.println(pilha.get(i));
			
		}
		
	}

}
