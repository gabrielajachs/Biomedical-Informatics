package atividade1;

public class Sapato {

	private String cor;
	private String numero;
	private String marca;
	private String modelo;
	public Sapato(String cor, String numero, String marca, String modelo) {
		super();
		this.cor = cor;
		this.numero = numero;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
