package Variables;
 
import java.util.Scanner;

public class DeclaracionUsoVariables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		double decimales;
		String nombre;
		boolean valor;
		
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
				
		System.out.println("Ingrese un número");
		numeros = sc.nextInt();
		
		System.out.println("Ingrese un número en decimales");
		decimales = sc.nextDouble();
		
		System.out.println("Ingrese un true o false");
		valor = sc.nextBoolean();
		
		System.out.println("El número es: " + numeros);
		System.out.println("El número en decimales es: " + decimales);
		System.out.println("Su nombre es: " + nombre);
		System.out.println("El valor es: " + valor);
		
	}

}
