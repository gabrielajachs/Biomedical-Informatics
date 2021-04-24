package atividadePratica2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroDeCliente extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCliente frame = new CadastroDeCliente();
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
	public CadastroDeCliente() {
		setTitle("Janela de Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel1);
		
		JLabel lblCpf = new JLabel("CPF");
		panel1.add(lblCpf);
		
		fieldCPF = new JTextField();
		panel1.add(fieldCPF);
		fieldCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		panel1.add(lblNome);
		
		fieldNome = new JTextField();
		panel1.add(fieldNome);
		fieldNome.setColumns(20);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel2);
		
		JLabel lblEndereco = new JLabel("Endereço");
		panel2.add(lblEndereco);
		
		textField = new JTextField();
		panel2.add(textField);
		textField.setColumns(15);
		
		JLabel lblProfissao = new JLabel("Profissão");
		panel2.add(lblProfissao);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(122, 24));
		panel2.add(comboBox);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panel3.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		panel3.add(btnLimpar);
	}

}
