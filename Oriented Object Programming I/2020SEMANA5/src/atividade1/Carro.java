package atividade1;

public class Carro extends Veiculo implements Pedagio, Impostos {

	private int numPassageiros;

	public Carro(String marca, String modelo, double motorizacao, double peso, int ano, int numEixos,
			int numPassageiros) {
		super(marca, modelo, motorizacao, peso, ano, numEixos);
		this.numPassageiros = numPassageiros;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	@Override
	public double calculaIPVA(int ano, double motor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaSeguro(int ano, double motor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaPedagio(int numE) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
