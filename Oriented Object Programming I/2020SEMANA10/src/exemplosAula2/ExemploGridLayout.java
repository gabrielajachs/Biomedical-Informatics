package exemplosAula2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class ExemploGridLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploGridLayout frame = new ExemploGridLayout();
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
	public ExemploGridLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Botão 1");
		contentPane.add(btnNewButton);
		
		JButton btnBoto = new JButton("Botão 2");
		contentPane.add(btnBoto);
		
		JButton btnBoto_1 = new JButton("Botão 3");
		contentPane.add(btnBoto_1);
		
		JButton btnBoto_2 = new JButton("Botão 4");
		contentPane.add(btnBoto_2);
		
		JButton btnBoto_3 = new JButton("Botão 5");
		contentPane.add(btnBoto_3);
		
		JButton btnBoto_4 = new JButton("Botão 6");
		contentPane.add(btnBoto_4);
	}

}
