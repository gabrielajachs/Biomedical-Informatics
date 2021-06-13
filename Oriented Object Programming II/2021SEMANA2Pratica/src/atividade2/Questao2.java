package atividade2;

import javax.swing.JOptionPane;

public class Questao2 {
	
	public static void main(String[] args) {
		
		/*
		2)Implemente um programa que solicite ao usuário a entrada de dois números do tipo real por
		meio de caixa de diálogo. Os números referem-se à largura e a altura de um retângulo e devem
		ser utilizados para o cálculo da área do retângulo (Lembre-se: a área de um retângulo é sua
		largura multiplicada pela altura.). Os ícones das caixas de diálogo de entrada de dados são do
		tipo QUESTION_MESSAGE com o título da caixa: “Entrada de dados” e, para exibição do
		resultado utilize: INFORMATION_MESSAGE com o título “Resultado”.
		*/
		
		Float largura, altura, areaRetangulo;
		
		largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Largura do triangulo: ", "Entrada de dados", 3));
		altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura do triangulo: ", "Entrada de dados", 3));
		
		areaRetangulo = largura*altura;
		
		JOptionPane.showMessageDialog(null, "Resultado da Area do Retangulo: " +areaRetangulo+ "", "Resultado", 1);
		
	}
	
	
}
