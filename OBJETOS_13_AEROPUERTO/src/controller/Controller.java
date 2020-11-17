package controller;


import java.util.Scanner;
import java.util.ArrayList;

import model.Avion;
import model.Aeropuerto;

public class Controller 
{
	public ArrayList<Avion> listaAvionesBD;
	public ArrayList<Aeropuerto> listaAeropuertoBD;
	
	
	public Controller() 
	{
		listaAvionesBD = new ArrayList<Avion>();
		listaAeropuertoBD = new ArrayList<Aeropuerto>();
		
	}

	public static String solicitarOpcion(Scanner scannerPantalla)
	{
		System.out.println("  *** Elige opción *** ");			
		return scannerPantalla.nextLine();
	}
	
	public void entradaAviones (Scanner scannerPantalla)
	{
		try
		{
			System.out.println("Codigo avión: ");
			String codiAvion = scannerPantalla.nextLine();
			System.out.println("Capacidad: ");
			Integer capacidad = Integer.parseInt(scannerPantalla.nextLine());
			
			listaAvionesBD.add(new Avion(codiAvion, capacidad));
		}
		catch (NumberFormatException e)
		{
			System.out.println("Introduzca un numero correcto");
		}
	}
	
	public void entradaAeropueto (Scanner scannerPantalla)
	{
		System.out.println("Codigo avión: ");
		String codiAvion = scannerPantalla.nextLine();
		System.out.println("Codigo Salida: ");
		String codigoSalida = scannerPantalla.nextLine();
		System.out.println("Codigo Destino: ");
		String codigoDestino = scannerPantalla.nextLine();
		
		listaAeropuertoBD.add(new Aeropuerto(codiAvion, codigoSalida, codigoDestino));
	}	
	
	public void impresionDatosAviones(Scanner scannerPantalla)
	{
		System.out.println(listaAvionesBD);
	}
	public void impresionDatosAeropuerto(Scanner scannerPantalla)
	{
		System.out.println(listaAeropuertoBD);
	}
	public void impresionDatosAvion(Scanner scannerPantalla)
	{
		System.out.println("Codigo avión: ");
		String codiAvion = scannerPantalla.nextLine();
		
		for (Avion avion : listaAvionesBD)
		{
			if (avion.getAvion().equals(codiAvion))
				System.out.println("\n" + avion + "\n");
		}
	}
}
