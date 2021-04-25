package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldISBN;
	private JTextField fieldTitulo;
	private JTextField fieldAutor;
	private JButton btnConsultar;
	private JButton btnCadastrar;
	

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Livraria Infobio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[][][][]"));
		
		JLabel labelISBN = new JLabel("ISBN:");
		contentPane.add(labelISBN, "flowx,cell 0 0,alignx left");
		
		JLabel labelTitulo = new JLabel("Título:");
		contentPane.add(labelTitulo, "flowx,cell 1 0");
		
		fieldTitulo = new JTextField();
		contentPane.add(fieldTitulo, "cell 1 0,growx");
		fieldTitulo.setColumns(10);
		
		JLabel labelAutor = new JLabel("Autor:");
		contentPane.add(labelAutor, "flowx,cell 0 1 2 1,alignx left,gapy 10");
		
		btnCadastrar = new JButton("Cadastrar");
		contentPane.add(btnCadastrar, "flowx,cell 0 3,growx");
		
		btnConsultar = new JButton("Consultar");
		contentPane.add(btnConsultar, "cell 0 3,growx");
		
		fieldISBN = new JTextField();
		contentPane.add(fieldISBN, "cell 0 0,growx");
		fieldISBN.setColumns(10);
		
		fieldAutor = new JTextField();
		contentPane.add(fieldAutor, "cell 0 1 2 1,growx");
		fieldAutor.setColumns(10);
	}
	
	public void limparTela() {
		fieldAutor.setText("");
		fieldISBN.setText("");
		fieldTitulo.setText("");
		
	}

	public JTextField getFieldISBN() {
		return fieldISBN;
	}

	public void setFieldISBN(JTextField fieldISBN) {
		this.fieldISBN = fieldISBN;
	}

	public JTextField getFieldTitulo() {
		return fieldTitulo;
	}

	public void setFieldTitulo(JTextField fieldTitulo) {
		this.fieldTitulo = fieldTitulo;
	}

	public JTextField getFieldAutor() {
		return fieldAutor;
	}

	public void setFieldAutor(JTextField fieldAutor) {
		this.fieldAutor = fieldAutor;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}
	
	

}
