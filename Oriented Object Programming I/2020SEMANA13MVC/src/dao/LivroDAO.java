package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Livro;

public class LivroDAO {
	
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	
	public LivroDAO() {
		
		arq = new File("livros.txt");
		
	}
	
	public boolean cadastraLivro (Livro l) {
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			
			bw.write(l.toString());
			bw.newLine();
			bw.flush();
			
			bw.close();
			fw.close();
			
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		 
	}
	
	public boolean consultaLivro(Livro l) {
		try {
			fr = new FileReader(arq);
			br = new BufferedReader(fr);
			
			String linha;
			String[] campos = new String[3];
			
			while ((linha = br.readLine())!= null) {
				campos = linha.split("#");
				
				if (campos[0].equals(l.getIsbn())) {
					l.setTitulo(campos[1]);
					l.setAutor(campos[2]);
					return true;
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
		
	}
	

}
