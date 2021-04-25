package controle;

import modelo.Livro;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		
		Livro l = new Livro();
		
		LivroControle lcon = new LivroControle(jan, l);
	}

}
