package exercicio2;

public class ProfessorDE extends Professor{

	public ProfessorDE (String nome, int matricula, int idade, double salario) {
		
		super(nome, matricula, idade, salario);
	}
	
	public void calculaSalario() {
		System.out.println("Salario: "+this.salario*2);
	}
}
