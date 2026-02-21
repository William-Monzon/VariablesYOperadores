package Ejercicios; //Paquete llamado Ejercicios.

import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //herramienta que lee lo ingresado
		
		//Declaro la variable
		int numero;
		
		//Ingreso los datos
		System.out.println("Ingrese un número del 1 al 7");
		numero = sc.nextInt();
		
		//Devuelve el caso que corresponde al numero ingresado anteriormente 
		switch(numero) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default: //si no se cumple ningun caso devuelve el default
				System.out.println("Número inválido");
		}
		
	}

}
