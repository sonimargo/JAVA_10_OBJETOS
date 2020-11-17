package aplicacion;

import java.util.Scanner;
import vista.Menu;
import model.Bird;
import service.ListaBirdsDataBase;
import utilidades.UtilsInicializar;

public class MainBirding 
{

	public static void main(String[] args) 
	{
		//Objetos que necesito en todo el programa
		Scanner scanner = new Scanner(System.in);	
		ListaBirdsDataBase listaBirdDB = new ListaBirdsDataBase(); 
		
		//Inicializar la lista para hacer pruebas
		listaBirdDB.setListaBirds(UtilsInicializar.listaBirdsInicial);
		
		// Creamos menu
		Menu menu = new Menu(scanner, listaBirdDB);
		
		menu.solicitarOpcion();		
		
		System.out.println("Finish ..... ");
	}

}
