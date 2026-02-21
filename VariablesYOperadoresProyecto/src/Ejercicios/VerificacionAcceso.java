package Ejercicios; //Paquete llamado Ejercicios.

import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados

public class VerificacionAcceso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //herramienta que lee lo ingresado
		
		//Uso de constantes para el susario y la contraseña
		final String USUARIO = "Progra1";
		final String CONTRASENA = "micontraseña";
		
		//variables en donde se guarda lo que el usuario ingresa
		String usuarioing;
		String contrasenaing;
		
		//Pide ingresar datos y los datos ingresados se le asigna a la variable
		System.out.println("Ingrese el usuario");
		usuarioing = sc.nextLine();
		System.out.println("Ingrese la contraseña");
		contrasenaing = sc.nextLine();
		
		//con el equals compara las dos variables para saber si son iguales.
		if(USUARIO.equals(usuarioing) && CONTRASENA.equals(contrasenaing)) {
			System.out.println("Acceso concedido"); //imprime si se cumple la primera condición
		} else if(USUARIO.equals(usuarioing) && CONTRASENA!=contrasenaing) { //con el != se compara si una variable es distinta a otra
			System.out.println("Contraseña incorrecta");//imprime si se cumple la segunda condición
		} else {
			System.out.println("Usuario no registrado"); //imprime si no se cumple ninguna condición
		}
	}	
}
		



