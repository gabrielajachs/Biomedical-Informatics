package atividade1;

public class Lampada {

	private String estadoDaLampada;

	public Lampada() {
		super();
		this.estadoDaLampada = "apagada";
	}
	
	public void acende() {
		this.estadoDaLampada = "acesa";
		
	}
	
	public void apaga() {
		this.estadoDaLampada = "apagada";
		
	}
	
	public void mostraEstado() { 
		System.out.println("Estado da Lampada: " +estadoDaLampada);
	}
	
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.acende();
		l1.mostraEstado();
	}
}
