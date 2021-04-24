package atividade1;

public class Endereco {

	private String bairro;
	private String rua;
	private String cep;
	public Endereco(String bairro, String rua, String cep) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
