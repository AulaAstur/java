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
		int eliminar;

		do {
			System.out.println("Seleccione la opción a realizar");
			System.out.println("---------------------");
			System.out.println("1) Añadir producto");
			System.out.println("2) Eliminar producto");
			System.out.println("3) Mostrar numero de productos");
			System.out.println("4) Informacion de los productos");
			System.out.println("99) Salir del programa");
			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {

			case 1:System.out.println("\nInserte referencia");
				referencia = teclado.nextLine();

				System.out.println("\nInserte nombre");
				nombre = teclado.nextLine();

				Producto producto = new Producto(referencia, nombre);
				lista.add(producto);
				
				System.out.println("\n"+producto.toString());break;
		
			case 2:System.out.println("\nIntroduzca producto a eliminar");
				eliminar = Integer.parseInt(teclado.nextLine());
				lista.remove(eliminar-1);break;
				
				
			case 3:System.out.println("\nIndique numero de producto");
				index = Integer.parseInt(teclado.nextLine());
				System.out.println(lista.get(index-1));break;
				
			case 4:System.out.println("\nSe van a mostrar todos los productos almacenados");
				for (int pos=0;pos<lista.size();pos++)
			{
				System.out.println(lista.get(pos).toString());
			}break;
				
			case 99:System.out.println("Salida de programa");System.exit(0);break;
		};//Cierre de switch
		} while (opcion != 99);
	}

}
