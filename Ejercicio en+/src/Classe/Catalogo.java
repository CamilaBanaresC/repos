package Classe;

import java.util.ArrayList;

public class Catalogo {
	int CatalogoNumero;
	ArrayList<Producto> catalogo_producto = new ArrayList<>();

	public Catalogo() {

	}

	public Catalogo(int catalogoNumero, ArrayList<Producto> catalogo_producto) {
		super();
		CatalogoNumero = catalogoNumero;
		this.catalogo_producto = catalogo_producto;
	}

	public int getCatalogoNumero() {
		return CatalogoNumero;
	}

	public void setCatalogoNumero(int catalogoNumero) {
		CatalogoNumero = catalogoNumero;
	}

	public ArrayList<Producto> getCatalogo_producto() {
		return catalogo_producto;
	}

	public void setCatalogo_producto(ArrayList<Producto> catalogo_producto) {
		this.catalogo_producto = catalogo_producto;
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
