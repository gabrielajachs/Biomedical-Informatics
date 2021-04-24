package exemplosAula2;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout extends JFrame {
	
	public ExemploBorderLayout() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		JPanel contentPane = new JPanel();
		
		BorderLayout layout = new BorderLayout();
		contentPane.setLayout(layout);
		
		contentPane.add(new Button("Botão 1"), BorderLayout.NORTH);
		contentPane.add(new Button("Botão 2"), BorderLayout.SOUTH);
		contentPane.add(new Button("Botão 3"), BorderLayout.CENTER);
		contentPane.add(new Button("Botão 4"), BorderLayout.EAST);
		contentPane.add(new Button("Botão 5"), BorderLayout.WEST);
		
		setContentPane(contentPane);
	}
	
	public static void main(String[] args) {
		
		ExemploBorderLayout janela = new ExemploBorderLayout();
		janela.setVisible(true);
	}
	

}
