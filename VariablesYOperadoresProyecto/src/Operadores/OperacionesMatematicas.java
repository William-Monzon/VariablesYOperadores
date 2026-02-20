package Operadores;

import java.util.Scanner;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int suma, resta, multiplicacion, division, residuo;
		
		System.out.println("Ingrese el primer número");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		residuo = num1 % num2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);
		System.out.println("La division es: " + division);
		System.out.println("El residuo de la división es: " + residuo);
		
	}

}
