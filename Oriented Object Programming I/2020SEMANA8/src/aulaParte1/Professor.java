package aulaParte1;

public class Professor implements Salario {
	
	private String nome;
	private int matricula;
	private int ch;
	private double valorHora;

	public Professor(String nome, int matricula, int ch, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.ch = ch;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public int getCh() {
		return ch;
	}



	public void setCh(int ch) {
		this.ch = ch;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	@Override
	public double getSalarioLiquido() {
		double salarioMinimo = this.valorHora * this.ch * (double) 4.5;
		return salarioMinimo - salarioMinimo * (double) 0.08;
	}

	@Override
	public double getQuantidadeSalarioMinimo() {
		return getSalarioLiquido()/SALARIO_MINIMO;
	}
	
	public String toString() {
		return "O professor "+this.nome+" tem "+this.ch+" h/a por semana. O salário liquido é: "+this.getSalarioLiquido();
	}

}
