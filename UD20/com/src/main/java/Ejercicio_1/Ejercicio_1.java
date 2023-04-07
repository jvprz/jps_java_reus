/**
 * 
 */
package Ejercicio_1;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_1 extends JFrame{

	private JPanel contentPane;
	private JButton more, less;
	
	public Ejercicio_1() {
		
		setTitle("EJERCICIO 1");
		setBounds(400, 200, 100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setVisible(true);
	}
}
