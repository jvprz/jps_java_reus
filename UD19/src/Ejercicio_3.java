/**
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

/**
 * @author javier
 *
 */
public class Ejercicio_3 extends JFrame{
	
	private JPanel contentPane;
	private ButtonGroup bgroup;
	private JCheckBox chckbxP;
	private JCheckBox chckbxD;
	private JCheckBox chckbxA;
	private JLabel h;

	
	public Ejercicio_3() {
		
		setTitle("Ejercicio 3"); 
		setBounds(200, 50, 400, 700); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel sistema = new JLabel("Elige un Sistema operativo:");
		sistema.setBounds(25, 50, 250, 30);
		contentPane.add(sistema);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows", true);
		rdbtnWindows.setBounds(50, 90, 109, 30);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux", false);
		rdbtnLinux.setBounds(50, 130, 109, 30);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac", false);
		rdbtnMac.setBounds(50, 170, 109, 30);
		contentPane.add(rdbtnMac);
		
		bgroup = new ButtonGroup();
		bgroup.add(rdbtnWindows);
		bgroup.add(rdbtnLinux);
		bgroup.add(rdbtnMac);
		
		JLabel especialidad = new JLabel("Elige tu especialidad:");
		especialidad.setBounds(25, 225, 250, 30);
		contentPane.add(especialidad);
		
		chckbxP = new JCheckBox("Programación", false);
		chckbxP.setBounds(50, 265, 209, 30);
		contentPane.add(chckbxP);
		
		chckbxD = new JCheckBox("Diseño gráfico", false);
		chckbxD.setBounds(50, 305, 209, 30);
		contentPane.add(chckbxD);
		
		chckbxA = new JCheckBox("Administración", false);
		chckbxA.setBounds(50, 345, 209, 30);
		contentPane.add(chckbxA);
		
		h = new JLabel("Cantidad de horas dedicadas:");
		h.setBounds(25, 400, 250, 30);
		contentPane.add(h);
		
		JSlider slider = new JSlider(0, 10);
		slider.setBounds(50, 440, 300, 44);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);		
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = 0;
				checkSistemaOperativo(bgroup);
				contador = checkEspecialidad(chckbxP, contador);
				contador = checkEspecialidad(chckbxD, contador);
				contador = checkEspecialidad(chckbxA, contador);
				checkSlider(slider);
				
				
			}
		});
		btnNewButton.setBounds(125, 550, 150, 30);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
	
	private int checkEspecialidad(JCheckBox checkbox, int contador) {
		int count = contador;
		if(checkbox.isSelected() == true) {
			String sistema = checkbox.getText();
			System.out.println("Especialidad "+count+": "+sistema);
			count++;
		}
		return count;
		
	}
	
	private void checkSistemaOperativo(ButtonGroup bgroup) {
		String sistema = "";
		Enumeration<AbstractButton> enumeration = bgroup.getElements();
		while(enumeration.hasMoreElements()) {
			JRadioButton rdbtn = (JRadioButton) enumeration.nextElement();
			if(rdbtn.isSelected() == true) {
				sistema = rdbtn.getText();
			}
		}
		System.out.println("Su sistema operativo es: "+sistema);
	}
	
	private void checkSlider(JSlider slider) {
		double res = 0.0;
		res = slider.getValue();
		System.out.println("Horas: "+(int)res);
		
	}

	public static void main(String[] args) {
		
		Ejercicio_3 e = new Ejercicio_3();

	}

}
