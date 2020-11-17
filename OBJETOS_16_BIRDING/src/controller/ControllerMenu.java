package controller;

import java.util.Scanner;

import model.Bird;
import service.ListaBirdsDataBase;
import utilidades.Utilidades;

public class ControllerMenu 
{
	//Scanner scannerControlador;
	//ListaBirdsDataBase listaBirdsDB;
	
	public ControllerMenu() 
	{
		// TODO Auto-generated constructor stub
	}

	// Metodos static del Front
	public static String elegirOpcionDePantalla (Scanner scanner, String opcion)
	{
		System.out.println(opcion);
		opcion = scanner.nextLine();
		return opcion;
	}
	
	public static void addAveAlista (Scanner scanner, ListaBirdsDataBase listaBirdDB)
	{
		String nombre = Utilidades.askNombre(scanner);		
		String nombreLatin = Utilidades.askNombreLatin(scanner);
		
		if (!existeAveEnLista(listaBirdDB,nombre))
			listaBirdDB.addAveAlista(new Bird(nombre, nombreLatin, 1));
		else
			Utilidades.imprimirTexto("El ave introducida ya existe en BD.....\n");
	}
	
	public static void addObservacion(Scanner scanner, ListaBirdsDataBase listaBirdDB)
	{
		String nombreAve = Utilidades.askNombre(scanner);
		
		if (listaBirdDB.listaBirds.isEmpty())
			Utilidades.imprimirTexto("No existen aves en BD ..... \n");
		else
		{
			if (existeAveEnLista(listaBirdDB, nombreAve))
			{
				int numObservacioens = Utilidades.askObservacion(scanner, listaBirdDB);
				
				Bird ave = buscarAveEnLista(listaBirdDB, nombreAve);
				listaBirdDB.addObservacion(ave, numObservacioens);
				Utilidades.imprimirTexto("Ave encontrada ..... \n");
			}
			else
				Utilidades.imprimirTexto("No existe ave " + nombreAve + "    en BD ..... \n");
		} 
	}
	
	//Visualizar un ave
	public static void visualizarAve(Scanner scanner, ListaBirdsDataBase listaBirdDB)
	{		   
		  String nombreAve = Utilidades.askNombre(scanner);
		  
		  Bird ave = buscarAveEnLista(listaBirdDB, nombreAve);
		  listaBirdDB.visualizarAve(ave);		  
	}
	
	//Visualizar todas las aves
	public static void estadisticas( ListaBirdsDataBase listaBirdDB)
	{
		listaBirdDB.estadisticas();
	}
	
	public static void tamañoListaAves( ListaBirdsDataBase listaBirdDB)
	{
		Utilidades.imprimirTexto("Tamaño de la Lista " + listaBirdDB.tamañoListaBirds());
	}
	
	public static void eliminarAveDeLista (Scanner scanner, ListaBirdsDataBase listaBirdDB)
	{
		//nombre buscar en lista eliminar
		String nombre = Utilidades.askNombre(scanner);
		Bird ave = buscarAveEnLista(listaBirdDB, nombre);
		listaBirdDB.removeAve(ave);
		//System.out.println(listaBirdDB);
	}
	
	public static void existeAveEnLista (Scanner scanner, ListaBirdsDataBase listaBirdDB)
	{
		String nombre = Utilidades.askNombre(scanner);
		Boolean existe = existeAveEnLista(listaBirdDB, nombre);
		if (existe)
			Utilidades.imprimirTexto("Existe ave ");
		else
			Utilidades.imprimirTexto("NO Existe ave ");
	}
	
	
	// Metodos static del controller
	
	public static Bird buscarAveEnLista(ListaBirdsDataBase listaBirdDB, String nombreAve)
	{
		if (listaBirdDB.listaBirds.isEmpty())
			return null;
		
		for (Bird pajaro : listaBirdDB.listaBirds )
		{
			if (Utilidades.pasarAmayusculas(pajaro.getNombre()).equals(Utilidades.pasarAmayusculas(nombreAve)))
			{
				return pajaro;
			}			
		}	
		return null;
	}

	public static Boolean existeAveEnLista(ListaBirdsDataBase listaBirdDB, String nombreAve)
	{
		if (listaBirdDB.listaBirds.isEmpty())
			return false;
		
		for (Bird pajaro : listaBirdDB.listaBirds )
		{
			if (Utilidades.pasarAmayusculas(pajaro.getNombre()).equals(Utilidades.pasarAmayusculas(nombreAve)))
			{
				return true;
			}			
		}	
		return false;
	}
		
}



