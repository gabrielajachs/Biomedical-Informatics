package exercicio1Parte2;

public class Veterinaria {

	FuncaoAnimal proximo() {
		FuncaoAnimal a;
		double x = Math.random();
		if(x % 2> 0.5) {
			a = new Gato();
		}
		else {
			a = new Cachorro();
		}
		return a;
	}
	
	public void latirMiar(FuncaoAnimal a) {
		a.fazerBarulho();
	}
		
	
	public static void main(String[] args) {
		Veterinaria vet = new Veterinaria();
		FuncaoAnimal a;
		for (int i = 0; i < 10; i++) {
			a = vet.proximo();
			vet.latirMiar(a);
			
		}
	}
}