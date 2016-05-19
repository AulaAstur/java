		/*
		 * Crear un producto p1 YAY
		 * Y system out println cambiando atributos.
		 * 
		 * Comillas dobles string, simples char
		 * */

package almacen;
import java.util.Scanner;

public class Cambios {

	public static void main(String[] args) {
		System.out.println("Generación de un producto");
		Producto p1 = new Producto("0","cero", 0);
		
		
		System.out.println("Anterior cantidad: "+p1.getCantidad());
		System.out.println("Anterior referencia: "+p1.getReferencia());
		p1.setCantidad(1);
		p1.setReferencia("0100");
		System.out.println("\nCambios de datos efectuados:");
		System.out.println("Nueva cantidad: "+p1.getCantidad());
		System.out.println("Nueva referencia: "+p1.getReferencia());
		}
