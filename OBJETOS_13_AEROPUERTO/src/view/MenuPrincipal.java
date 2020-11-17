package view;

import java.util.Scanner;

import controller.Controller;

public class MenuPrincipal 
{

	public MenuPrincipal() 
	{
		// TODO Auto-generated constructor stub
	}

	public void solicitarOpcion (Scanner scannerPantalla)
	{
		String datoEntrada;
		MenuOpciones menuOpciones = new MenuOpciones();
		Controller controlador = new Controller();
		
		while (true)
		{				
			menuOpciones.mostrarMenuPrincipal();
			datoEntrada =  Controller.solicitarOpcion(scannerPantalla);
			
			// aviones
			if (datoEntrada.equals("1"))  
			{
				controlador.entradaAviones(scannerPantalla);
			}
			// aeropuestos
			if (datoEntrada.equals("2"))  
			{
				controlador.entradaAeropueto(scannerPantalla);
			}
			// Impresion
			if (datoEntrada.equals("3"))  
			{
				menuOpciones.mostrarMenuImpresion();
				datoEntrada =  Controller.solicitarOpcion(scannerPantalla);
				// Impresion aviones
				if (datoEntrada.equals("1"))  
				{
					controlador.impresionDatosAviones(scannerPantalla);
				}
				//Impresion vuelos
				else if (datoEntrada.equals("2")) 
				{
					controlador.impresionDatosAeropuerto(scannerPantalla);
				}
				//Impresion un avion
				else if (datoEntrada.equals("3")) 
				{
					controlador.impresionDatosAvion(scannerPantalla);
				}
				else
				{
					System.out.println("Opción incorrecta..... ");
				}
				
			}
			// salir 
			if (datoEntrada.equals("4"))  
			{
				break;
			}
		}
	}
}

