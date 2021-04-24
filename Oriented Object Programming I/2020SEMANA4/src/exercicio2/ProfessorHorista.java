package exercicio2;

public class ProfessorHorista extends Professor{
	
	private int totalHoras;
	private double salarioHora;
	
	public ProfessorHorista(String nome, int matricula, int idade, double salario) {
		super(nome, matricula, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public void calculaSalario() {
		System.out.println("Salario: " +salarioHora*totalHoras);
	}
	

}
