package excecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaPrincipal {
	
	public static void main(String[] args) throws IOException {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Qual o seu nome? ");
		String nome = leitor.readLine();
		System.out.println("Nome informado: "+nome);
	}

}
