package visao;

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
import javax.swing.ImageIcon;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JLabel lblEndereco;
	private JLabel lblProfissao;
	private JTextField fieldEndereco;
	private JComboBox<String> comboBox;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] e) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
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
	public JanelaCadastro() {
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
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("");
		comboBox.addItem("Professor");
		comboBox.addItem("Médico");
		contentPane.add(comboBox, "cell 4 1,growx");
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/ok1.png")));
		contentPane.add(buttonCadastrar, "flowx, cell 0 3 2 1,growx");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 0 0,growx");
		fieldCPF.setColumns(10);
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 0 1 3 1,growx");
		fieldEndereco.setColumns(10);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setIcon(new ImageIcon(JanelaCadastro.class.getResource("/figuras/clean.png")));
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(buttonLimpar, "cell 0 3 2 1,growx");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 1 0 3 1,growx");
		fieldNome.setColumns(10);
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JLabel getLblEndereco() {
		return lblEndereco;
	}

	public void setLblEndereco(JLabel lblEndereco) {
		this.lblEndereco = lblEndereco;
	}

	public JLabel getLblProfissao() {
		return lblProfissao;
	}

	public void setLblProfissao(JLabel lblProfissao) {
		this.lblProfissao = lblProfissao;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}
	
	public void limpaTelaCadastro() {
		fieldCPF.setText("");
		fieldEndereco.setText("");
		fieldNome.setText("");
		comboBox.setSelectedIndex(0);
		
	}

}
