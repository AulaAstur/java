		/*
		 * Crear un producto p1
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
		
		p1.setCantidad(1);
		
		System.out.println(p1.getCantidad());
		
		}

	}
	
