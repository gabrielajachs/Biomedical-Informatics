package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import jdk.jfr.events.FileWriteEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Atividade JFileChooser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		itemAbrir.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/open.png")));
		menuArquivo.add(itemAbrir);
		
		JMenuItem itemSalvar = new JMenuItem("Salvar");
		itemSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				
				JFileChooser jf = new JFileChooser();
				int opt = jf.showSaveDialog(contentPane);
				
				if(opt == jf.APPROVE_OPTION) {
					
					try {
						fw = new FileWriter(jf.getSelectedFile()+".txt", true);
						bw = new BufferedWriter(fw);
						
						bw.write(textPane.getText());
						bw.flush();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally {
						try {
							fw.close();
							bw.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				}
				
			}
		});
		itemSalvar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		menuArquivo.add(itemSalvar);
		
		JMenuItem itemSair = new JMenuItem("Sair");
		itemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/exit.png")));
		menuArquivo.add(itemSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}

}
