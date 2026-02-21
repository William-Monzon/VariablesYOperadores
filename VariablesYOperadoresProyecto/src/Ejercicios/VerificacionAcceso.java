package Ejercicios;

import java.util.Scanner;

public class VerificacionAcceso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String USUARIO = "Progra1";
		final String CONTRASENA = "micontraseña";
		
		String usuarioing;
		String contrasenaing;
		
		System.out.println("Ingrese el usuario");
		usuarioing = sc.nextLine();
		System.out.println("Ingrese la contraseña");
		contrasenaing = sc.nextLine();
		
		if(USUARIO.equals(usuarioing) && CONTRASENA.equals(contrasenaing)) {
			System.out.println("Acceso concedido");
		} else if(USUARIO.equals(usuarioing) && CONTRASENA!=contrasenaing) {
			System.out.println("Contraseña incorrecta");
		} else {
			System.out.println("Usuario no registrado");
		}
	}	
}
		



