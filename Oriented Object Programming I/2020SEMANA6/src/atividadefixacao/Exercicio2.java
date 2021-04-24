package atividadefixacao;

public class Exercicio2 {

	/*
	 Escreva um programa que crie dois arranjos inteiros data1 e data2, possivelmente de tamanhos
	 diferentes. Em seguida, use laços for para criar um novo arranjo data3 com tamanho igual à soma dos
	 tamanhos de data1 e data2 e com conteúdo composto pelo conteúdo de data1 seguido pelo conteúdo
	 de data2. Por exemplo, se os dois arranjos forem: {1,2,3} e {4,5,6,7}, o código deverá criar o novo
	 arranjo com os valores: {1,2,3,4,5,6,7}.
	 */
	
	public static void main(String[] args) {
		int [] vetor1 = {1,2,3};
		int [] vetor2 = {4,5,6,7};
		int [] vetor3 = new int [vetor1.length + vetor2.length];
		int aux = 0;
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor3[aux]=vetor1[i];
			aux++;
			
		}
		for (int i = 0; i < vetor2.length; i++) {
			vetor3[aux]=vetor2[i];
			aux++;
		}
		
		System.out.println("Vetor final: ");
		for(int v:vetor3)
		{
			System.out.println(v+ " ");
		}
	
	}
	
}
