package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFileChooserDemo extends JFrame {

	protected static final int APPROVE_OPTION = 0;
	private JPanel contentPane;
	private static JFileChooserDemo frame;
	private JLabel labelCaminhoAbsoluto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFileChooserDemo();
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
	public JFileChooserDemo() {
		setTitle("JFileChooser Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirCaixaDe = new JButton("Abrir Caixa de Diálogo");
		btnAbrirCaixaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooserDemo jf = new JFileChooserDemo();
				int opt = jf.showOpenDialog(frame);
				
				if(opt == JFileChooserDemo.APPROVE_OPTION) {
					
					//labelCaminhoAbsoluto.setText(jf.getSelectedFile().getAbsolutePath());
				}
				
			}
		});
		btnAbrirCaixaDe.setBounds(23, 37, 224, 25);
		contentPane.add(btnAbrirCaixaDe);
		
		JLabel labelTitulo = new JLabel("Caminho Absoluto do Arquivo");
		labelTitulo.setBounds(33, 77, 214, 15);
		contentPane.add(labelTitulo);
		
		labelCaminhoAbsoluto = new JLabel("");
		labelCaminhoAbsoluto.setBounds(23, 117, 388, 15);
		contentPane.add(labelCaminhoAbsoluto);
	}

	protected Object getSelectedFile() {
		// TODO Auto-generated method stub
		return null;
	}

	protected int showOpenDialog(JFileChooserDemo frame2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
