package exemplosAula3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField fieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		
		fieldResultado = new JTextField();
		fieldResultado.setFont(new Font("Dialog", Font.BOLD, 25));
		fieldResultado.setMinimumSize(new Dimension(5, 40));
		panel1.add(fieldResultado);
		fieldResultado.setColumns(10);
		
		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(0, 4, 0, 4));
		
		JButton button1 = new JButton("1");
		panel2.add(button1);
		
		JButton button2 = new JButton("2");
		panel2.add(button2);
		
		JButton button3 = new JButton("3");
		panel2.add(button3);
		
		JButton buttonSoma = new JButton("+");
		panel2.add(buttonSoma);
		
		JButton button4 = new JButton("4");
		panel2.add(button4);
		
		JButton button5 = new JButton("5");
		panel2.add(button5);
		
		JButton button6 = new JButton("6");
		panel2.add(button6);
		
		JButton buttonSubtracao = new JButton("-");
		panel2.add(buttonSubtracao);
		
		JButton button7 = new JButton("7");
		panel2.add(button7);
		
		JButton button8 = new JButton("8");
		panel2.add(button8);
		
		JButton button9 = new JButton("9");
		panel2.add(button9);
		
		JButton buttonDivisao = new JButton("/");
		panel2.add(buttonDivisao);
		
		JButton button0 = new JButton("0");
		panel2.add(button0);
		
		JButton buttonMultiplicacao = new JButton("^");
		panel2.add(buttonMultiplicacao);
		
		JButton buttonC = new JButton("C");
		panel2.add(buttonC);
		
		JButton buttonCE = new JButton("CE");
		panel2.add(buttonCE);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3, BorderLayout.SOUTH);
		
		JButton buttonCalcular = new JButton("Calcular");
		panel3.add(buttonCalcular);
	}

}
