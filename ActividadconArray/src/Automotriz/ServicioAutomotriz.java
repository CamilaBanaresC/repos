package Automotriz;

import java.util.ArrayList;

public class ServicioAutomotriz implements IServicioAutomotriz {
	
	
	
	/**@Autor Camila Bañares 
	
	
	/**
	 * Clase automotriz que implemta de IServicioAtomotriz
	 
	  */
	
	/**
	 * String tipo = tipo de auto
	  */
	private String tipo; 
	/**
     * valor del auto
     */
	private int valor;  
	/**
     * patente del auto
     */
	private String patente; 
	/**
     * es disponble = si el auto esta disponible para arrendar
     */
	private boolean esdisponble;
	/**
     * montoRecaudado = montoRecaudado de arriendo
     */
	private int montoRecaudado;
	/**
     * camionetaArrayList = espacio en memoria para las camionetas
     */
	private ArrayList<Camioneta> camionetaArrayList = new ArrayList<Camioneta>();
	/**
     * SuvArrayList = espacio en memoria para las suv
     */
	private ArrayList<SUV> SuvArrayList = new ArrayList<SUV>();
	/**
     * SedanArrayList = espacio en memoria para las Sedan
     */
	private ArrayList<Sedan> SedanArrayList = new ArrayList<Sedan>();
	/**
     * CoupeArrayList = espacio en memoria para los Coupe
     */
	private ArrayList<Coupe> CoupeArrayList = new ArrayList<Coupe>();
	/**
     * listaVehiculosDisponibles = espacio en memoria para los vehiculos disponibles
     */
	private ArrayList<Object> listaVehiculosDisponibles = new ArrayList<>();
	/**
     * listaVehiculosNoDisponibles = espacio en memoria para los vehiculos no disponibles
     */
	private ArrayList<Object> listaVehiculosNoDisponibles = new ArrayList<>();
	
	// Constructores
	/**
     * ServicioAutomotriz = Contructor Basio 
     */
	public ServicioAutomotriz() {} 

