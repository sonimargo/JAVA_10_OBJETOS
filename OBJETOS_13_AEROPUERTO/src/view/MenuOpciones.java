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
				" 1 - A�adir un avi�n", 				
				" 2 - A�adir un vuelo",
				" 3 - Gesti�n impresi�n",
				" 4 - Salir"
				);

		listaOpcionesImpresion = new ArrayList<String>();	
		Collections.addAll(listaOpcionesImpresion, 
				" 1 - Impresi�n listado aviones", 				
				" 2 - Impresi�n listado vuelos",
				" 3 - Impresi�n un avion",
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
		System.out.println("******** Impresi�n ********");
		System.out.println("***************************");

		for (int i = 0; i < listaOpcionesImpresion.size(); i++ )
		{
			System.out.println(listaOpcionesImpresion.get(i));
		}
	}	
}

