package practica09;


import java.text.Normalizer;

public class Utilidades 
{

	String textoABuscar; 
	
	public Utilidades()
	{
		// TODO Auto-generated constructor stub
	}
	

	public static String eliminarAcentos (String texto)
	{
	       texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
	       texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	       return texto;
	}
	
}