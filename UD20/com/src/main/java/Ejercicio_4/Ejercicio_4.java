/**
 * 
 */
package Ejercicio_4;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_4 extends JFrame{
	private JPanel contentPane;
	private JLabel events;
	private JTextArea textArea;
	
	public Ejercicio_4() {
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Ventana oyente");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 340);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(mouse);
		
		events = new JLabel("Eventos");
		events.addMouseListener(mouse);
		events.setBounds(19, 142, 61, 16);
		contentPane.add(events);
		
		textArea = new JTextArea();
		textArea.setBounds(100, 6, 344, 285);
		textArea.addMouseListener(mouse);
		contentPane.add(textArea);
		
		textArea.append("Ventana y panel creados.\n");
		textArea.append("Label eventos creado.\n");
		textArea.append("Text Area creado.\n");
		
		setVisible(true);
	}
	
	MouseAdapter mouse = new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == events) {
				textArea.append("Click en Label eventos.\n");
			}
			if (e.getSource() == textArea) {
				textArea.append("Click en TextArea.\n");
			}
			if (e.getSource() == contentPane) {
				textArea.append("Click en la ventana.\n");
			}
		}
	};
	
}
