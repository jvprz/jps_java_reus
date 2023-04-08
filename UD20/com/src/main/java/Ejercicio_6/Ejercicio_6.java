/**
 * 
 */
package Ejercicio_6;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_6 extends JFrame {

	private JPanel contentPane;
	private JLabel lHeight, lWeight, lBmi;
	private JTextField height, weight, bmi;
	private JButton calculate;
	
	public Ejercicio_6() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Índice de masa corporal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 133);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Height
		lHeight = new JLabel("Altura (metros)");
		lHeight.setBounds(9, 21, 102, 16);
		contentPane.add(lHeight);
		
		height = new JTextField();
		height.setBounds(111, 16, 97, 26);
		contentPane.add(height);
		height.setColumns(10);

		// Weight
		lWeight = new JLabel("Peso (kg)");
		lWeight.setBounds(235, 21, 62, 16);
		contentPane.add(lWeight);
		
		weight = new JTextField();
		weight.setColumns(10);
		weight.setBounds(295, 16, 97, 26);
		contentPane.add(weight);
		
		// BMI
		lBmi = new JLabel("IMC: ");
		lBmi.setBounds(245, 53, 40, 16);
		contentPane.add(lBmi);
		
		bmi = new JTextField();
		bmi.setColumns(10);
		bmi.setBounds(295, 48, 97, 26);
		contentPane.add(bmi);
		
		// Calculate button
		calculate = new JButton("Calcular");
		calculate.addActionListener(al);
		calculate.setBounds(111, 47, 97, 29);
		contentPane.add(calculate);
			
		setVisible(true);
	}
	
	ActionListener al = e -> {
		double iHeight = Double.parseDouble(height.getText()),
			   iWeight = Double.parseDouble(weight.getText()),
			   rBmi = Math.round((iHeight / Math.pow(iWeight, 2)) * 100.0) / 100.0;
		bmi.setText(rBmi + "");	
	};
}
