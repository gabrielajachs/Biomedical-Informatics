package questao6;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaDeOperações extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldRG;
	private JTextField fieldCpf;
	private JTextField fieldClasse;
	private JTextField fieldEndereco;
	private JTextField fieldNumero;
	private JTextField fieldBairro;
	private JTextField fieldComplemento;
	private JTextField fieldCidade;
	private JTextField fieldUf;
	private JTextField fieldCEP;
	private JTextField fieldCadastroProdutorRural;
	private JTextField fieldCadastroSUFRAMA;
	private JTextField fieldCelular;
	private JTextField fieldEmail;
	private JComboBox<String> comboBoxCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeOperações frame = new TelaDeOperações();
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
	public TelaDeOperações() {
		setTitle("Tela de Operações");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[390.00,grow][390.00,grow][390.00,grow][390.00,grow][390.00,grow][87.00,grow][390.00,grow][grow]", "[][][][][][][][][][82.00,grow][][][][][][][grow][grow][grow][][]"));
		
		JLabel labelCliente = new JLabel("Cliente");
		contentPane.add(labelCliente, "flowx,cell 0 0 7 1");
		
		JLabel labelCodigo = new JLabel("Código");
		contentPane.add(labelCodigo, "cell 7 0");
		
		comboBoxCliente = new JComboBox<String>();
		contentPane.add(comboBoxCliente, "cell 0 1 7 1,growx");
		comboBoxCliente.addItem("");
		comboBoxCliente.addItem("Mariana Silva");
		comboBoxCliente.addItem("José Carlos Oliveira");
		
		fieldCodigo = new JTextField();
		contentPane.add(fieldCodigo, "cell 7 1,growx");
		fieldCodigo.setColumns(10);
		
		JLabel labelRG = new JLabel("RG");
		contentPane.add(labelRG, "flowx,cell 0 2 7 1");
		
		fieldRG = new JTextField();
		contentPane.add(fieldRG, "cell 0 3,growx");
		fieldRG.setColumns(10);
		
		fieldCpf = new JTextField();
		contentPane.add(fieldCpf, "cell 1 3,growx");
		fieldCpf.setColumns(10);
		
		fieldClasse = new JTextField();
		contentPane.add(fieldClasse, "cell 2 3 5 1,growx");
		fieldClasse.setColumns(10);
		
		JCheckBox checkboxInativo = new JCheckBox("Inativo");
		contentPane.add(checkboxInativo, "cell 7 3");
		
		JLabel labelEndereco = new JLabel("Endereço");
		contentPane.add(labelEndereco, "cell 0 4 2 1");
		
		JLabel labelNumero = new JLabel("Número");
		contentPane.add(labelNumero, "flowx,cell 4 4");
		
		JLabel labelBairro = new JLabel("Bairro");
		contentPane.add(labelBairro, "cell 6 4");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 0 5 4 1,growx");
		fieldEndereco.setColumns(10);
		
		fieldNumero = new JTextField();
		contentPane.add(fieldNumero, "cell 4 5 2 1,growx");
		fieldNumero.setColumns(10);
		
		fieldBairro = new JTextField();
		contentPane.add(fieldBairro, "cell 6 5 2 1,growx");
		fieldBairro.setColumns(10);
		
		JLabel labelComplemento = new JLabel("Complemento");
		contentPane.add(labelComplemento, "flowx,cell 0 6 2 1");
		
		JLabel labelUf = new JLabel("UF");
		contentPane.add(labelUf, "cell 4 6");
		
		JLabel labelCep = new JLabel("CEP");
		contentPane.add(labelCep, "cell 6 6");
		
		fieldComplemento = new JTextField();
		contentPane.add(fieldComplemento, "cell 0 7,growx");
		fieldComplemento.setColumns(10);
		
		fieldCidade = new JTextField();
		contentPane.add(fieldCidade, "cell 1 7 3 1,growx");
		fieldCidade.setColumns(10);
		
		fieldUf = new JTextField();
		contentPane.add(fieldUf, "cell 4 7 2 1,growx");
		fieldUf.setColumns(10);
		
		fieldCEP = new JTextField();
		contentPane.add(fieldCEP, "cell 6 7 2 1,growx");
		fieldCEP.setColumns(10);
		
		JLabel labelFone = new JLabel("Fone");
		contentPane.add(labelFone, "cell 0 8 2 1");
		
		JLabel labelFax = new JLabel("Fax");
		contentPane.add(labelFax, "cell 2 8 3 1");
		
		JScrollPane scrollPaneFone = new JScrollPane();
		contentPane.add(scrollPaneFone, "cell 0 9 2 1,grow");
		
		JTextArea textAreaFone = new JTextArea();
		scrollPaneFone.setViewportView(textAreaFone);
		
		JScrollPane scrollPaneFax = new JScrollPane();
		contentPane.add(scrollPaneFax, "cell 2 9 5 1,grow");
		
		JTextArea textAreaFax = new JTextArea();
		scrollPaneFax.setViewportView(textAreaFax);
		
		JLabel labelCelular = new JLabel("Celular");
		contentPane.add(labelCelular, "cell 0 10 2 1");
		
		JLabel labelEmail = new JLabel("E-mail");
		contentPane.add(labelEmail, "cell 2 10 3 1");
		
		fieldCelular = new JTextField();
		contentPane.add(fieldCelular, "cell 0 11 2 1,growx");
		fieldCelular.setColumns(10);
		
		fieldEmail = new JTextField();
		contentPane.add(fieldEmail, "cell 2 11 5 1,growx");
		fieldEmail.setColumns(10);
		
		JLabel labelCadastroProdutorRural = new JLabel("Cadastro Produtor Rural");
		contentPane.add(labelCadastroProdutorRural, "cell 0 12 2 1");
		
		JLabel labelCadastroSuframa = new JLabel("Cadastro SUFRAMA");
		contentPane.add(labelCadastroSuframa, "cell 2 12 3 1");
		
		fieldCadastroProdutorRural = new JTextField();
		contentPane.add(fieldCadastroProdutorRural, "cell 0 13 2 1,growx");
		fieldCadastroProdutorRural.setColumns(10);
		
		fieldCadastroSUFRAMA = new JTextField();
		contentPane.add(fieldCadastroSUFRAMA, "cell 2 13 5 1,growx");
		fieldCadastroSUFRAMA.setColumns(10);
		
		JLabel labelObservacao = new JLabel("Observação");
		contentPane.add(labelObservacao, "cell 0 14 2 1");
		
		JScrollPane scrollPaneObs = new JScrollPane();
		contentPane.add(scrollPaneObs, "cell 0 15 8 4,grow");
		
		JTextArea textAreaObs = new JTextArea();
		scrollPaneObs.setViewportView(textAreaObs);
		
		JButton buttonBuscaAvancada = new JButton("Busca Avançada");
		contentPane.add(buttonBuscaAvancada, "cell 0 19");
		
		JButton buttonUltimaBusca = new JButton("Última Busca");
		contentPane.add(buttonUltimaBusca, "cell 1 19");
		
		JButton buttonSeta1 = new JButton("<|");
		contentPane.add(buttonSeta1, "cell 2 19");
		
		JButton buttonSeta2 = new JButton("|>");
		contentPane.add(buttonSeta2, "cell 3 19");
		
		JButton buttonCrediario = new JButton("Crediário");
		contentPane.add(buttonCrediario, "cell 0 20,growx");
		
		JButton buttonOperacoes = new JButton("Operações");
		contentPane.add(buttonOperacoes, "cell 1 20,growx");
		
		JButton buttonResumo = new JButton("Resumo");
		contentPane.add(buttonResumo, "cell 2 20 2 1,growx");
		
		JButton buttonDevedores = new JButton("Devedores");
		contentPane.add(buttonDevedores, "cell 4 20");
		
		JButton buttonEditarFicha = new JButton("Editar Ficha");
		contentPane.add(buttonEditarFicha, "cell 5 20");
		
		JButton buttonSair = new JButton("Sair");
		contentPane.add(buttonSair, "cell 6 20");
		
		JLabel labelCidade = new JLabel("Cidade");
		contentPane.add(labelCidade, "cell 1 6 3 1");
		
		JLabel labelCpf = new JLabel("CPF");
		contentPane.add(labelCpf, "cell 1 2 3 1");
		
		JLabel labelClasse = new JLabel("Classe");
		contentPane.add(labelClasse, "cell 2 2");
	}

}
