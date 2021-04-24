package exemploArranjoBi;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Aluno[] vetorAlunos = new Aluno[3];
		float[][] matrizNotas = new float[3][2];
		
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < matrizNotas.length; i++) { //aqui vai retornar o numero de linhas
			
			System.out.println("Informe a matricula e o nome: ");
			
			vetorAlunos[i] = new Aluno(leitura.nextLine(), leitura.nextLine());
			
			System.out.println("Informe duas notas: ");
			
			for (int j = 0; j < matrizNotas[i].length; j++) { //aqui vai retornar o numero de colunas
				matrizNotas[i][j] = leitura.nextFloat();
				
			}
			leitura.nextLine();
			
		}
		leitura.close();
		
	}
	
}
