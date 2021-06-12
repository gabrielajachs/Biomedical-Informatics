package atividade2;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogDemo {
	
	private JanelaPrincipal jan;
	
	public JDialogDemo(JanelaPrincipal j) {
		this.jan = j;
		JDialog diag = new JDialog(jan, true);
		diag.setTitle("Direção");
		diag.setBounds(100, 100, 300, 150);
		diag.getContentPane().setLayout(null);
		
		JButton btnUp = new JButton("Up");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jan.getLabelMensagem().setText("UP");
			}
		});
		btnUp.setBounds(12, 35, 117, 25);
		diag.getContentPane().add(btnUp);
		
		JButton btnDown = new JButton("Down");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jan.getLabelMensagem().setText("Down");
			}
		});
		btnDown.setBounds(151, 35, 117, 25);
		diag.getContentPane().add(btnDown);
		
		JLabel labelMensagem = new JLabel("Pressione um botão");
		labelMensagem.setBounds(80, 72, 142, 15);
		diag.getContentPane().add(labelMensagem);
		
		diag.setVisible(true);
	}
}
