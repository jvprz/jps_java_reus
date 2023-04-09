/**
 * 
 */
package Ejercicio_9;

import java.util.Random;
import javax.swing.*;

/**
 * @author javier
 *
 */
public class Ejercicio_9_Game {
	
	/**
	 * This methos cointais the game borard with his answers.
	 * @return game board results
	 */
	private static int[][] gameGenerator() {
		
		int[][] game = new int[4][4];
		int[] posibilites = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
		
		// Set random order to posibilites
		Random r = new Random();
		for (int i = posibilites.length - 1; i > 0; i--) {
			int index = r.nextInt(i+1);
			int temp = posibilites[index];
			posibilites[index] = posibilites[i];
			posibilites[i] = temp;
			
		}
		// Create game board
		int n = 0;
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = posibilites[n];
				n++;
			}
		}	
		return game;
	}
	
	
	/**
	 * This mathod update buttons.
	 * @param b
	 * @param figure
	 * @param enabled
	 */
	public static void updateButton(JButton b, Icon figure, boolean enabled) {
		b.setIcon(figure);
		b.setDisabledIcon(figure);
		b.setEnabled(enabled);
	}

	/**
	 * Game structure
	 */
	public static void game() {
		
		// Game board results
		int[][] r = gameGenerator();		
		Ejercicio_9 e = new Ejercicio_9(r);			
	}
}
