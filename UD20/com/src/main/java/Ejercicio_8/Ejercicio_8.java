/**
 * 
 */
package Ejercicio_8;

import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_8 extends JFrame {

	final private double PTAS = 166.386;
	
	private JPanel contentPane;
	private JTextField amount;
	private JLabel result;
	private JButton converter, change, clear;
	private boolean changeSatatus = true;
	
	public Ejercicio_8() {
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
		converter.setBounds(76, 56, 117, 29);
		contentPane.add(converter);
		
		change = new JButton("Cambiar");
		change.addActionListener(al);
		change.setBounds(223, 56, 117, 29);
		contentPane.add(change);
		
		clear = new JButton("Limpiar");
		clear.addActionListener(al);
		clear.setBounds(369, 56, 117, 29);
		contentPane.add(clear); 
		
		setVisible(true);
	}
	
	ActionListener al = e -> {
		if (e.getSource() == change) {
			converter.setText(changeSatatus ? "Ptas a euros" : "Euros a ptas");
			changeSatatus = !changeSatatus;
		}
		if (e.getSource() == converter) {
			try {
				result.setText((changeSatatus ? Double.parseDouble(amount.getText()) * PTAS : Double.parseDouble(amount.getText()) / PTAS) + "");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(contentPane, "Introduce un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		if (e.getSource() == clear) {
			amount.setText("");
			result.setText("");
		}
	};
}

