package atividade2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExemploArquivo3 {
	
	public static void main(String[] args) {
		
		File arq = new File("pasta/arquivoTeste3");
		
		try {
			FileWriter fw = new FileWriter(arq);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("Informe um texto para ser gravado no arquivo: \n");
			Scanner leitura = new Scanner(System.in);
			String conteudo = leitura.nextLine();
			
			//bw.write("Novo arquivo");
			bw.newLine();
			bw.write(conteudo);
			bw.flush();
			
			fw.close();
			bw.close();
			leitura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
