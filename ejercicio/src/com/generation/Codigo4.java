/**
 * El programa es el juego de piedra, papel o tijeras
 * 
 */

package com.generation;

//Se importa la clase Scanner
import java.util.Scanner;

public class Codigo4{
	//Se grega el metodo principal
	public static void main(String[] args) {

		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		//Se agrega System.in
		Scanner s = new Scanner(System.in);
		String j1 = s.nextLine();
		    
		//Se modifica el mensaje 
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		Scanner s2 = new Scanner(System.in);
		String j2 = s2.nextLine();
		
		    //Se elimina )
		    if (j1 == j2) {
		      System.out.println("Empate");
		    } else {
		    	
		      int g = 2;  
		      switch(j1) {
		        case "piedra":
		        	//Se modifica la condicion agregando equals
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }
		          break;// se agrego esta linea
	
		        case "papel":
		          if (j2.equals("piedra")) {
		            g = 1;
		          } //se agrega } y break
		          break;
		          
		        case "tijeras":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;
		        default:
		      }
		      System.out.println("Gana el jugador " + g);
	    }
	  
	}
}