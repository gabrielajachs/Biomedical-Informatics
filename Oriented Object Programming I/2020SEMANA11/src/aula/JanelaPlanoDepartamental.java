package aula;

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
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaPlanoDepartamental extends JFrame {

	private JPanel contentPane;
	private JTextField fieldDisciplina;
	private JLabel lblProfessorRegente;
	private JTextField fieldRegente;
	private JLabel lblNmeroDeTurmas;
	private JTextField fieldNumTurmaDisc;
	private JLabel lblNmeroDeAlunos;
	private JTextField fieldAlunosTurma;
	private JLabel lblPerodoDoAno;
	private JTextField fieldPeriodoAno;
	private JLabel lblCargaHorriaSemanal;
	private JTextField fieldCHSemana;
	private JLabel lblChSemanalPrtica;
	private JTextField fieldCHPratica;
	private JLabel lblNewLabel;
	private JTextField fieldCHTotal;
	private JLabel lblNmeroTotalDe;
	private JTextField fieldMonitoresSol;
	private JLabel lblNewLabel_1;
	private JTextField fieldMonitoresRec;
	private JLabel lblNomeDosMonitores;
	private JLabel lblProcessoDeSeleo;
	private JComboBox comboDia;
	private JLabel lblDe;
	private JComboBox comboMes;
	private JLabel lblDe_1;
	private JComboBox comboAno;
	private JLabel lbls;
	private JComboBox comboHora;
	private JLabel lblHorasE;
	private JComboBox comboMinutos;
	private JLabel lblMinutos;
	private JLabel lblLocal;
	private JTextField fieldLocal;
	private JLabel lblPrrequisitos;
	private JTextField fieldRequisitos;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel labelCurso;
	private JTextField fieldCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPlanoDepartamental frame = new JanelaPlanoDepartamental();
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
	public JanelaPlanoDepartamental() {
		setTitle("Janela Plano Departamental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 554);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][][57.00][grow][][][grow][][][][grow][][grow][]", "[][][][][][][][][grow][][][][][][][]"));
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		contentPane.add(lblDisciplina, "cell 0 0 3 1,spanx 4,alignx left");
		
		fieldDisciplina = new JTextField();
		contentPane.add(fieldDisciplina, "cell 0 0 3 1,growx,alignx left");
		fieldDisciplina.setColumns(10);
		
		labelCurso = new JLabel("Curso");
		contentPane.add(labelCurso, "flowx,cell 4 0, spanx");
		
		lblProfessorRegente = new JLabel("Professor Regente");
		contentPane.add(lblProfessorRegente, "cell 0 1 15 1,alignx left");
		
		fieldRegente = new JTextField();
		contentPane.add(fieldRegente, "cell 0 1 15 1,growx");
		fieldRegente.setColumns(10);
		
		lblNmeroDeTurmas = new JLabel("N\u00FAmero de Turmas por Disciplina");
		contentPane.add(lblNmeroDeTurmas, "flowx,cell 0 2 5 1,alignx left");
		
		lblNmeroDeAlunos = new JLabel("N\u00FAmero de Alunos por Turma");
		contentPane.add(lblNmeroDeAlunos, "flowx,cell 5 2,spanx, alignx trailing");
		
		lblPerodoDoAno = new JLabel("Per\u00EDodo do Ano em que a disciplina \u00E9 ministrada");
		contentPane.add(lblPerodoDoAno, "flowx,cell 0 3 15 1,alignx left");
		
		lblCargaHorriaSemanal = new JLabel("Carga Hor\u00E1ria Semanal Te\u00F3rica");
		contentPane.add(lblCargaHorriaSemanal, "flowx,cell 0 4,spanx 3, alignx left");
		
		lblChSemanalPrtica = new JLabel("CH Semanal Pr\u00E1tica");
		contentPane.add(lblChSemanalPrtica, "flowx,cell 4 4 4 1,alignx left");
		
		lblNewLabel = new JLabel("CH Semanal Total");
		contentPane.add(lblNewLabel, "cell 8 4 7 1,alignx left");
		
		fieldCHTotal = new JTextField();
		contentPane.add(fieldCHTotal, "cell 8 4 7 1,growx");
		fieldCHTotal.setColumns(10);
		
		lblNmeroTotalDe = new JLabel("N\u00FAmero Total de Monitores Solicitados");
		contentPane.add(lblNmeroTotalDe, "flowx,cell 0 5 15 1,alignx left");
		
		lblNewLabel_1 = new JLabel("N\u00FAmero de Monitores Reconduzidos");
		contentPane.add(lblNewLabel_1, "flowx,cell 0 6 15 1,alignx left");
		
		lblNomeDosMonitores = new JLabel("Nome dos Monitores que ser\u00E3o reconduzidos");
		contentPane.add(lblNomeDosMonitores, "cell 0 7,alignx left");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 8 15 3,growx,growy 3");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblProcessoDeSeleo = new JLabel("Processo de Sele\u00E7\u00E3o inicar\u00E1 no dia");
		contentPane.add(lblProcessoDeSeleo, "flowx,cell 0 11,spanx 2, alignx left");
		
		lblDe = new JLabel("De");
		contentPane.add(lblDe, "cell 2 11 3 1,spanx 4,alignx trailing");
		
		comboMes = new JComboBox();
		contentPane.add(comboMes, "cell 2 11 4 1,growx");
		
		lblDe_1 = new JLabel("De");
		contentPane.add(lblDe_1, "flowx,cell 6 11 4 1,alignx left");
		
		comboAno = new JComboBox();
		contentPane.add(comboAno, "cell 6 11 4 1,growx");
		
		lbls = new JLabel("\u00E0s");
		contentPane.add(lbls, "cell 10 11,alignx trailing");
		
		comboHora = new JComboBox();
		contentPane.add(comboHora, "cell 11 11,growx");
		
		lblHorasE = new JLabel("horas e");
		contentPane.add(lblHorasE, "cell 12 11,alignx trailing");
		
		comboMinutos = new JComboBox();
		contentPane.add(comboMinutos, "cell 13 11,growx");
		
		lblMinutos = new JLabel("minutos");
		contentPane.add(lblMinutos, "cell 14 11");
		
		lblLocal = new JLabel("Local");
		contentPane.add(lblLocal, "flowx,cell 0 12 15 1,alignx left");
		
		lblPrrequisitos = new JLabel("Pr\u00E9-Requisitos");
		contentPane.add(lblPrrequisitos, "flowx,cell 0 13 15 1,alignx left");
		
		btnCadastrar = new JButton("Cadastrar");
		contentPane.add(btnCadastrar, "flowx,cell 0 15");
		
		fieldNumTurmaDisc = new JTextField();
		contentPane.add(fieldNumTurmaDisc, "cell 0 2 5 1,growx");
		fieldNumTurmaDisc.setColumns(10);
		
		fieldCHSemana = new JTextField();
		contentPane.add(fieldCHSemana, "cell 0 4 3 1,growx");
		fieldCHSemana.setColumns(10);
		
		fieldCHPratica = new JTextField();
		contentPane.add(fieldCHPratica, "cell 4 4 4 1,growx");
		fieldCHPratica.setColumns(10);
		
		fieldMonitoresSol = new JTextField();
		contentPane.add(fieldMonitoresSol, "cell 0 5 15 1,growx");
		fieldMonitoresSol.setColumns(10);
		
		fieldMonitoresRec = new JTextField();
		contentPane.add(fieldMonitoresRec, "cell 0 6 15 1,growx");
		fieldMonitoresRec.setColumns(10);
		
		fieldPeriodoAno = new JTextField();
		contentPane.add(fieldPeriodoAno, "cell 0 3 15 1,growx");
		fieldPeriodoAno.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		contentPane.add(btnLimpar, "cell 0 15, gap 10");
		
		comboDia = new JComboBox();
		contentPane.add(comboDia, "cell 0 11 2 1,growx");
		
		fieldLocal = new JTextField();
		contentPane.add(fieldLocal, "cell 0 12 15 1,growx");
		fieldLocal.setColumns(10);
		
		fieldRequisitos = new JTextField();
		contentPane.add(fieldRequisitos, "cell 0 13 15 1,growx");
		fieldRequisitos.setColumns(10);
		
		fieldCurso = new JTextField();
		contentPane.add(fieldCurso, "cell 4 0, growx");
		fieldCurso.setColumns(10);
		
		fieldAlunosTurma = new JTextField();
		contentPane.add(fieldAlunosTurma, "cell 5 2 8 1,growx");
		fieldAlunosTurma.setColumns(10);
	}

}