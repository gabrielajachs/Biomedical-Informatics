package atividade1;

public class Bolsa {

	private String marca;
	private String cor;
	private String modelo;
	private float preco;
	
	public Bolsa(String marca, String cor, String modelo, float preco) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
	
	
	
}
