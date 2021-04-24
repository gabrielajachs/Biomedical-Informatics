package exemplosAula2;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBoxLayout extends JFrame {

	private JPanel contentPane;
	
	public ExemploBoxLayout () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new Button("Botão 1"));
		contentPane.add(new Button("Botão 2"));
		contentPane.add(new Button("Botão 3"));
		contentPane.add(new Button("Botão 4"));
		contentPane.add(new Button("Botão 5"));
		
		setContentPane(contentPane);
	}
	
	public static void main(String[] args) {
		
		ExemploBoxLayout janela = new ExemploBoxLayout();
		janela.setVisible(true);
		
		
	}
}
