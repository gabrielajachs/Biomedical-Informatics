package atividade1;

public class Aluno {

	private String matricula;
	private String nome;
	private String serie;
	private float nota;
	
	public Aluno(String matricula, String nome, String serie, float nota) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.serie = serie;
		this.nota = nota;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
}
