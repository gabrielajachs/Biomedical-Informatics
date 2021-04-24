package exemploLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import exemploArranjoBi.Aluno;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		LinkedList<Aluno> listasAlunos = new LinkedList<Aluno>();
		
		listasAlunos.add(new Aluno ("111-2", "Gabriela"));
		listasAlunos.add(new Aluno ("111-3", "Bob"));
		
		System.out.println("Usando o Interator...\n");
		
		Iterator<Aluno> i = listasAlunos.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n");
		
		for(Aluno a : listasAlunos) {
			System.out.println(a.getNome());
		}
		
	}
	
}
