package almacen;

import java.util.*;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> lista = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		String referencia;
		String nombre;
		int cantidad;
		double precio;
		int opcion = 0;
		int index;
		int eliminar;
		
		do {
			System.out.println("Seleccione la opción a realizar");
			System.out.println("---------------------");
			System.out.println("1) Añadir producto [SOLO MEMORIA RAM]");
			System.out.println("2) Eliminar producto");
			System.out.println("3) Mostrar numero de productos");
			System.out.println("4) Informacion de los productos");
			System.out.println("5)Añadir productos en el disco duro");
			System.out.println("[BETA] 6)Leer productos desde el fichero  ");
			/*
			 Un producto tiene 4 atributos.
			 Cada linea será un dato.Bufferescritura. 
			 */
			System.out.println("99) Salir del programa");
			
			try{
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
			
			case 5:System.out.println("\nInserte referencia");
			referencia = teclado.nextLine();

			System.out.println("\nInserte nombre");
			nombre = teclado.nextLine();

			Producto produc = new Producto(referencia, nombre);
			lista.add(produc);
			
			System.out.println("\n"+produc.toString());
			try{
			FileWriter fw=new FileWriter("lista.dat");
			BufferedWriter bf = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bf);
			for(int i=0;i<lista.size();i++){
				pw.println(lista.get(i).getReferencia());
				pw.println(lista.get(i).getNombre());
				pw.println(lista.get(i).getPrecio());
				pw.println(lista.get(i).getCantidad());
			}
			
			pw.close();
			bf.close();
			fw.close();
			
			
			}catch(Exception e){System.out.println("Compruebe disco duro");};
			
			break; 
			/*Inicio zona BETA*/
		
			case 6:
				try{
					FileReader fr = new FileReader("lista.txt");
					BufferedReader bf = new BufferedReader(fr);
					lista.clear();
					while((referencia=bf.readLine())!= null)
					{
						nombre=bf.readLine();
						precio=Double.parseDouble(bf.readLine());
						cantidad = Integer.parseInt(bf.readLine());
						Producto pnuevo =new Producto(referencia,nombre,precio,cantidad);
						lista.add(pnuevo);
					}
					
					bf.close();
					fr.close();
					
				}catch (Exception e) {System.out.println("Error 107");}
			
			
				/*fin zona BETA*/
				
		case 99:System.out.println("Salida de programa");System.exit(0);break;
		
			}
		} catch (Exception e) {System.out.println("Error 181");};
		} while (opcion != 99);
		
	
	}

}
