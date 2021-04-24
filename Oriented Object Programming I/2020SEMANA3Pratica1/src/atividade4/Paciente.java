package atividade4;

public class Paciente {
	private String nome;
	private int idade;
	private String endereco;
	private float altura;
	private float peso;
	public Paciente(String nome, int idade, String endereco, float altura, float peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
