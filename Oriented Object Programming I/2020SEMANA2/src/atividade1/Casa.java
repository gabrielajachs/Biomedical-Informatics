package atividade1;

public class Casa {
	private int numero;
	private float metros;
	private Endereco e1;
	private String proprietario;
	public Casa(int numero, float metros, Endereco e1, String proprietario) {
		super();
		this.numero = numero;
		this.metros = metros;
		this.e1 = e1;
		this.proprietario = proprietario;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getMetros() {
		return metros;
	}
	public void setMetros(float metros) {
		this.metros = metros;
	}
	public Endereco getE1() {
		return e1;
	}
	public void setE1(Endereco e1) {
		this.e1 = e1;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
}
