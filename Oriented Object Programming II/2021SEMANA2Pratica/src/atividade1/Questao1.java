package atividade1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Questao1 {
	
	public static void main(String[] args) {
		
		//dialogo de entrada de dados
		String nome;
		
		nome = (String) JOptionPane.showInputDialog(null, "Informe o seu primeiro nome: ", "Entrada de Dados", 3, 
				new ImageIcon(Questao1.class.getResource("/figuras/informacao.png")), null, null);
		
		//dialogo de mensagem
		JOptionPane.showMessageDialog(null, "Nome do estudante: " + nome, "Saída", 2, 
				new ImageIcon(Questao1.class.getResource("/figuras/informacao.png")));
	}

}
