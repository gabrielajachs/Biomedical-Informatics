package controle;

import modelo.Calculadora;
import visao.JanelaSomaDoisNumeros;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaSomaDoisNumeros j = new JanelaSomaDoisNumeros();
		j.setVisible(true);
		Calculadora c = new Calculadora(0, 0, 0);
		CalculadoraControle ccon = new CalculadoraControle(j, c);

}
}
