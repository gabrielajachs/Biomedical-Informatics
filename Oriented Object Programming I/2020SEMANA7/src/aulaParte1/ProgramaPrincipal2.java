package aulaParte1;

public class ProgramaPrincipal2 {

	
	public static void CalculaArea(int a) {
		a = a*a;
		System.out.println("Area (int): "+a);
	}
	
	/*public static void CalculaArea(double a) {
		a = a*a;
		System.out.println("Area (double): "+a);
	}*/
	
	public static void main(String[] args) {
		CalculaArea(2);
		CalculaArea((int)2.0); /*ele vai aceitar o int*/
		CalculaArea('x');
		
	}

}
