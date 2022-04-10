package Automotriz;

import java.util.ArrayList;

public interface IServicioAutomotriz {

	public void arrendarVehiculo (Object obj);
	public void devolverVehiculo (Object obj);
	public int MontoTotal();
	public ArrayList<Object> listadoDeVehiculosDisponibles();
	public ArrayList<Object> listadoDeVehiculosNoDisponibles();
}
