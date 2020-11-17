package utilitats;

import java.util.ArrayList;

import model.Aeropuerto;
import model.Avion;

public class UtilidadInicio 
{

	public static ArrayList<Aeropuerto> listaAeropuertoBD = new ArrayList<Aeropuerto>();
	
	public UtilidadInicio() 
	{
		// TODO Auto-generated constructor stub
	}

	
	public static void iniciarValores()
	{
		listaAeropuertoBD.add(new Aeropuerto("F89",  "HTR-34",  "PRS-701"));
		listaAeropuertoBD.add(new Aeropuerto("X99",  "GTR-354", "WPS-837"));
		listaAeropuertoBD.add(new Aeropuerto("F405", "JPR-336", "TPY-917"));
		listaAeropuertoBD.add(new Aeropuerto("S290", "HUK-43",  "TUS-111"));
		
		listaAeropuertoBD.get(0).listaAviones.add(new Avion("F89", 121));
		listaAeropuertoBD.get(0).listaAviones.add(new Avion("F405", 131));
		listaAeropuertoBD.get(1).listaAviones.add(new Avion("X99", 112));
		listaAeropuertoBD.get(2).listaAviones.add(new Avion("F89", 111));
	}
}
