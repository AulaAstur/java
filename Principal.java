package almacen;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> lista = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		String referencia;
		String nombre;
		int cantidad;
		int opcion;

		do {
			System.out.println("Seleccione la opción a realizar");
			System.out.println("---------------------");
			System.out.println("1) Añadir producto");
			System.out.println("2) Eliminar producto");
			System.out.println("3) Mostrar numero de productos");
			System.out.println("99) Salir del programa");
			opcion = Integer.parseInt(teclado.nextLine());

			if (opcion == 1) {

				System.out.println("\nInserte referencia");
				referencia = teclado.nextLine();

				System.out.println("\nInserte nombre");
				nombre = teclado.nextLine();

				Producto aa = new Producto(referencia, nombre);
				lista.add(aa);

			} // if

		} while (opcion != 99);
	}

}
