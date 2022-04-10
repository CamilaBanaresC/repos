
public class Automovil {

	int identificador;
	int cantidadDeRuedas;
	int cantidadDeVentanas;
	int cantidadDePuertas;
	public Automovil(int identificador, int cantidadDeRuedas, int cantidadDeVentanas, int cantidadDePuertas) {
		super();
		this.identificador = identificador;
		this.cantidadDeRuedas = cantidadDeRuedas;
		this.cantidadDeVentanas = cantidadDeVentanas;
		this.cantidadDePuertas = cantidadDePuertas;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getCantidadDeRuedas() {
		return cantidadDeRuedas;
	}
	public void setCantidadDeRuedas(int cantidadDeRuedas) {
		this.cantidadDeRuedas = cantidadDeRuedas;
	}
	public int getCantidadDeVentanas() {
		return cantidadDeVentanas;
	}
	public void setCantidadDeVentanas(int cantidadDeVentanas) {
		this.cantidadDeVentanas = cantidadDeVentanas;
	}
	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}
	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
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
