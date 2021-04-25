package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;

public class JanelaSomaDoisNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField fieldPrimeiroNumero;
	private JLabel labelSegundoNumero;
	private JTextField fieldSegundoNumero;
	private JButton btnSomar;
	private JButton btnLimpar;
	private JTextArea textAreaResultado;
	private ButtonGroup group;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaSomaDoisNumeros frame = new JanelaSomaDoisNumeros();
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
	public JanelaSomaDoisNumeros() {
		setTitle("Tela para Soma de Dois Números");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 295);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][]", "[grow][][][][]"));
		
		textAreaResultado = new JTextArea();
		textAreaResultado.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(textAreaResultado, "cell 0 0 2 1,grow");
		
		JLabel labelPrimeiroNmero = new JLabel("Primeiro Número:");
		contentPane.add(labelPrimeiroNmero, "flowx,cell 0 2");
		
		fieldPrimeiroNumero = new JTextField();
		contentPane.add(fieldPrimeiroNumero, "cell 0 2");
		fieldPrimeiroNumero.setColumns(10);
		
		labelSegundoNumero = new JLabel("Segundo Número:");
		contentPane.add(labelSegundoNumero, "flowx,cell 1 2");
		
		fieldSegundoNumero = new JTextField();
		contentPane.add(fieldSegundoNumero, "cell 1 2");
		fieldSegundoNumero.setColumns(10);
		
		btnSomar = new JButton("Somar");
		contentPane.add(btnSomar, "cell 0 4,alignx right");
		
		btnLimpar = new JButton("Limpar");
		contentPane.add(btnLimpar, "cell 1 4");
	}

	public JTextField getFieldPrimeiroNumero() {
		return fieldPrimeiroNumero;
	}

	public void setFieldPrimeiroNumero(JTextField fieldPrimeiroNumero) {
		this.fieldPrimeiroNumero = fieldPrimeiroNumero;
	}

	public JTextField getFieldSegundoNumero() {
		return fieldSegundoNumero;
	}

	public void setFieldSegundoNumero(JTextField fieldSegundoNumero) {
		this.fieldSegundoNumero = fieldSegundoNumero;
	}

	public JButton getBtnSomar() {
		return btnSomar;
	}

	public void setBtnSomar(JButton btnSomar) {
		this.btnSomar = btnSomar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JTextArea getTextAreaResultado() {
		return textAreaResultado;
	}

	public void setTextAreaResultado(JTextArea textAreaResultado) {
		this.textAreaResultado = textAreaResultado;
	}
	
	public void limparTela() {  
		fieldPrimeiroNumero.setText("");
		fieldSegundoNumero.setText("");
		textAreaResultado.setText("");
	}

}
