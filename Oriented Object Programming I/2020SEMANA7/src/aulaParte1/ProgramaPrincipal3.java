package aulaParte1;

public class ProgramaPrincipal3 {
	
	public static void Soma(int a, int b) {
		
		System.out.println("Area (int): "+a+b);
	}
	
	public static void Soma(double a, double b) {
		
		System.out.println("Area (double): "+a+b);
	}
	
	public static void main(String[] args) {
		Soma(1,2);
		Soma(1.0,2.0);
		Soma(1,2.0);
		Soma((int) 1.0,(int) 2.0);
	}

}
