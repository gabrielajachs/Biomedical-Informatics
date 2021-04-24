package atividade1;

public class Aplicacao {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(50f, 12);
		Camiseta c1 = new Camiseta("P", "rosa");
		Maquiagem m1 = new Maquiagem("Chanel", "NW15");
		
		System.out.println("Pizza: " +p1.getPreco() +" " +p1.getFatias());
		System.out.println("Camiseta: " +c1.getTamanho() +" " +c1.getCor());
		System.out.println("Maquiagem: " +m1.getMarca() +" " +m1.getCor());
		
	}
}
