package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;

public class JanelaCadastro1 extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JLabel lblEndereco;
	private JLabel lblProfissao;
	private JTextField fieldEndereco;
	private JComboBox comboBox;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro1 frame = new JanelaCadastro1();
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
	public JanelaCadastro1() {
		setTitle("Janela de Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][][grow]", "[][][25px][]"));
		
		JLabel lblCpf = new JLabel("CPF");
		contentPane.add(lblCpf, "flowx,cell 0 0,alignx left");
		
		JLabel lblNome = new JLabel("Nome");
		contentPane.add(lblNome, "flowx,cell 1 0 4 1,alignx left");
		
		lblEndereco = new JLabel("Endereço");
		contentPane.add(lblEndereco, "flowx,cell 0 1 3 1,alignx left");
		
		lblProfissao = new JLabel("Profissão");
		contentPane.add(lblProfissao, "cell 3 1,alignx left");
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "cell 4 1,growx");
		
		buttonCadastrar = new JButton("Cadastrar");
		contentPane.add(buttonCadastrar, "flowx, cell 0 3 2 1,growx");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 0 0,growx");
		fieldCPF.setColumns(10);
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 0 1 3 1,growx");
		fieldEndereco.setColumns(10);
		
		buttonLimpar = new JButton("Limpar");
		contentPane.add(buttonLimpar, "cell 0 3 2 1,growx");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 1 0 3 1,growx");
		fieldNome.setColumns(10);
	}

}
