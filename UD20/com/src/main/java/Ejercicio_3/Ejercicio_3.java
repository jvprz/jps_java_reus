/**
 * 
 */
package Ejercicio_3;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_3 extends JFrame{

	private JPanel contentPane;
	private JLabel label1, label2;
	private int count1 = 0, count2 = 0;
	private JButton btn1, btn2;
	
	public Ejercicio_3() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Ventana con más interacción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 84);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		btn1 = new JButton("Botón 1");
		btn1.addActionListener(al);
		btn1.setBounds(84, 45, 92, 29);
		contentPane.add(btn1);
		
		btn2 = new JButton("Botón 2");
		btn2.addActionListener(al);
		
		label1 = new JLabel("Botón 1: " + count1 + " veces");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(84, 16, 103, 16);
		contentPane.add(label1);
		btn2.setBounds(227, 45, 92, 29);
		contentPane.add(btn2);
		
		label2 = new JLabel("Botón 2: " + count2 + " veces");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(227, 16, 103, 16);
		contentPane.add(label2);

		setVisible(true);	
	}
	
	ActionListener al = e -> {
		if (e.getSource() == btn1) {
			count1++;
			label1.setText("Botón 1: " + count1 + " veces");
		}
		if (e.getSource() == btn2) {
			count2++;
			label2.setText("Botón 2: " + count2 + " veces");
		}
	};
}
