/**
 * 
 */
package Ejercicio_9;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_9 extends JFrame{
	
	private JPanel contentPane;							// Content pane
	private JButton[][] gameBoard = new JButton[4][4];	// Game board buttons
	private int[][] result = new int[4][4];				// Game board answers
	private boolean movement = true;					// First movement
	private JButton temp;								// Temporal button
	private String bURL = "", tURL = "";				// Images url
	private int tries = 0;								// Tries
	private JLabel lTries;								// Label of tries
	private JTextArea textArea;							// Text area
	private int pairs = 0;								// Pairs of figures
	
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
		
		textArea = new JTextArea();
		textArea.setBounds(400, 69, 184, 331);
		contentPane.add(textArea);
		
		lTries = new JLabel("Intentos: " + tries);
		lTries.setBounds(412, 33, 162, 14);
		contentPane.add(lTries);
		
		// Intial game board 4x4
		initGameBoard();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	// Ation listener
	ActionListener al = e -> {
		
		JButton b = (JButton) e.getSource();
		
		if (movement) {
			
			int[] position = getPosition(b);
			bURL = "./src/assets/" + result[position[0]][position[1]] + ".png";
			Icon figure = new ImageIcon(bURL);
			Ejercicio_9_Game.updateButton(b, figure, false);
			temp = b;
			tURL = bURL;
			movement = false;
			
		} else {
			int[] position = getPosition(b);
			bURL = "./src/assets/" + result[position[0]][position[1]] + ".png";
			if (bURL.equals(tURL)) {
				Icon figure = new ImageIcon(bURL);
				Ejercicio_9_Game.updateButton(b, figure, false);				
				temp = b;
				movement = true;
				tries++;
				pairs++;
				textArea.append("¡Enhorabuena!\nLlevas " + pairs + " parejas.\n");
				lTries.setText("Intentos: " + tries);
				if (pairs == 8) JOptionPane.showMessageDialog(this, "Enhorabuena, has completado el juego con " + tries + " intentos");
				return;
			} else {
				try {
					Icon figure = new ImageIcon(bURL);
					Ejercicio_9_Game.updateButton(b, figure, false);
					 
					Timer timer = new Timer(400, new ActionListener() {
					        @Override
					        public void actionPerformed(ActionEvent e) {
					            b.setIcon(null);
					            b.setEnabled(true);
					            temp.setIcon(null);
					            temp.setEnabled(true);   
					        }
					 });
					 timer.setRepeats(false);
					 timer.start();
					 movement = true;
					 tries++;
					 lTries.setText("Intentos: " + tries);				
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}	
	};
	
	/**
	 * This method create de game board
	 */
	private void initGameBoard() {
		
		int x = 0, y = 0;
		
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = new JButton();
				gameBoard[i][j].setBounds(x, y, 100, 100);
				contentPane.add(gameBoard[i][j]);
				gameBoard[i][j].addActionListener(al);
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
