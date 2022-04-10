package cl.vehiculo.vehiculo;

import javax.management.loading.PrivateClassLoader;

public class Vehiculo implements IVehiculo {
	
private String patente="";
private String nombre="";


public Vehiculo(String patente, String nombre) {
	super();
	this.patente = patente;
	this.nombre = nombre;
}


public String getPatente() {
	return patente;
}


public void setPatente(String patente) {
	this.patente = patente;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public void avanzar() {
System.out.println( "Avanzar" );	
}


@Override
public void retroceder() {
	System.out.println( "Retroceder" );	
}


@Override
public void prender() {
	System.out.println( "Prender" );	
}





}

