/**
 * 
 */
package Ejercicio_7;

import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_7 extends JFrame {

	final private double PTAS = 166.386;
	
	private JPanel contentPane;
	private JTextField amount;
	private JLabel result;
	private JButton converter, change;
	private boolean changeSatatus = true;
	
	public Ejercicio_7() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 572, 133);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Amount
		JLabel lAmount = new JLabel("Cantidad a convertir");
		lAmount.setBounds(16, 24, 134, 16);
		contentPane.add(lAmount);
		
		amount = new JTextField();
		amount.setBounds(154, 19, 130, 26);
		contentPane.add(amount);
		
		// Result
		JLabel lResult = new JLabel("Resultado");
		lResult.setBounds(333, 24, 74, 16);
		contentPane.add(lResult);
		
		result = new JLabel();
		result.setBounds(403, 19, 134, 26);
		contentPane.add(result);
		
		// Buttons
		converter = new JButton("Euros a ptas");
		converter.addActionListener(al);
		converter.setBounds(164, 56, 117, 29);
		contentPane.add(converter);
		
		change = new JButton("Cambiar");
		change.addActionListener(al);
		change.setBounds(333, 56, 117, 29);
		contentPane.add(change);
		
		setVisible(true);
	}
	
	ActionListener al = e -> {
		if (e.getSource() == change) {
			converter.setText(changeSatatus ? "Ptas a euros" : "Euros a ptas");
			changeSatatus = !changeSatatus;
		}
		if (e.getSource() == converter) {
			result.setText((changeSatatus ? Double.parseDouble(amount.getText()) * PTAS : Double.parseDouble(amount.getText()) / PTAS) + "");
		}
	};
}
