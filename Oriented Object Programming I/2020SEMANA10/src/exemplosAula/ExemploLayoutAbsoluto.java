package exemplosAula;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ExemploLayoutAbsoluto extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField fieldEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploLayoutAbsoluto frame = new ExemploLayoutAbsoluto();
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
	public ExemploLayoutAbsoluto() {
		setTitle("Janela de Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelCPF = new JLabel("CPF:");
		labelCPF.setBounds(12, 12, 159, 15);
		contentPane.add(labelCPF);
		
		fieldCPF = new JTextField();
		fieldCPF.setBounds(48, 10, 123, 19);
		contentPane.add(fieldCPF);
		fieldCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(189, 12, 70, 15);
		contentPane.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(238, 10, 123, 19);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(12, 39, 114, 15);
		contentPane.add(lblEndereco);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setBounds(92, 39, 273, 19);
		contentPane.add(fieldEndereco);
		fieldEndereco.setColumns(10);
		
		JComboBox comboProfissao = new JComboBox();
		comboProfissao.setBounds(92, 66, 273, 24);
		contentPane.add(comboProfissao);
		
		JLabel lblProfissao = new JLabel("Profissão:");
		lblProfissao.setBounds(6, 71, 97, 15);
		contentPane.add(lblProfissao);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(27, 98, 117, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(168, 98, 117, 25);
		contentPane.add(btnLimpar);
	}
}
