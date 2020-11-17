package aplicacion;

import java.util.ArrayList;

public class Controlador 
{

	public Controlador() 
	{
		// TODO Auto-generated constructor stub
	}

	
	  public static void lecturaDeFecha(int  day, int  month, int year)
	  {
		  	ArrayList<String> diasDeLaSemana = Utilidades.diasDeLaSemana();
	        int diaDeLaSemana = calcularDias(day, month, year) % 7;
	        //System.out.println(weekDay);
	        
	        if(comprobarFecha(day, month, year) == 1)
	        {
	            if(diaDeLaSemana == year)
	            {
	                System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 0));
	            }
	            else if (diaDeLaSemana == 2)
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 0));
	            }
	            else if (diaDeLaSemana == 3)
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 1));
	            }
	            else if (diaDeLaSemana == 4)
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 2));
	            }
	            else if (diaDeLaSemana == 5)
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 3));
	            }
	            else if (diaDeLaSemana == 6)
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 4));
	            }	            
	            else
	            {
	            	System.out.println(Utilidades.getDiaDeLaSemana(diasDeLaSemana, 5));
	            }
	        }
	        else
	        {
	            System.out.println("Introduce a valid date.");
	        }


	    }

	  	//Dias transcurridos desde la fecha que se introduce por consola
	    public static int calcularDias (int dia, int mes, int any)
	    {
	        int totalAnysEnDias = 0;
	        int totalMesesEnDias = 0;
	        int diferenciaDeDays = 0;
	        //Si fecha introducida está dentro de la fecha inicial
	        if(comprobarFecha(dia, mes, any) == 1 )
	        {
	        	//Obtener los años transcurridos a partir del año inicial menos el año introducido 
	            int diferenciaAnys = any - Utilidades.anyInicio;
	            //Trasformar los años transcurridos en dias transcurridos
	            totalAnysEnDias = diferenciaAnys * 365;
	            
	            //Obtenemos los meses transcurridos a partir del mes inicial menos el mes introducido
	            int diferenciasMeses = mes - Utilidades.mesInicio;
	            //Trasformar los meses transcurridos en dias transcurridos
	            totalMesesEnDias = diferenciasMeses * 30;
	            
	            //Obtenemos los dias transcurridos a partir del dia inicial menos el dia introducido
	            diferenciaDeDays = dia - Utilidades.diaInicio;
	        }
	        
	        if(comprobarFecha(dia, mes, any) == 1 && comprobarAny(any) == any)
	        {
	            int diferenciaAnys = any - Utilidades.anyInicio;
	            totalAnysEnDias = diferenciaAnys * 366;
	        }
	        return totalAnysEnDias + totalMesesEnDias + diferenciaDeDays;
	    }

	    //Comprobar si la fecha que introducimos por consola, está dentro de la fecha inicial
	    public static int comprobarFecha(int dia, int mes, int any)
	    {
	        if(dia >= Utilidades.diaInicio && dia <= 30 && 
	           mes >= Utilidades.mesInicio && mes <= 12 && 
	           any >= Utilidades.anyInicio)
	        {
	            return 1;
	        }
	        else
	        {
	            return 0;
	        }
	    }
	    
	    //Comprobar año bisiesto
	    public static int comprobarAny(int anyAcomprobar)
	    {
	        if(anyAcomprobar % 2 == 0 && anyAcomprobar % 100 != 0 || anyAcomprobar % 4 == 0)
	        {
	            return anyAcomprobar;
	        }
	        else
	        {
	            return 0;
	        }
	    }

}

