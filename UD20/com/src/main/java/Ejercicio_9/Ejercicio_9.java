/**
 * 
 */
package Ejercicio_9;

import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_9 extends JFrame{
	
	private JPanel contentPane;
	private JButton[][] gameBoard = new JButton[4][4];
	private int[][] result = new int[4][4];
	
	public Ejercicio_9(int[][] r) {
		result = r;
		initComponents();
	}
	
	private void initComponents() {
		
		setTitle("Juego de formar parejas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 600, 439);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(400, 69, 184, 331);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Intentos:");
		lblNewLabel.setBounds(412, 33, 162, 14);
		contentPane.add(lblNewLabel);
		
		// Intial game board 4x4
		initGameBoard();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	// Ation listener
	ActionListener al = e -> {
		JButton b = (JButton) e.getSource();
		int[] position = getPosition(b);
		b.setText(result[position[0]][position[1]] + "");
	};
	
	/**
	 * This method create de game board
	 */
	private void initGameBoard() {
		
		int x = 0, y = 0;
		
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = new JButton("IDK");
				gameBoard[i][j].setBounds(x, y, 100, 100);
				gameBoard[i][j].addActionListener(al);
				contentPane.add(gameBoard[i][j]);
				x += 100;
			}
			x = 0;
			y += 100;
		}
	}
	
	/**
	 * This metod get position to the button array
	 * @param button
	 * @return
	 */
	private int[] getPosition(JButton button) {
	    int[] position = {-1, -1};
	    for (int i = 0; i < gameBoard.length; i++) {
	        for (int j = 0; j < gameBoard[i].length; j++) {
	            if (gameBoard[i][j] == button) {
	                position[0] = i;
	                position[1] = j;
	                break;
	            }
	        }
	    }
	    return position;
	}

	/**
	 * Getter to game board
	 * @return
	 */
	public JButton[][] getGameBoard() {
		return gameBoard;
	}

	/**
	 * Setter to game board
	 * @param gameBoard
	 */
	public void setGameBoard(JButton[][] gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	
}
