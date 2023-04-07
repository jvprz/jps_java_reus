/**
 * 
 */
package Ejercicio_2;

import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_2 extends JFrame{

	private JPanel contentPane;
	private JLabel label;
	private JButton btn1, btn2;
	
	public Ejercicio_2() {		
		initComponents();	
	}
	
	private void initComponents() {
		
		setTitle("Ventana con interacción");
		setBounds(400, 200, 292, 132);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		label = new JLabel("Sin pulsar...");
		label.setBounds(10, 11, 250, 20);
		contentPane.add(label);
		
		btn1 = new JButton("Botón 1");
		btn1.addActionListener(al);
		btn1.setBounds(16, 56, 117, 29);
		contentPane.add(btn1);

		btn2 = new JButton("Botón 2");
		btn2.addActionListener(al);
		btn2.setBounds(143, 56, 117, 29);
		contentPane.add(btn2);
		
		setVisible(true);
	}
	
	ActionListener al = e -> {
		if (e.getSource() == btn1) {
			label.setText("Has pulsado el botón 1.");
		}
		if (e.getSource() == btn2) {
			label.setText("Has pulsado el botón 2.");
		}
	};
}