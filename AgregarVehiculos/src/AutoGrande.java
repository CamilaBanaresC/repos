
public class AutoGrande extends Automovil {

	String color="";
	
	public AutoGrande(int identificador, int cantidadDeRuedas, int cantidadDeVentanas, int cantidadDePuertas, String color) {
		super(identificador, cantidadDeRuedas, cantidadDeVentanas, cantidadDePuertas);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int getIdentificador() {
		// TODO Auto-generated method stub
		return super.getIdentificador();
	}

	@Override
	public void setIdentificador(int identificador) {
		// TODO Auto-generated method stub
		super.setIdentificador(identificador);
	}

	@Override
	public int getCantidadDeRuedas() {
		// TODO Auto-generated method stub
		return super.getCantidadDeRuedas();
	}

	@Override
	public void setCantidadDeRuedas(int cantidadDeRuedas) {
		// TODO Auto-generated method stub
		super.setCantidadDeRuedas(cantidadDeRuedas);
	}

	@Override
	public int getCantidadDeVentanas() {
		// TODO Auto-generated method stub
		return super.getCantidadDeVentanas();
	}

	@Override
	public void setCantidadDeVentanas(int cantidadDeVentanas) {
		// TODO Auto-generated method stub
		super.setCantidadDeVentanas(cantidadDeVentanas);
	}

	@Override
	public int getCantidadDePuertas() {
		// TODO Auto-generated method stub
		return super.getCantidadDePuertas();
	}

	@Override
	public void setCantidadDePuertas(int cantidadDePuertas) {
		// TODO Auto-generated method stub
		super.setCantidadDePuertas(cantidadDePuertas);
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
