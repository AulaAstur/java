import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double suma;
		double resta;
		double mult;
		double div;
		int nummult;
		int i;
		int resmult;
		int opcion;
		num1 = 0;
		num2 = 0;
		nummult = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		do{
		System.out.println("\nIntroduzca el número de la operación que desea realizar:");
		System.out.println("------------------------");
		System.out.println("1. Suma de dos números");
		System.out.println("2. Resta de dos números");
		System.out.println("3. Multiplicación de dos números");
		System.out.println("4. División entre dos números");
		System.out.println("5. Tabla de multiplicar de un número entero dado");
		System.out.println("Cualquier otra tecla para salir del programa");

		
		opcion = teclado.nextInt();
		
		if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4){
			System.out.println("Inserte primer número");
			num1 = teclado.nextInt();
			System.out.println("Inserte segundo número");
			num2 = teclado.nextInt();
		}else if(opcion == 5){
			System.out.println("Inserte numero entero para calcular la tabla");
			nummult = teclado.nextInt();
			
		}
		
		
		switch(opcion){
		case 1:suma=num1+num2;System.out.println("La suma de: "+num1+" + "+num2+" es igual a = "+suma);break;
		case 2:resta=num1-num2;System.out.println("La resta de: "+num1+" - "+num2+" es igual a = "+resta);break;
		case 3:mult=num1*num2;System.out.println("La multiplicación de: "+num1+" * "+num2+" es igual a = "+mult);break;
		case 4:div=num1/num2;System.out.println("La división de: "+num1+" / "+num2+" es igual a = "+div);break;
		case 5:for(i=1;i<11;i++){resmult = nummult * i;System.out.println(nummult+" * "+i+" = "+resmult);}break;
			
		default:System.out.println("Opción incorrecta. Programa finalizado");System.exit(0);
		
		}
		
		}while(opcion!=5);
	}

}
