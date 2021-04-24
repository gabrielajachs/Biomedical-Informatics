package exercicio2;

public class Aplicacao {

	public static void main(String[] args) {
		ProfessorDE p = new ProfessorDE("Mike", 123, 40, 100);
		p.calculaSalario();
		System.out.println(p.getSalario());
	}
}
