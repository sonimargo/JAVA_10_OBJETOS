package services;

import java.util.ArrayList;

import model.Aeropuerto;

public class BDListaAeropuertos 
{

	public ArrayList<Aeropuerto> listaAeropuertoBD;
	
	public BDListaAeropuertos() 
	{
		// TODO Auto-generated constructor stub
	}

	public void addAeropuerto(Aeropuerto aeropuerto)
	{
		listaAeropuertoBD.add(aeropuerto);
	}
	
	public void removeAeropuerto(Aeropuerto aeropuerto)
	{
		listaAeropuertoBD.remove(aeropuerto);
	}
	
	public void modifcarAeropuerto(Aeropuerto aeropuerto)
	{
		if (existeAeropuerto(aeropuerto))
		{
			for (Aeropuerto aeropuertoLista : listaAeropuertoBD)
			{
				listaAeropuertoBD.set(listaAeropuertoBD.indexOf(aeropuertoLista) , aeropuerto);
			}
		}
	}
	
	///////////
	public Boolean existeAeropuerto(Aeropuerto aeropuerto)
	{
		if (listaAeropuertoBD.contains(aeropuerto))
			return true;
		else
			return false;
	}

	public ArrayList<Aeropuerto> getListaAeropuertoBD() {
		return listaAeropuertoBD;
	}

	public void setListaAeropuertoBD(ArrayList<Aeropuerto> listaAeropuertoBD) {
		this.listaAeropuertoBD = listaAeropuertoBD;
	}

	@Override
	public String toString() {
		return "ListaAeropuetosBD [listaAeropuertoBD=" + listaAeropuertoBD + "]";
	}	
}


