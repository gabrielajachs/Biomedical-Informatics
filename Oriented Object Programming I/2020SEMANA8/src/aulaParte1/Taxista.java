package aulaParte1;

public class Taxista implements Salario {
	
	private String nome;
	private int cpf;
	private int rg;
	private double totalKmRodados;
	private double valorKmRodado;
	
	public Taxista(String nome, int cpf, int rg, double totalKmRodados, double valorKmRodado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.totalKmRodados = totalKmRodados;
		this.valorKmRodado = valorKmRodado;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}



	public double getTotalKmRodados() {
		return totalKmRodados;
	}



	public void setTotalKmRodados(double totalKmRodados) {
		this.totalKmRodados = totalKmRodados;
	}



	public double getValorKmRodado() {
		return valorKmRodado;
	}



	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}



	@Override
	public double getSalarioLiquido() {
		double salarioBruto = this.totalKmRodados * this.valorKmRodado;
		return salarioBruto - salarioBruto * (double) 0.05;
	}

	@Override
	public double getQuantidadeSalarioMinimo() {
		return getSalarioLiquido()/SALARIO_MINIMO;
	}
	
	public String toString() {
		return "O taxista "+this.nome+" andou "+this.totalKmRodados+" km no mês de janeiro. Seu salário foi: "+getSalarioLiquido();
	}

}
