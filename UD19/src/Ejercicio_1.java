/**
 * 
 */
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author javier
 *
 */
public class Ejercicio_1 extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;

	public Ejercicio_1() {
		
		setTitle("Saludador"); 
		setBounds(400, 200, 500, 400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(150, 50, 250, 30);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(50, 90, 400, 30);
		contentPane.add(textField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(a);
		btnAceptar.setBounds(200, 150, 100, 30);
		contentPane.add(btnAceptar);
		
		setVisible(true); 
	}
	
	ActionListener a = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Hola "+textField.getText());
			}
	};
	
	public static void main(String[] args) {

		Ejercicio_1 e1 = new Ejercicio_1();
	}
}

