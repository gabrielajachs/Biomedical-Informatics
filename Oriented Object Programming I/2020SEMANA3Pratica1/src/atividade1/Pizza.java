package atividade1;

public class Pizza {

	private String quantidadeSabor;
	private float preco;
	private int fatias;
	private boolean bordaCatupiry;
	
	public Pizza(String quantidadeSabor, float preco, int fatias, boolean bordaCatupiry) {
		super();
		this.quantidadeSabor = quantidadeSabor;
		this.preco = preco;
		this.fatias = fatias;
		this.bordaCatupiry = bordaCatupiry;
	}
	public Pizza(float preco, int fatias) {
		super();
		this.preco = preco;
		this.fatias = fatias;
	}
	public String getQuantidadeSabor() {
		return quantidadeSabor;
	}
	public void setQuantidadeSabor(String quantidadeSabor) {
		this.quantidadeSabor = quantidadeSabor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getFatias() {
		return fatias;
	}
	public void setFatias(int fatias) {
		this.fatias = fatias;
	}
	public boolean isBordaCatupiry() {
		return bordaCatupiry;
	}
	public void setBordaCatupiry(boolean bordaCatupiry) {
		this.bordaCatupiry = bordaCatupiry;
	}
	
	
	
	
}
