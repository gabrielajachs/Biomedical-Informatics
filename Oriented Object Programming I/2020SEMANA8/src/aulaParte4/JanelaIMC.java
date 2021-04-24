package aulaParte4;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaIMC extends JFrame {

	private JPanel contentPane;
	private JTextField fieldPeso;
	private JTextField fieldAltura;
	private JLabel labelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaIMC frame = new JanelaIMC();
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
	public JanelaIMC() {
		setTitle("Calculando IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 203);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelPeso = new JLabel("Peso");
		labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPeso.setBounds(12, 12, 70, 15);
		contentPane.add(labelPeso);
		
		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAltura.setBounds(12, 50, 70, 15);
		contentPane.add(labelAltura);
		
		fieldPeso = new JTextField();
		fieldPeso.setBounds(64, 12, 114, 19);
		contentPane.add(fieldPeso);
		fieldPeso.setColumns(10);
		
		fieldAltura = new JTextField();
		fieldAltura.setBounds(64, 49, 114, 19);
		contentPane.add(fieldAltura);
		fieldAltura.setColumns(10);
		
		JButton buttonCalcular = new JButton("Calcular IMC");
		buttonCalcular.addActionListener(new ActionListener() {
			/*aqui vai começar o evento*/
			public void actionPerformed(ActionEvent arg0) {
				
				Imc objIMC = new Imc(Float.parseFloat(fieldAltura.getText()), Float.parseFloat(fieldPeso.getText()));
				labelResultado.setText(String.valueOf(objIMC.CalculaImc()));
			}
		});
		buttonCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonCalcular.setBounds(12, 94, 117, 25);
		contentPane.add(buttonCalcular);
		
		labelResultado = new JLabel(""); /*esse JLabel labelResultado, sempre transformar em ~private JLabel labelResultado~ lá em cima */
		labelResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelResultado.setBounds(233, 13, 178, 106);
		contentPane.add(labelResultado);
	}

}
