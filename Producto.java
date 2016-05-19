package almacen;

class Producto {
	private String referencia;
	private String nombre;
	private double precio;
	private int cantidad;
	private int porcentaje;
	
	Producto(String referencia, String nombre) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
	}

	Producto(String referencia, String nombre, double precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	Producto(String referencia, String nombre, double precio, int cantidad) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	String getReferencia() {
		return referencia;
	}
	void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	double getPrecio() {
		return precio;
	}
	void setPrecio(double precio) {
		this.precio = precio;
	}
	int getCantidad() {
		return cantidad;
	}
	void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	double precioConIVA(){
		return this.precio*1.21;
	}
		
	void cambioPrecio(double porcentaje){
		if (porcentaje>0){
			this.precio=this.precio*this.porcentaje;
		}
		
	}
		
	
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + ", cantidad="
				+ cantidad + "]";
	}
	
	
}
