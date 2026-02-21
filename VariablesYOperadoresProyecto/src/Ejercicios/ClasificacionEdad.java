package Ejercicios; //Paquete llamado Ejercicios.

import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados

public class ClasificacionEdad {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); //herramienta que lee lo ingresado
		 
		//Declaro las variables
		String nombre;
		int edad;
		
		//Ingreso los datos a las varibles
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		
		//Compara la edad ingresada e imprime según la condición que se tiene
		if(edad<12) {
			System.out.println(nombre + " usted es un Niño"); //imprime esto si la edad es menor a 12
		} else if(edad<=17) {
			System.out.println(nombre + " usted es un Adolescente"); //imprime esto si la edad eta entre 12 y 17
		} else if(edad<=59) {
			System.out.println(nombre + " usted es un Adulto"); //imprime esto si la edad esta entre 18 y 59
		} else {
			System.out.println(nombre + " usted es un Adulto mayor"); //imprime esto si la edad es 60 o mayor
		}
		

	}

}
