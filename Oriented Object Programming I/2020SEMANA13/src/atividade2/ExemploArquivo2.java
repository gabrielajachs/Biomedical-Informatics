package atividade2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploArquivo2 {
	
	public static void main(String[] args) {
		
		File arq1 = new File("pasta/arquivoTeste2");
		
		try {
			FileReader fr = new FileReader(arq1);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
