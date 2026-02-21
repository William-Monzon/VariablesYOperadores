package Variables; //Paquete llamado Variables
 
import java.util.Scanner; //importo la herramienta para que el programa lea los datos ingresados

public class DeclaracionUsoVariables {

	public static void main(String[] args) {//el String[] permite que la consola reciba datos
		
		Scanner sc = new Scanner(System.in);  //herramienta que lee lo ingresado por el usuario
		 
		//Declaro los tipos de datos y las variables
		int numeros;
		double decimales;
		String nombre;
		boolean valor;
		
		//Enseña un mensaje para ingresar 
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine(); //ingreso los datos que piden
				
		System.out.println("Ingrese un número");
		numeros = sc.nextInt();
		
		System.out.println("Ingrese un número en decimales");
		decimales = sc.nextDouble();
		
		System.out.println("Ingrese un true o false");
		valor = sc.nextBoolean();
		
		//imprime los datos ingresados por el ususario
		System.out.println("El número es: " + numeros);
		System.out.println("El número en decimales es: " + decimales);
		System.out.println("Su nombre es: " + nombre);
		System.out.println("El valor es: " + valor);
		
	}

}
