package questao4;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		LinkedList<Lapiseira> estojo = new LinkedList();
		
		Scanner leitura = new Scanner(System.in);
		
		while(true){
			System.out.println("Características da Lapiseira: ");
				
				System.out.println("Marca:");
				String	marcaAux = leitura.nextLine();
				System.out.println("Cor:");
				String	corAux = leitura.nextLine();
				System.out.println("Grafite:");
				float	grafiteAux = leitura.nextFloat();
					
				leitura.nextLine();
					
					System.out.println("\n");
					
					estojo.add(new Lapiseira(marcaAux, corAux, grafiteAux));
					
			System.out.println("Deseja continuar?");
			
			String resposta = leitura.nextLine();
			
				if(resposta.equals("não")){
					for (Lapiseira lapiseira : estojo) {
					     System.out.println(lapiseira.getMarca());
					     System.out.println(lapiseira.getCor());
					     System.out.println(lapiseira.getGrafite());
					
					}
					break;
				}
				
				

			}
		leitura.close();
	}

}
