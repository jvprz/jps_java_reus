import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String args[]) {
		
		String name = JOptionPane.showInputDialog("Inserta tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
	}
}
