package app;

import java.util.Scanner;

import services.BDListaAeropuertos;
import view.MenuOpciones;
import view.MenuPrincipal;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		MenuPrincipal menuPrincipal = new MenuPrincipal();		
		BDListaAeropuertos listaAeropuetosBD; 
		
		menuPrincipal.solicitarOpcion(scanner);
		
		System.out.println("Finish ..... ");
	}

}