package exemplosAula2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploCardLayout extends JFrame {

	private JPanel contentPane;
	private CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploCardLayout frame = new ExemploCardLayout();
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
	public ExemploCardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmPainel1 = new JMenuItem("Painel 1");
		mntmPainel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "Tela 1");
			}
		});
		mnNewMenu.add(mntmPainel1);
		
		JMenuItem mntmPainel2 = new JMenuItem("Painel 2");
		mntmPainel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(contentPane, "Tela 2");
			}
		});
		mnNewMenu.add(mntmPainel2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		card = new CardLayout();
		contentPane.setLayout(card);
		
		JPanel painel1 = new JPanel();
		painel1.add(new JLabel("TELA 1"));
		contentPane.add(painel1, "Tela 1");
		
		JPanel painel2 = new JPanel();
		painel2.add(new JLabel("TELA 2"));
		contentPane.add(painel2, "Tela 2");
		
	}

}
