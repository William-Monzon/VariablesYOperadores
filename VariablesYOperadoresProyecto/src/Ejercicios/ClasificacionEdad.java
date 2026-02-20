package Ejercicios;

import java.util.Scanner;

public class ClasificacionEdad {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		
		if(edad<12) {
			
			System.out.println(nombre + " usted es un Niño");
		} else if(edad<=17) {
			System.out.println(nombre + " usted es un Adolescente");
		} else if(edad<=59) {
			System.out.println(nombre + " usted es un Adulto");
		} else {
			System.out.println(nombre + " usted es un Adulto mayor");
		}
		

	}

}
