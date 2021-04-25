package questao1;

public class Estudante {
	
	private int matricula;
	private String nome;
	private char sexo;
	private boolean bolsista;
	
	public Estudante(int matricula, String nome, char sexo, boolean bolsista) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.bolsista = bolsista;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	
	

}
