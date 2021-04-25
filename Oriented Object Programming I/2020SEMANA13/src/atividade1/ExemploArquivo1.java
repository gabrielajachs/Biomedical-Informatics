package atividade1;

import java.io.File;

public class ExemploArquivo1 {
	
	public static void main(String[] args) {
		 File arq = new File("pasta/");
		 
		 if(arq.exists()) {
			 System.out.println("O arquivo existe");
		 }
		 else {
			 System.out.println("Arquivo não existe");
		 }
		 
		 System.out.println(arq.getAbsolutePath());
		 System.out.println(arq.getName());
		 
		 if(arq.isFile())
			 System.out.println("É um arquivo");
		 
		 if(arq.isDirectory())
			 System.out.println("É um diretório");
		 
		 File[] listaArquivos = arq.listFiles();
		 
		 for (int i = 0; i < listaArquivos.length; i++) {
			 System.out.println(listaArquivos[i].getName());
			
		}
	}

}
