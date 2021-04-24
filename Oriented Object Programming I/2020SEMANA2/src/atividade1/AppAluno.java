package atividade1;

public class AppAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("123456", "Bob Jackson", "5", 10f);
		Aluno a2 = new Aluno("123457", "Kate West", "4", 9f);
		
		System.out.println("Aluno: " +a1.getMatricula() +" "+ a1.getNome() +" "+ a1.getSerie() +" "+ a1.getNota());
		System.out.println("Aluno: " +a2.getMatricula() +" "+ a2.getNome() +" "+ a2.getSerie() +" "+ a2.getNota());
	}
}
