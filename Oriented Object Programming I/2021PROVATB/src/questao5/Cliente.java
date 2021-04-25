package questao5;

public class Cliente extends Pessoa {

	private int cpf;

	public Cliente(String nome, int idade, int cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
