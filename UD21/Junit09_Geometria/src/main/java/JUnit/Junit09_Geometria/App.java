/**
 * 
 */
package JUnit.Junit09_Geometria;

import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * 
 * @author Javier
 *
 */
public class App {
	
    public static void main(String[] args ) {
    	
	   //Creacion de Objeto Circulo
	   Geometria g = new Geometria(2);
	   double circleArea = g.areaCirculo(2);
	   g.setArea(circleArea);    
	   System.out.println(g);
    }  
}
