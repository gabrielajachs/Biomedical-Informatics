package aulaParte1;

public class ProgramaPrincipal1 {
	
	public static void CalculaArea(int a) {
		a = a*a;
		System.out.println("Area (int): "+a);
	}
	
	public static void CalculaArea(double a) {
		a = a*a;
		System.out.println("Area (double): "+a);
	}
	
	public static void main(String[] args) {
		CalculaArea(2);
		CalculaArea(2.0);
		
	}

}
