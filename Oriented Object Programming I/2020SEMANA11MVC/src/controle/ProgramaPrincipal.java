package controle;

import modelo.Cliente;
import visao.JanelaCadastro;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaCadastro jan = new JanelaCadastro();
		jan.setVisible(true);
		
		Cliente cli = new Cliente(null, null, null, null);
		
		ClienteControle ccon = new ClienteControle(jan, cli );
		
		
		
		
	}

}
