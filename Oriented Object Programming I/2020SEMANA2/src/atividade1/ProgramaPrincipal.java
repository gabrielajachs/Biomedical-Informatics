package atividade1;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Bolsa b1 = new Bolsa("gucci", "rosa", "social", 1000f);
		Sapato s1 = new Sapato("rosa", "37", "gucci", "night"); 
		Vestido v1 = new Vestido("nude", "longo", 2000f, "P");
		
		System.out.println("Bolsa: " +b1.getMarca());
		System.out.println("Sapato: " +s1.getCor());
		System.out.println("Vestido: " +v1.getCor());
	}
	
}
