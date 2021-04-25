package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import modelo.Calculadora;
import visao.JanelaSomaDoisNumeros;

public class CalculadoraControle implements ActionListener {
	
	private JanelaSomaDoisNumeros jan;
	private Calculadora calc;
	private LinkedList<Calculadora> lista = new LinkedList<Calculadora>();
	
	public CalculadoraControle(JanelaSomaDoisNumeros j, Calculadora cal) {
		this.jan = j;
		this.calc = cal;
		this.jan.getBtnLimpar().addActionListener(this);
		this.jan.getBtnSomar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Limpar")) {
			
			this.jan.limparTela();
			
		}if (e.getActionCommand().equals("Somar"))
			
			this.calc.setNumeroUm(Float.parseFloat(this.jan.getFieldPrimeiroNumero().getText()));
			this.calc.setNumeroDois(Float.parseFloat(this.jan.getFieldSegundoNumero().getText()));
			this.jan.getTextAreaResultado().setText(String.valueOf(calc.somar()));
	}
	}



