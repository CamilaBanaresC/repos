package Classe;

public class Producto {

	private int Id = 0;
	private int categoria;
	private int precio;
	private String nombre;
	private String Descripcion;
	private String Cantidad;

	public Producto() {

	}

	public Producto(int id, int categoria, int precio, String nombre, String descripcion, String cantidad) {
		super();
		Id = id;
		this.categoria = categoria;
		this.precio = precio;
		this.nombre = nombre;
		Descripcion = descripcion;
		Cantidad = cantidad;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
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

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
