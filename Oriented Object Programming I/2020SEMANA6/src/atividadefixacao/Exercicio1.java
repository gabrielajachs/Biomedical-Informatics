package atividadefixacao;

public class Exercicio1 {
	
	/*1) Escreva um programa que use um arranjo para encontrar a média de 5 valores double. Use os 5 valores
	que quiser;*/
	
	public static void main(String[] args) {
		
		double array [] = {10.5, 25.5, 14.6, 14.7, 19.5};
		double media = 0;
		
		for (int i = 0; i < array.length; i++) {
			media = array[i] +media;
		}
		
	media = media/array.length;
	
	System.out.println("Média: "+media);
	}	
	

}
