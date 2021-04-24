package exercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class MinhaJanela extends JFrame {

	private JPanel contentPane;
	private JTextField fieldRaio;
	private JLabel labelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela frame = new MinhaJanela();
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
	public MinhaJanela() {
		setTitle("Calculando a Área de um Círculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 370, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelRaio = new JLabel("Raio");
		labelRaio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelRaio.setBounds(12, 12, 70, 15);
		contentPane.add(labelRaio);
		
		fieldRaio = new JTextField();
		fieldRaio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldRaio.setBounds(50, 10, 114, 19);
		contentPane.add(fieldRaio);
		fieldRaio.setColumns(10);
		
		JButton buttonCalcula = new JButton("Calcular Área do Círculo");
		buttonCalcula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCalcula.setBounds(12, 64, 202, 25);
		contentPane.add(buttonCalcula);
		
		labelResultado = new JLabel("");
		labelResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelResultado.setBounds(232, 12, 105, 62);
		contentPane.add(labelResultado);
	}

}
