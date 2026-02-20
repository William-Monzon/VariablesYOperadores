package Operadores;

import java.util.Scanner;

public class OperacionesLogicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer número");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("El número mayor es: " + num1);
		} else if(num1<num2){
			System.out.println("El número mayor es: " + num2);
		} else if(num1==num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("No ingresaste numeros");
		}
		
		
		if(num1>num2 && num2<num1) {
			System.out.println("El primer número siempre sera mayor");
		} else if (num1<num2 || num1==num2) {
			System.out.println("El segundo numero no se queda atrás");
		} else {
			System.out.println("No se cumplio ninguna cuestión");
		}
		
		

	}

}
