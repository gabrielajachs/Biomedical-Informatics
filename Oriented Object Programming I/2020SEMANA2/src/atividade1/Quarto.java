package atividade1;

public class Quarto {
	private String tipoQuarto;
	private int numeroTomadas;
	private float metrosQuadrados;
	private int numeroJanelas;
	public Quarto(String tipoQuarto, int numeroTomadas, float metrosQuadrados, int numeroJanelas) {
		super();
		this.tipoQuarto = tipoQuarto;
		this.numeroTomadas = numeroTomadas;
		this.metrosQuadrados = metrosQuadrados;
		this.numeroJanelas = numeroJanelas;
	}
	public String getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public int getNumeroTomadas() {
		return numeroTomadas;
	}
	public void setNumeroTomadas(int numeroTomadas) {
		this.numeroTomadas = numeroTomadas;
	}
	public float getMetrosQuadrados() {
		return metrosQuadrados;
	}
	public void setMetrosQuadrados(float metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}
	public int getNumeroJanelas() {
		return numeroJanelas;
	}
	public void setNumeroJanelas(int numeroJanelas) {
		this.numeroJanelas = numeroJanelas;
	}
	
	public static void main(String[] args) {
		Quarto q1 = new Quarto("casal", 2, 100, 1);
		
		System.out.println(q1.tipoQuarto);
		System.out.println(q1.numeroTomadas);
		System.out.println(q1.metrosQuadrados);
		System.out.println(q1.numeroJanelas);
		
		
	}
	
}