	public ServicioAutomotriz(String tipo, int valor, String patente, boolean esdisponble) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.patente = patente;
		this.esdisponble = esdisponble;
	}
	
	// Métodos o funciones
	/**
     * arrendarVehiculo = metodo para arrendarVehiculo
     * Se optiene un objeto de la clase SUV 
     * Cambiamos el monto recaudado por el monto recaudado + el valor de la venta 
     * Se cambia el esdisponible a false 
     * Se trae la lista de vehiculos disponible y se remueve el objeto
     * 
     * lo mismo para todas las demas 
     * 
     */
	@Override
	public void arrendarVehiculo(Object obj) {
		if(obj instanceof SUV) {
			this.setMontoRecaudado(this.getMontoRecaudado() + ((SUV)obj).getValor());   
			((SUV) obj).setEsdisponble(false);
			this.getListaVehiculosDisponibles().remove(((SUV) obj));
			this.getListaVehiculosNoDisponibles().add(((SUV) obj));
		} else if (obj instanceof Coupe) {
			
			
			this.setMontoRecaudado(this.getMontoRecaudado() + ((Coupe)obj).getValor()); 
			((Coupe) obj).setEsdisponble(false);
			this.getListaVehiculosDisponibles().remove(((Coupe) obj));
			this.getListaVehiculosNoDisponibles().add(((Coupe) obj));
		} else if (obj instanceof Sedan) {
			this.setMontoRecaudado(this.getMontoRecaudado() + ((Sedan)obj).getValor()); 
			((Sedan) obj).setEsdisponble(false);
			this.getListaVehiculosDisponibles().remove(((Sedan) obj));
			this.getListaVehiculosNoDisponibles().add(((Sedan) obj));
		} else {
			this.setMontoRecaudado(this.getMontoRecaudado() + ((Camioneta)obj).getValor()); 
			((Camioneta) obj).setEsdisponble(false);
			this.getListaVehiculosDisponibles().remove(((Camioneta) obj));
			this.getListaVehiculosNoDisponibles().add(((Camioneta) obj));
		}
		
	}
	
	/**
     * si obtiene el objeto de la clase SUV
     * cambiar el estado a true 
     * trae lista y añadir el objeto
     *trae la lista y añadir el objeto
     *  lo mismo para los demas 
     */

	@Override
	public void devolverVehiculo(Object obj) {
		if(obj instanceof SUV) {
			((SUV) obj).setEsdisponble(true);
			this.getListaVehiculosDisponibles().add(((SUV) obj));
			this.getListaVehiculosNoDisponibles().remove(((SUV) obj));
		} else if (obj instanceof Coupe) {
			((Coupe) obj).setEsdisponble(true);
			this.getListaVehiculosDisponibles().add(((Coupe) obj));
			this.getListaVehiculosNoDisponibles().remove(((Coupe) obj));
		} else if (obj instanceof Sedan) {
			((Sedan) obj).setEsdisponble(true);
			this.getListaVehiculosDisponibles().add(((Sedan) obj));
			this.getListaVehiculosNoDisponibles().remove(((Sedan) obj));
		} else {
			((Camioneta) obj).setEsdisponble(true);
			this.getListaVehiculosDisponibles().add(((Camioneta) obj));
			this.getListaVehiculosNoDisponibles().remove(((Camioneta) obj));
		}
	}
	
	
	/**
     *metodo para traer el monto total recaudado 
     */
	@Override
	public int MontoTotal() {
		return this.getMontoRecaudado();
	}

	
	/**
     *metodo listadoDeVehiculosDisponibles
     *Se recorre la lista y se pregunta si sedan esta disponible 
     *si es asi traeme la lista de vehiculos disponibles y agregale un sedan 
     */
	@Override
	public ArrayList<Object> listadoDeVehiculosDisponibles() {
		for(Sedan sedan: this.getSedanArrayList()) {
			if(sedan.isEsdisponble()) {}
				this.getListaVehiculosDisponibles().add(sedan);
				System.out.print(this.getListaVehiculosDisponibles());
			
		}
		
		for(SUV suv: this.getSuvArrayList()) {
			if(suv.isEsdisponble()) {
				this.getListaVehiculosDisponibles().add(suv);
			}
		}
		
		for(Coupe coupe: this.getCoupeArrayList()) {
			if(coupe.isEsdisponble()) {
				this.getListaVehiculosDisponibles().add(coupe);
			}
		}
		
		for(Camioneta camioneta: this.getCamionetaArrayList()) {
			if(camioneta.isEsdisponble()) {
				this.getListaVehiculosDisponibles().add(camioneta);
			}
		}

		return this.getListaVehiculosDisponibles();
	}

	@Override
	public ArrayList<Object> listadoDeVehiculosNoDisponibles() {
		for(Sedan sedan: this.getSedanArrayList()) {
			if(!sedan.isEsdisponble()) {
				this.getListaVehiculosNoDisponibles().add(sedan);
			}
		}
		
		for(SUV suv: this.getSuvArrayList()) {
			if(!suv.isEsdisponble()) {
				this.getListaVehiculosNoDisponibles().add(suv);
			}
		}
		
		for(Coupe coupe: this.getCoupeArrayList()) {
			if(!coupe.isEsdisponble()) {
				this.getListaVehiculosNoDisponibles().add(coupe);
			}
		}
		
		for(Camioneta camioneta: this.getCamionetaArrayList()) {
			if(!camioneta.isEsdisponble()) {
				this.getListaVehiculosNoDisponibles().add(camioneta);
			}
		}

		return this.getListaVehiculosNoDisponibles();
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

	// Getter y Setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean isEsdisponble() {
		return esdisponble;
	}

	public void setEsdisponble(boolean esdisponble) {
		this.esdisponble = esdisponble;
	}
	
	public int getMontoRecaudado() {
		return montoRecaudado;
	}

	public void setMontoRecaudado(int montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}

	public ArrayList<Camioneta> getCamionetaArrayList() {
		return camionetaArrayList;
	}

	public void setCamionetaArrayList(ArrayList<Camioneta> camionetaArrayList) {
		this.camionetaArrayList = camionetaArrayList;
	}

	public ArrayList<SUV> getSuvArrayList() {
		return SuvArrayList;
	}

	public void setSuvArrayList(ArrayList<SUV> suvArrayList) {
		SuvArrayList = suvArrayList;
	}

	public ArrayList<Sedan> getSedanArrayList() {
		return SedanArrayList;
	}

	public void setSedanArrayList(ArrayList<Sedan> sedanArrayList) {
		SedanArrayList = sedanArrayList;
	}

	public ArrayList<Coupe> getCoupeArrayList() {
		return CoupeArrayList;
	}

	public void setCoupeArrayList(ArrayList<Coupe> coupeArrayList) {
		CoupeArrayList = coupeArrayList;
	}

	public ArrayList<Object> getListaVehiculosDisponibles() {
		return listaVehiculosDisponibles;
	}

	public void setListaVehiculosDisponibles(ArrayList<Object> listaVehiculosDisponibles) {
		this.listaVehiculosDisponibles = listaVehiculosDisponibles;
	}

	public ArrayList<Object> getListaVehiculosNoDisponibles() {
		return listaVehiculosNoDisponibles;
	}

	public void setListaVehiculosNoDisponibles(ArrayList<Object> listaVehiculosNoDisponibles) {
		this.listaVehiculosNoDisponibles = listaVehiculosNoDisponibles;
	}


}
