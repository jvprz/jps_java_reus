/**
 * 
 */
import java.awt.event.*;
import javax.swing.*;

/**
 * @author javie
 *
 */
public class Ejercicio_2 extends JFrame{
		
	private JPanel contentPane;
	private String m;
	private JComboBox<Object> comboBox;
	
	public Ejercicio_2() {
		
		setTitle("Películas"); 
		setBounds(400, 200, 900, 250); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel titulo = new JLabel("Escribe el título de una película");
		titulo.setBounds(75, 50, 250, 30);
		contentPane.add(titulo);
		
		JTextField textField = new JTextField();
		textField.setBounds(75, 90, 300, 30);
		contentPane.add(textField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(275, 150, 100, 30);
		contentPane.add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m = textField.getText();
				comboBox.addItem(m);
				
			}
		});
		
		JLabel peliculas = new JLabel("Películas");
		peliculas.setBounds(500, 50, 150, 30);
		contentPane.add(peliculas);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(500, 90, 300, 30);
		contentPane.add(comboBox);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {

		Ejercicio_2 e = new Ejercicio_2();
	}

}
