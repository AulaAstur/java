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
		int index;

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

				Producto producto = new Producto(referencia, nombre);
				lista.add(producto);
				
				System.out.println("\n"+producto.toString());
				
			}else if(opcion==2){
				System.out.println("Solo las opciones 1, 3 y 99 están disponibles");
				
			}else if(opcion==3){
				System.out.println("\nIndique numero de producto");
				index = teclado.nextInt();
				System.out.println(lista.get(index));
				
			}else if(opcion==99){
				System.out.println("Salida de programa");System.exit(0);
			}

		} while (opcion != 99);
	}

}
