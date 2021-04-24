package exemplosAula2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ExemploFlowLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploFlowLayout frame = new ExemploFlowLayout();
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
	public ExemploFlowLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Botão 1");
		contentPane.add(btnNewButton);
		
		JButton btnBoto = new JButton("Botão 2");
		contentPane.add(btnBoto);
		
		JButton btnBoto_1 = new JButton("Botão 3");
		contentPane.add(btnBoto_1);
		
		JButton btnBoto_2 = new JButton("Botão 4");
		contentPane.add(btnBoto_2);
	}

}
