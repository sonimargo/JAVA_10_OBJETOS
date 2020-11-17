package model;

import java.util.ArrayList;

public class Aeropuerto 
{

	public String avion;
	public String codigoSalida;
	public String codigoDestino;
	
	public ArrayList<Avion> listaAviones;
	
	public Aeropuerto() 
	{
		// TODO Auto-generated constructor stub
	}

	public Aeropuerto(String avion, String codigoSalida, String codigoDestino)
	{
		this.avion = avion;
		this.codigoSalida = codigoSalida;
		this.codigoDestino = codigoDestino;
		this.listaAviones = new ArrayList<Avion>();
	}

	public String getAvion() {
		return avion;
	}

	public void setAvion(String avion) {
		this.avion = avion;
	}

	public String getCodigoSalida() {
		return codigoSalida;
	}

	public void setCodigoSalida(String codigoSalida) {
		this.codigoSalida = codigoSalida;
	}

	public String getCodigoDestino() {
		return codigoDestino;
	}

	public void setCodigoDestino(String codigoDestino) {
		this.codigoDestino = codigoDestino;
	}

	
	public ArrayList<Avion> getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(ArrayList<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}

	@Override
	public String toString() {
		return "Aeropuerto [avion=" + avion + ", codigoSalida=" + codigoSalida + ", codigoDestino=" + codigoDestino
				+ ", listaAviones=" + listaAviones + "]";
	}
}

