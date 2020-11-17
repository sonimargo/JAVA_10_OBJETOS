package practica05;

public class MainTest05 {

	public static void main(String[] args) 
	{
		Persona persona1 = new Persona("Pepe","Marin", 17, new MyDate(24,5,2002));
		Persona persona2 = new Persona("Maria","Hidalgo", 20, new MyDate(20,3,2000));

		System.out.println(persona1);
		System.out.println(persona2);
					
		// test calcula edad
		/*
		 * MyDate fecha = new MyDate(14,10,2020); int edat =
		 * persona1.calculaEdad(fecha); System.out.println("Edat calcul  "+ edat);
		 * System.out.println("Edat  " + persona1.printEdad());
		 */
					
		boolean esAdulto = persona1.isAdulto();
		if (esAdulto)
			System.out.println(persona1.printPersona() + " es adulto");
		else
			System.out.println(persona1.printPersona() + " no es adulto");
		
		esAdulto = persona2.isAdulto();
		if (esAdulto)
			System.out.println(persona2.printPersona() + " es adulto");
		else
			System.out.println(persona2.printPersona() + "no es adulto");
				
		persona1.sumarAnyos(); 
		System.out.println(persona1);
				 
		persona2.sumarAnyos(20); 
		System.out.println(persona2);
				  
		persona1.setPeso(68);
		persona1.setAltura(168);
		System.out.println(persona1.printPersona() + "\n   Indice masa corporal:  " + persona1.indiceMasaCorporal());
				
	}

}