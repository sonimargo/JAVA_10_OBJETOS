package aplicacion;

import java.util.ArrayList;
import java.util.Collections;

public class Utilidades 
{
	
    public static int diaInicio = 1 ;
    public static int mesInicio = 1 ;
    public static int anyInicio = 1978 ;
    
	public Utilidades() 
	{
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<String>  diasDeLaSemana()
	{
		ArrayList<String> diasSemana = new ArrayList<String>();
		Collections.addAll(diasSemana,
							"Lunes",
							"Martes",
							"Miercoles",
							"Jueves",
							"Viernes",
							"Sabado",
							"Domigo"							
							);
		return diasSemana;
	}

	public static String getDiaDeLaSemana(ArrayList<String>  diasDeLaSemana, int indice)
	{
		String diasSemana = diasDeLaSemana.get(indice);
		return diasSemana;
	}
	
}


