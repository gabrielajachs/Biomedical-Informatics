package modelo;

public class Calculadora {
	
	private float numeroUm;
	private float numeroDois;
	private float resultado;
	
	public Calculadora(float numeroUm, float numeroDois, float resultado) {
		super();
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.resultado = resultado;
	}

	public float getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(float numeroUm) {
		this.numeroUm = numeroUm;
	}

	public float getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(float numeroDois) {
		this.numeroDois = numeroDois;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public float somar() {
		setResultado(numeroUm + numeroDois);
		return getResultado();
	}
	
	public String toString() {
		return "\nResultado: " +getResultado();
	}
}
