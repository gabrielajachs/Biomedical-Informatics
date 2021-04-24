package atividade1;

public class Maquiagem {
	
	private String marca;
	private String cor;
	private float preco;
	private int quantidade;
	
	public Maquiagem(String marca, String cor, float preco, int quantidade) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Maquiagem(String marca, String cor) {
		super();
		this.marca = marca;
		this.cor = cor;
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
