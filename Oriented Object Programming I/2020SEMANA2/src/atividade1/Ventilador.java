package atividade1;

public class Ventilador {

	private int numeroPas;
	private int voltagem;
	private int numVelocidades;
	private String intensidade;
	private boolean importado;
	
	public Ventilador(int numeroPas, int voltagem, int numVelocidades, String intensidade, boolean importado) {
		super();
		this.numeroPas = numeroPas;
		this.voltagem = voltagem;
		this.numVelocidades = numVelocidades;
		this.intensidade = intensidade;
		this.importado = importado;
	}

	public int getNumeroPas() {
		return numeroPas;
	}

	public void setNumeroPas(int numeroPas) {
		this.numeroPas = numeroPas;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getNumVelocidades() {
		return numVelocidades;
	}

	public void setNumVelocidades(int numVelocidades) {
		this.numVelocidades = numVelocidades;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	
	
	public static void main(String[] args) {
		Ventilador v1 = new Ventilador(4, 220, 5, "forte", false);
		
		System.out.println(v1.numeroPas);
		System.out.println(v1.voltagem);
		System.out.println(v1.numVelocidades);
		System.out.println(v1.intensidade);
		System.out.println(v1.importado);
		
	}
	
	
}
