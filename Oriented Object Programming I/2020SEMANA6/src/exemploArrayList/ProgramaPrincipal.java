package exemploArrayList;

import java.util.ArrayList;

import exemploArranjoBi.Aluno;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		listaAlunos.add(new Aluno("122-2", "Gabriela"));
		listaAlunos.add(new Aluno("122-3", "Bob"));
		
		for (int i = 0; i < listaAlunos.size(); i++) {
			
			System.out.println(listaAlunos.get(i));
			
		}
		
	}
}
