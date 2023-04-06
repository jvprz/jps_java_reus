/**
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

/**
 * @author javier
 *
 */
public class Ejercicio_4 extends JFrame{
	
	private JPanel contentPane;
	private static JTextField num1;
	private static JTextField num2;
	private JTextField result;

	public Ejercicio_4() {
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setTitle("Mini Calculadora");
		setBounds(200, 50, 426, 245); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		num1 = new JTextField();
		num1.setFont(new Font("Tahoma", Font.PLAIN, 58));
		num1.setBounds(10, 11, 90, 59);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mini calculadora...");
		lblNewLabel.setBounds(20, 81, 380, 14);
		contentPane.add(lblNewLabel);
		
		JButton sum = new JButton("+");
		sum.setBounds(10, 106, 90, 90);
		sum.setFont(new Font("Tahoma", Font.PLAIN, 58));
		contentPane.add(sum);
		sum.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(sum() + "");
			}
		});
		
		JButton res = new JButton("-");
		res.setBounds(110, 106, 90, 90);
		res.setFont(new Font("Tahoma", Font.PLAIN, 58));
		contentPane.add(res);
		res.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(res() + "");
			}
		});
		
		JButton mul = new JButton("x");
		mul.setBounds(210, 106, 90, 90);
		mul.setFont(new Font("Tahoma", Font.PLAIN, 58));
		contentPane.add(mul);
		mul.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(mul() + "");
			}
		});
		
		JButton div = new JButton("/");
		div.setBounds(310, 106, 90, 90);
		div.setFont(new Font("Tahoma", Font.PLAIN, 58));
		contentPane.add(div);
		div.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(div() + "");
			}
		});
		
		num2 = new JTextField();
		num2.setFont(new Font("Tahoma", Font.PLAIN, 58));
		num2.setColumns(10);
		num2.setBounds(110, 11, 90, 59);
		contentPane.add(num2);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.PLAIN, 58));
		result.setColumns(10);
		result.setBounds(262, 11, 138, 59);
		contentPane.add(result);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 58));
		lblNewLabel_1.setBounds(210, 12, 42, 59);
		contentPane.add(lblNewLabel_1);
		
		setVisible(true);
	}
	
	/**
	 * This method adds two numbers
	 * @return result
	 */
	public static int sum() {
		return Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
	}
	
	/**
	 * This method substracts two numbers
	 * @return result
	 */
	public static int res() {
		return Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
	}
	
	/**
	 * This method multiplies two numbers
	 * @return result
	 */
	public static int mul() {
		return Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
	}
	
	/**
	 * This method divides two numbers
	 * @return result
	 */
	public static int div() {
		return Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText());
	}
	
	/**
	 * Main method calls pane.
	 * @param args
	 */
	public static void main(String args[]) {
		Ejercicio_4 e = new Ejercicio_4();
	}
}
