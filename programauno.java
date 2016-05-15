package proyecto1;

import java.util.Scanner;

public class programauno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Programa que muestre opción 1,2 y 3 */
	
		int opcion = 0;
		Scanner teclado = new Scanner(System.in);
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(3,3);
		
		do{
		System.out.println("Menu");
		System.out.println("Teclee el número de la opción que desea");
		System.out.println("----------");
		System.out.println("1. Mostrar datos del punto 1");
		System.out.println("2. Mostrar datos del punto 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Salir");
		opcion = teclado.nextInt();
		
		switch(opcion){
		case 1:System.out.println(p1.toString());break;
		case 2:System.out.println(p2.toString());break;
		case 3:System.out.println("Has tecleado la opción 3");break;
		case 4:System.out.println("Salida de programa");break;
		default:System.out.println("Opción incorrecta. Programa finalizado");System.exit(0);
		};
		}while (opcion!=4);

	}
	//Git TEST.
}
