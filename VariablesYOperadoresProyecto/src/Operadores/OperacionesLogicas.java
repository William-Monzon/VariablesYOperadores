package Operadores; //Paquete llamado Operadores

import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados

public class OperacionesLogicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //herramienta que lee lo ingresado
		
		//Declaro variables
		int num1;
		int num2;
		
		//Ingreso datos a las variables
		System.out.println("Ingrese el primer número");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = sc.nextInt();
		
		//Compara las variables y devuelve segun las condiciones que se dan
		if(num1>num2) {
			System.out.println("El número mayor es: " + num1); //devuelve esto si el num1 es mayor
		} else if(num1<num2){
			System.out.println("El número mayor es: " + num2); //devuelve esto si num2 es mayor
		} else if(num1==num2) {
			System.out.println("Los números son iguales");  //devuelve esto si ambos son iguales
		} else {
			System.out.println("No ingresaste numeros"); //devuelve esto si no se ingresan numeros
		}
		
		//Compara si se cumplen las con el AND y OR
		if(num1>num2 && num2<num1) {
			System.out.println("El primer número siempre sera mayor"); //devuelve esto si ambas condiciones se cumplen
		} else if (num1<num2 || num1==num2) {
			System.out.println("El segundo numero no se queda atrás"); //devuelve esto si al menos una condición se cumple
		} else {
			System.out.println("No se cumplio ninguna cuestión"); //devuelve esto si no se cumple ninguna condición
		}
		
		

	}

}
