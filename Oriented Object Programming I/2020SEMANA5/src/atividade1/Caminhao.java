package atividade1;

public class Caminhao extends Veiculo implements Pedagio, Impostos {

	private double capacidadeCarga;
	
	public Caminhao(String marca, String modelo, double motorizacao, double peso, int ano, int numEixos, double capacC) {
		super(marca, modelo, motorizacao, peso, ano, numEixos);
		this.capacidadeCarga=capacC;
		// TODO Auto-generated constructor stub
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public double calculaIPVA(int ano, double motor) {
		// TODO Auto-generated method stub
		if (ano > 2021)
			return 3000.0 + (100*motor);
		else if (ano >2011)
			return 2000.0 + (100*motor);
		else if(ano > 2001)
			return 1000.0 + (100*motor);
		else
			return 0;
	}

	@Override
	public double calculaSeguro(int ano, double motor) {
		// TODO Auto-generated method stub
		if (ano > 2021)
			return 9000.0 + (100.0 * motor);
		else if (ano >2011)
			return 6000.0 + (100.0 * motor);
		else 
			return 3000.0 + (100.0 * motor);
	}

	@Override
	public double calculaPedagio(int numE) {
		// TODO Auto-generated method stub
		if(numEixos > 4)
			return 50.0;
		else 
			return 30.0;
	}

	
	
}
