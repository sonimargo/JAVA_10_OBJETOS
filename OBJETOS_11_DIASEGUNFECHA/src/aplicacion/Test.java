package aplicacion;


import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
		int dia;
		int mes;
		int any;
		
	     try
	     {
	    	 	System.out.println("** Dia: ");
	            dia = Integer.parseInt(scanner.nextLine());
	            
	            System.out.println("** Mes: ");
	            mes = Integer.parseInt(scanner.nextLine());
	            
	            System.out.println("** Año: ");
	            any = Integer.parseInt(scanner.nextLine());
	           
	            Controlador.lecturaDeFecha(dia, mes, any);
	            
	            System.out.println("** Finish ************");
	     }
	     catch(NumberFormatException e)
	        {
	            System.out.println("No es un numero..........");
	        }
		
		
	}

}

