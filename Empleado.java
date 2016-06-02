package empresa;

public class Empleado {

	String nombre;
	int numEmpleado;
	int sueldo;
	
	static private int contador = 0;
	
	Empleado(String nombre, int sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		numEmpleado = ++contador;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getNumEmpleado() {
		return numEmpleado;
	}

	void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	int getSueldo() {
		return sueldo;
	}

	void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + "]";
	}

	
	
}
