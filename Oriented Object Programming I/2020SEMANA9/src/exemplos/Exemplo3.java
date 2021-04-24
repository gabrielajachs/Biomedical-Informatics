package exemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Exemplo3 extends JFrame {

	private JPanel panel;
	private JTextField txtNone;
	private JLabel lbNone;
	
	public Exemplo3() {
		setTitle("Exemplo ActionListener");
		setBounds(0,0,400,300);
		
		txtNone = new JTextField();
		txtNone.setBounds(150, 150, 80, 30);
		
		lbNone = new JLabel("None");
		lbNone.setBounds(150, 150, 80, 30);
		
		txtNone.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == e.VK_ENTER) {
					lbNone.setText(txtNone.getText());
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.add(txtNone, BorderLayout.CENTER);
		panel.add(lbNone, BorderLayout.CENTER);
		
		setContentPane(panel);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exemplo3();
	}
}

		


