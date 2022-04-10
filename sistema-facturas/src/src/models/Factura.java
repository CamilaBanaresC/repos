package src.models;

import java.util.ArrayList;

public class Factura {

	int facturaNumero;
	int facturaValor;
	ArrayList<Articulo> factura_articulos= new ArrayList<>();
	
	public Factura() {
		
	}
	
	public Factura(int facturaNumero, int facturaValor, ArrayList<Articulo> factura_articulos) {
		super();
		this.facturaNumero = facturaNumero;
		this.facturaValor = facturaValor;
		this.factura_articulos = factura_articulos;
	}

	public int getFacturaNumero() {
		return facturaNumero;
	}

	public void setFacturaNumero(int facturaNumero) {
		this.facturaNumero = facturaNumero;
	}

	public int getFacturaValor() {
		return facturaValor;
	}

	public void setFacturaValor(int facturaValor) {
		this.facturaValor = facturaValor;
	}

	public ArrayList<Articulo> getFactura_articulos() {
		return factura_articulos;
	}

	public void setFactura_articulos(ArrayList<Articulo> factura_articulos) {
		this.factura_articulos = factura_articulos;
	}

	@Override
	public String toString() {
		return "Factura [facturaNumero=" + facturaNumero + ", facturaValor=" + facturaValor + ", factura_articulos="
				+ factura_articulos + "]";
	}
	
	
}
