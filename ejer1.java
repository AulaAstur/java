import java.util.Scanner;
import java.lang.*;

public class ejeruno {

	public static void main(String[] args) {
		double num;
		double numproc;
		double coseno;
		double tangente;
		double seno;
		
		System.out.println("Introduzca el ángulo para calcular seno coseno y tangente");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextDouble();
		
		numproc = Math.toRadians(num);
		coseno = Math.cos(numproc);
		tangente = Math.tan(numproc);
		seno = Math.sin(numproc);
		
		System.out.println("EL coseno es: "+coseno+". La tangente es: "+tangente+". Y el seno es: "+seno);
		
	}
}
