/**
 * 
 */
package Ejercicio_1;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author javier
 *
 */
public class Ejercicio_1 extends JFrame{

	private JPanel contentPane;
	private JLabel label;
	private JButton more, less;
	
	public Ejercicio_1() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("EJERCICIO 1");
		setBounds(400, 200, 250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		label = new JLabel("Label");
		label.setBounds(10, 11, 110, 20);
		contentPane.add(label);
		
		more = new JButton("+");
		more.addActionListener(al);
		more.setBounds(124, 55, 45, 45);
		contentPane.add(more);
		
		less = new JButton("-");
		less.addActionListener(al);
		less.setBounds(179, 55, 45, 45);
		contentPane.add(less);
		
		setVisible(true);
	}
	
	ActionListener al = e -> {
		if(e.getSource() == more) {
			label.setSize(label.getSize().width + 10, label.getSize().height + 10);
			label.setFont(label.getFont().deriveFont(label.getFont().getSize2D() + 5f));
		}
		if(e.getSource() == less) {
			label.setSize(label.getSize().width - 10, label.getSize().height - 10);
			label.setFont(label.getFont().deriveFont(label.getFont().getSize2D() - 5f));
		}
	};
}
