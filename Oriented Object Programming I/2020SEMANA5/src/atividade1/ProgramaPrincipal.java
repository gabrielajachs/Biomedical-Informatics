package atividade1;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		String marcaAux, modeloAux;
		int anoAux, numEix;
		double motorAux, pesoAux, capacAux;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe os dados referentes a marca, modelo, ano, numero de eixos, motor, peso e capacidade");
		
		marcaAux=leitura.nextLine();
		modeloAux=leitura.nextLine();
		anoAux=leitura.nextInt();
		numEix=leitura.nextInt();
		motorAux=leitura.nextDouble();
		pesoAux=leitura.nextDouble();
		capacAux=leitura.nextDouble();
		
		leitura.close();
		
		System.out.println("\n");
		
		Caminhao c = new Caminhao(marcaAux, modeloAux, motorAux, pesoAux, anoAux, numEix, capacAux);
		
		System.out.println("Seguro do caminhao: " + c.calculaSeguro(anoAux, motorAux));
		System.out.println("IPVA do caminhao: " + c.calculaIPVA(anoAux, motorAux));
		System.out.println("Pedagio do caminhao: " + c.calculaPedagio(numEix));
		
		
	}
}
