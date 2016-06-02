package empresa;

class Ejecutivo extends Empleado{
	int presupuesto;
	
	
	Ejecutivo(String nombre, int sueldo, int presupuesto) {
		super(nombre, sueldo);
		this.presupuesto=presupuesto;
		
	}


	int getPresupuesto() {
		return presupuesto;
	}


	void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Ejecutivo [presupuesto=" + presupuesto + ", nombre=" + nombre + ", numEmpleado=" + numEmpleado
				+ ", sueldo=" + sueldo + "]";
	}
	
	
}

