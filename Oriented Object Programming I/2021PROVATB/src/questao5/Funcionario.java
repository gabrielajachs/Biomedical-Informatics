package questao5;

public class Funcionario extends Pessoa implements Salario {
	
	
	private int matricula;
	private int qthoras;
	private double valhora;

	
	public Funcionario(String nome, int idade, int matricula, int qthoras, double valhora) {
		super();
		this.matricula = matricula;
		this.qthoras = qthoras;
		this.valhora = valhora;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getQthoras() {
		return qthoras;
	}

	public void setQthoras(int qthoras) {
		this.qthoras = qthoras;
	}

	public double getValhora() {
		return valhora;
	}

	public void setValhora(double valhora) {
		this.valhora = valhora;
	}

	public String toString() {
		return "Salario Final Funcionario: " + " " + this.getSalarioFinal();
	}

	@Override
	public double getSalarioFinal() {
		// TODO Auto-generated method stub
		double salario = this.valhora * this.qthoras;
		return salario;
	}


}

