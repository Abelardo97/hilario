package or.generation;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		/**
		 * La clase scanner nos permite realizar una lectura de la consola.
		 */
		/*
		 * Scanner myScan = new Scanner(System.in);
		 * System.out.print("Introduce tu nombre: "); // entrada del usuario String name
		 * = myScan.nextLine();
		 * 
		 * // Entradas numéricas System.out.print("\nIntroduce tu edad: "); int age =
		 * myScan.nextInt();
		 * 
		 * // entrdas numéricas de tipo double
		 * System.out.print("\nIntroduce el salario deseado: "); double salary =
		 * myScan.nextDouble();
		 * 
		 * System.out.println("Tu nombre es: " + name + " con edad :" + age +
		 * ", con salario de: " + salary);
		 */

		/**
		 * La sintaxis de la condicional if if (condicion) instruccion;
		 * 
		 * if (condicion) { instrucciones; }
		 */
		int numChelas = 5;
		boolean hayBotanita = true;

		numChelas++;
		numChelas += 3;
		System.out.println("Bienvenido a \"La Oficina\" ");
		if (numChelas > 5 && !hayBotanita)
			System.out.println("Vete a mimir, tío");
		else if (numChelas > 8) {
			System.out.println("Momento de mandar mensajes");
			System.out.println("Todas las canciones, son mis canciones");
			System.out.println("Pide el ratón vaquero para bailar");
		} else
			System.out.println("fondo, fondo, fondo");

		/**
		 * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
		 * El usuario proporcionará un valor entre 0 y 10. Si está entre 9 y 10:
		 * imprimir una A Si está entre 8 y menor a 9: imprimir una B Si está entre 7 y
		 * menor a 8: imprimir una C Si está entre 6 y menor a 7: imprimir una D Si está
		 * entre 0 y menor a 6: imprimir una F Cualquier otro valor debe imprimir: Valor
		 * desconocido
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un valor entre 0 y 10:");
		// Object teclado;
		//int calificacion = teclado.nextInt();
		int calificacion = 10;

		if (calificacion >= 9 && calificacion <= 10)
			System.out.println("Lo lograste : Obtuviste una A");

		else if (calificacion >= 8 && calificacion < 9)
			System.out.println("Lo lograste  : Obtuviste una B");

		else if (calificacion >= 7 && calificacion < 8)
			System.out.println("Lo lograste  : Obtuviste una C");

		else if (calificacion >= 6 && calificacion < 7)
			System.out.println("Lo lograste  : Obtuviste una D");

		else if (calificacion >= 0 && calificacion < 6)
			System.out.println("Tu mama te va a pegar obtuviste una F");

		else
			System.out.println("Es Desconocido");

		/**
		 * Sintaxis del switch
		 * 
		 * switch(condicion){ case 1: instrucciones; break; case 2: instrucciones;
		 * break; case x: instrucciones; break; default: instrucciones; break; }
		 */
		System.out.println("=========M==E==S===========");
		System.out.print("\nIntroduce el mes en curso: ");
		int mesEnCurso = teclado.nextInt();
		String mesString = "";

		switch (mesEnCurso) {
		case 1:
			mesString = "Enero";
			break;
		case 2:
			mesString = "Febreo";
			break;
		case 3:
			mesString = "Marzo";
			break;
		case 4:
			mesString = "Abril";
			break;
		case 5:
			mesString = "Mayo";
			break;
		case 6:
			mesString = "Junio";
			break;	
		case 7:
			mesString = "Julio";
			break;
		case 8:
			mesString = "Agosto";
			break;
		case 9:
			mesString = "Septiembre";
			break;
		case 10:
			mesString = "Octubre";
			break;
		case 11:
			mesString = "Noviembre";
			break;
		case 12:
			mesString = "Diciembre";
			break;
		default:
			mesString = "El mes introducido es incorrecto"; 
		}
		System.out.println("El mes en curso es: " + mesString);
		
		String temporada="";
		switch (mesString) {
		case "Diciembre":
		case "Enero":
		case "Febrero":
			temporada="Invierno";
			break;
		case "Marzo", "Abril", "Mayo":
			temporada="Primavera";
			break;
		case "Junio":
		case "Julio":
		case "Agosto":
			temporada="Verano";
			break;
		case "Septiembre":
		case "Octubre":
		case "Noviembre":
			temporada="Otoño";
			break;
		default: temporada= "N/A";
						
		}
		System.out.println("La temporada es: " + temporada);
		

	}

}