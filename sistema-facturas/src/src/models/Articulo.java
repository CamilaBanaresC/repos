package src.models;

public class Articulo {

	int id;
	int precio;
	int cantidad;
	String nombre;
	
	public Articulo() {
		
	}
	
	public Articulo(int id, int precio, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", precio=" + precio + ", nombre=" + nombre + "]";
	}

	public Articulo(int id, int precio, int cantidad, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
