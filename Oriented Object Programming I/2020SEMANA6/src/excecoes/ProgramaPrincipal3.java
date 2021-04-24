package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgramaPrincipal3 {
	public static void M1() throws IOException {
		FileReader f = new FileReader("file.txt");
		
	}
	
	public static void main(String[] args)  {
		
	try {
		M1();
	}
	catch(IOException e) {
		System.out.println("Erro na leitura do arquivo! ");
	}
	
	

}
}
