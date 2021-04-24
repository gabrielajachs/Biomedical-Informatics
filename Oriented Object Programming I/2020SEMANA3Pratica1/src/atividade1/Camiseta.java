package atividade1;

public class Camiseta {

	private String tamanho;
	private String cor;
	private float preco;
	private String modelo;
	public Camiseta(String tamanho, String cor, float preco, String modelo) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
	}
	public Camiseta(String tamanho, String cor) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
