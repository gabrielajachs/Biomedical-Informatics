package aulaParte1;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Salario s1, s2;
		s1 = new Professor("Luciano", 222, 60, 50.0);
		s2 = new Taxista("Isabel", 333, 555, 1000, 50);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
