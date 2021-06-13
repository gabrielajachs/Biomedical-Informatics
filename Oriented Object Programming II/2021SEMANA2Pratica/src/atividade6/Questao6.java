package atividade6;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Questao6 extends JFrame {

	private JPanel contentPane;
	private static Questao6 frame;
	
	private JMenuBar menuBar;
	private JMenu mnArquivo;
	private JMenuItem mntmSelecionaArquivo;
	private JMenuItem mntmFecharJanela;
	private JLabel lblImagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Questao6();
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
	public Questao6() {
		setTitle("Visualizador de Imagens");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		mntmSelecionaArquivo = new JMenuItem("Seleciona Arquivo");
		mntmSelecionaArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jf = new JFileChooser();
				jf.showOpenDialog(frame);
					
				try {
					lblImagem.setIcon(new ImageIcon(ImageIO.read(jf.getSelectedFile()).getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), BufferedImage.TYPE_INT_RGB)));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
				
			}
		});
		mnArquivo.add(mntmSelecionaArquivo);
		
		mntmFecharJanela = new JMenuItem("Fechar Janela");
		mntmFecharJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArquivo.add(mntmFecharJanela);
		
		lblImagem = new JLabel("");
		lblImagem.setBounds(0, 22, 434, 239);
		contentPane.add(lblImagem);
	}
	
}