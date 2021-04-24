package exercicio1Parte1;

public class Oficina {

	public Veiculo proximo() {
		Veiculo v;
		
		double x = Math.random();
		
		if(x % 2 > 0.5) {
			v = new Automovel();
			
		}
		else {
			v = new Bicicleta();
		}
		return v;
	}
	
	public void manter(Veiculo v) {
		Veiculo.ajustar();
		Veiculo.limpar();
		Veiculo.verificar();
	}
	
	public static void main(String[] args) {
		Oficina o = new Oficina();
		Veiculo v;
		for (int i = 0; i < 5; i++) {
			v = o.proximo();
			o.manter(v);
			
		}
	}
}
