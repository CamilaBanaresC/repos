package src.system;

import java.util.ArrayList;

public class Factura {

	
	int FacturaNumero;
	int FacturaValor;
	ArrayList<Articulo> facura_articulos= new ArrayList<>();
	
	
	public Factura() {}


	public Factura(int facturaNumero, int facturaValor, ArrayList<Articulo> facura_articulos) {
		super();
		FacturaNumero = facturaNumero;
		FacturaValor = facturaValor;
		this.facura_articulos = facura_articulos;
	}


	public int getFacturaNumero() {
		return FacturaNumero;
	}


	public void setFacturaNumero(int facturaNumero) {
		FacturaNumero = facturaNumero;
	}


	public int getFacturaValor() {
		return FacturaValor;
	}


	public void setFacturaValor(int facturaValor) {
		FacturaValor = facturaValor;
	}


	public ArrayList<Articulo> getFacura_articulos() {
		return facura_articulos;
	}


	public void setFacura_articulos(ArrayList<Articulo> facura_articulos) {
		this.facura_articulos = facura_articulos;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}
