package view;

import java.util.ArrayList;
import java.util.Collections;

public class MenuOpciones 
{
	ArrayList<String> listaOpcionesMenu;
	ArrayList<String> listaOpcionesImpresion;
	
	public MenuOpciones() 
	{
		listaOpcionesMenu = new ArrayList<String>();	
		Collections.addAll(listaOpcionesMenu, 
				" 1 - Añadir un avión", 				
				" 2 - Añadir un vuelo",
				" 3 - Gestión impresión",
				" 4 - Salir"
				);

		listaOpcionesImpresion = new ArrayList<String>();	
		Collections.addAll(listaOpcionesImpresion, 
				" 1 - Impresión listado aviones", 				
				" 2 - Impresión listado vuelos",
				" 3 - Impresión un avion",
				" 4 - Salir"
				);	
	}
	
	public void mostrarMenuPrincipal()
	{	
		System.out.println("******** Menu ********");
		System.out.println("**********************");

		for (int i = 0; i < listaOpcionesMenu.size(); i++ )
		{
			System.out.println(listaOpcionesMenu.get(i));
		}
	}

	public void mostrarMenuImpresion()
	{	
		System.out.println("******** Impresión ********");
		System.out.println("***************************");

		for (int i = 0; i < listaOpcionesImpresion.size(); i++ )
		{
			System.out.println(listaOpcionesImpresion.get(i));
		}
	}	
}

