package atividade5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao5 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JRadioButton rdbtnNeutrofilos;
	private JRadioButton rdbtnMacrofagos;
	private JRadioButton rdbtnNaturalKillers;
	private JRadioButton rdbtnLinfocitosT;
	private JRadioButton rdbtnLinfocitosB;
	private String opcao;
	private static String[] resposta;
	private static String[] pergunta;
	private static String[][] alternativas;
	private int acer;
	private int err;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			String[][] alt = {{"Neutrófilos", "Macrófagos", "Natural Killers", "Linfócitos T", "Linfócitos B"}, {"Neutrófilos", "Macrófagos", "Natural Killers", "Linfócitos T", "Linfócitos B"}, {"Neutrófilos", "Macrófagos", "Natural Killers", "Linfócitos T", "Linfócitos B"}};
			String[] respp = {"4", "2", "5"};
			String[] pergg = {"Qual a célula principal do sistema imunológico?", "Qual destas células é a primeira acionada quando ha necessidade?", "Qual destas produz anticorpos?"};
			setResposta(respp);
			setPergunta(pergg);
			setAlternativas(alt);
			Questao5 dialog = new Questao5(0, 0, 0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Questao5(int perg_index, int acertos, int erros) {

		acer = acertos;
		err = erros;
		
		setBounds(100, 100, 693, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPergunta = new JLabel(getPergunta()[perg_index]);
			lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblPergunta.setBounds(76, 35, 504, 55);
			contentPanel.add(lblPergunta);
		}
		
		rdbtnNeutrofilos = new JRadioButton(getAlternativas()[perg_index][0]);
		rdbtnNeutrofilos.setBounds(76, 133, 109, 23);
		contentPanel.add(rdbtnNeutrofilos);
		
		rdbtnMacrofagos = new JRadioButton(getAlternativas()[perg_index][1]);
		rdbtnMacrofagos.setBounds(76, 159, 109, 23);
		contentPanel.add(rdbtnMacrofagos);
		
		rdbtnNaturalKillers = new JRadioButton(getAlternativas()[perg_index][2]);
		rdbtnNaturalKillers.setBounds(76, 185, 109, 23);
		contentPanel.add(rdbtnNaturalKillers);
		
		rdbtnLinfocitosT = new JRadioButton(getAlternativas()[perg_index][3]);
		rdbtnLinfocitosT.setBounds(76, 211, 109, 23);
		contentPanel.add(rdbtnLinfocitosT);
		
		rdbtnLinfocitosB = new JRadioButton(getAlternativas()[perg_index][4]);
		rdbtnLinfocitosB.setBounds(76, 237, 109, 23);
		contentPanel.add(rdbtnLinfocitosB);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNeutrofilos);
		group.add(rdbtnMacrofagos);
		group.add(rdbtnNaturalKillers);
		group.add(rdbtnLinfocitosT);
		group.add(rdbtnLinfocitosB);
		
		
		
		JButton btnVerifica = new JButton("Verifica");
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
                if (rdbtnNeutrofilos.isSelected()) { 
                	opcao = "1"; 
                } 
  
                else if (rdbtnMacrofagos.isSelected()) { 
                	opcao = "2"; 
                } 
                else if (rdbtnNaturalKillers.isSelected()) {  
                	opcao = "3"; 
                	
                }  else if (rdbtnLinfocitosT.isSelected()) { 
                	opcao = "4"; 
                	
                }  else if (rdbtnLinfocitosB.isSelected()) { 
                	opcao = "5"; 
                	
                } 
                else {
                	opcao = "6";
                	
                }
 
					if(opcao == getResposta()[perg_index]) {
	                	opcao = "Correto!";
	                	acer++;
	                }
	                else {
	                	opcao = "Errado!";
	                	err++;
	                }
	 
	                rdbtnNeutrofilos.setEnabled(false);
	                rdbtnMacrofagos.setEnabled(false);
	                rdbtnNaturalKillers.setEnabled(false);
	                rdbtnLinfocitosT.setEnabled(false);
	                rdbtnLinfocitosB.setEnabled(false);
	                
	                JOptionPane.showMessageDialog(Questao5.this, opcao);
	                
	                if(perg_index<2) {
	                	Questao5 dialog = new Questao5(perg_index+1, acer, err);
		    			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		    			dialog.setVisible(true);
		    			}
	                else if(perg_index == 2) {
	                	 JOptionPane.showMessageDialog(null, "Acertos: "+acer +"\nErros: "+err, "Quantidade de acertos e erros", 1);
	                	
	                }
	            }
			});
		
		

			
	
		btnVerifica.setBounds(475, 289, 89, 23);
		contentPanel.add(btnVerifica);
	}
	
	
	public static void setResposta(String[] resp) {
		resposta = resp;
	}
	
	public String[] getResposta() {
		return resposta;
	}
	
	public static void setPergunta(String[] perg) {
		pergunta = perg;
	}
	
	public String[] getPergunta() {
		return pergunta;
	}
	
	public static void setAlternativas(String[][] alt) {
		alternativas = alt;
	}
	
	public String[][] getAlternativas() {
		return alternativas;
	}
	
}