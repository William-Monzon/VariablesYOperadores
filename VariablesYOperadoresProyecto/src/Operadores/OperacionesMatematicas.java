package Operadores;  //Paquete llamado Operadores

import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados


public class OperacionesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //herramienta que lee lo ingresado
		
		//Declaro Variables
		int num1;
		int num2;
		int suma, resta, multiplicacion, division, residuo;
		
		//Ingreso los datos a las variables
		System.out.println("Ingrese el primer número");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = sc.nextInt();
		
		//Hago las operaciones 
		suma = num1 + num2; //se suma
		resta = num1 - num2;  //se resta
		multiplicacion = num1 * num2;  //se multiplica
		division = num1 / num2;  //de divide
		residuo = num1 % num2; //se divide y guarda el residuo
		
		//imprime según la operación llamada
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);
		System.out.println("La division es: " + division);
		System.out.println("El residuo de la división es: " + residuo);
		
	}

}
