package aulaParte3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class ExemploJFrame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploJFrame3 frame = new ExemploJFrame3();
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
	public ExemploJFrame3() {
		setTitle("Minha Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonAdicionar = new JButton("Adicionar");
		buttonAdicionar.setBounds(28, 190, 159, 30);
		buttonAdicionar.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(buttonAdicionar);
		
		JButton buttonRemover = new JButton("Remover");
		buttonRemover.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonRemover.setBounds(224, 190, 159, 30);
		contentPane.add(buttonRemover);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNome.setBounds(28, 22, 70, 15);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(90, 21, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
