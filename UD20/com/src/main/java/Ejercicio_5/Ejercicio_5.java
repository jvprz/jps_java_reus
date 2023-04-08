/**
 * 
 */
package Ejercicio_5;

import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_5 extends JFrame{

	private JPanel contentPane;
	private JButton clean;
	private JTextArea textArea;
	
	private DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
	private String h = LocalTime.now().format(f);
	
	public Ejercicio_5() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Todos los eventos del ratón");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 52, 384, 309);
		contentPane.add(textArea);
		textArea.addMouseListener(mouse);
		
		clean = new JButton();
		clean.setText("Limpiar");
		clean.setBounds(142, 21, 85, 20);
		contentPane.add(clean);
		clean.addActionListener(clearText);
			
		setVisible(true);
	}
	
	/**
	 * Listen mouse actions
	 */
	MouseListener mouse = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			textArea.append("[" + h + "] Click en (" + e.getX() + ", " + e.getY() + ")\n");
		}
		public void mousePressed(MouseEvent e) {
			textArea.append("[" + h + "] Ratón presionado en (" + e.getX() + ", " + e.getY() + ")\n");
		}
		public void mouseReleased(MouseEvent e) {
			textArea.append("[" + h + "] Ratón soltado en (" + e.getX() + ", " + e.getY() + ")\n");
		}
		public void mouseEntered(MouseEvent e) {
			textArea.append("[" + h + "] Ratón ha entrado en el text area en (" + e.getX() + ", " + e.getY() + ")\n");
		}
		public void mouseExited(MouseEvent e) {
			textArea.append("[" + h + "] Ratón ha salido en el text area en (" + e.getX() + ", " + e.getY() + ")\n");
		}
		
	};
	
	/**
	 * Clear text area.
	 */
	ActionListener clearText = e -> {
		textArea.setText("");
	};
	
}
