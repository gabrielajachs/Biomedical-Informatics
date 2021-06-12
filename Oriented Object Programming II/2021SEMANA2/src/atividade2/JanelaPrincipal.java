package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel labelMensagem;
	private static JanelaPrincipal frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("JDiaglog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelMensagem = new JLabel("Direção Pendente");
		labelMensagem.setFont(new Font("Dialog", Font.BOLD, 25));
		labelMensagem.setBounds(30, 12, 297, 30);
		contentPane.add(labelMensagem);
		
		JButton btnMostrarDialogo = new JButton("Mostrar Diálogo");
		btnMostrarDialogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDialogDemo jd = new JDialogDemo(frame);
			}
		});
		btnMostrarDialogo.setBounds(30, 78, 164, 25);
		contentPane.add(btnMostrarDialogo);
		
		JButton btnRedefinirDialogo = new JButton("Redefinir Diálogo");
		btnRedefinirDialogo.setBounds(206, 78, 164, 25);
		contentPane.add(btnRedefinirDialogo);
	}

	public JLabel getLabelMensagem() {
		return labelMensagem;
	}

	public void setLabelMensagem(JLabel labelMensagem) {
		this.labelMensagem = labelMensagem;
	}
	
	
	
	
	
	
}
