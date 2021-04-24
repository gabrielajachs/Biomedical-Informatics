package atividade1;

public class Vestido {

	private String cor;
	private String modelo;
	private float preco;
	private String tamanho;
	public Vestido(String cor, String modelo, float preco, String tamanho) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
		this.tamanho = tamanho;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}
