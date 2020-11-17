package practica07;

public class MainTest07 
{

	public static void main(String[] args) 
	{
		Apartamento apartamento1 = new Apartamento(2, 30, 1000);
		Apartamento apartamento2 = new Apartamento(2, 35, 1100);
		Apartamento apartamento3 = new Apartamento(3, 36, 1200);
		Apartamento apartamento4 = new Apartamento(3, 45, 1150);
		
		//Test apartamento1 mas grande que apartemento2
		boolean apartamentoMasGrande = apartamento1.apartamentMasAmplio(apartamento2);
		if (apartamentoMasGrande)
		{
			System.out.println("Apartamento 1, m2: " + apartamento1.getSquareMeters() + 
				" , mas grande que \nApartamento 2, m2: " + apartamento2.getSquareMeters());
		}
		else
		{
			System.out.println("Apartamento 2, m2: " + apartamento2.getSquareMeters() + 
				" , mas grande que \nApartamento 1, m2: " + apartamento1.getSquareMeters());
		}
		
		
		// Test calcular precio metro 2
		double precioMetro2 = apartamento1.calculoPrecioPorMetro2(apartamento3);
		System.out.println("\n-------------------------------------------------- " );
		System.out.println("\nPrecio m2: " + precioMetro2);
		
		// Test diferencia de precio
		int diferenciaPrecio = apartamento1.priceDifference(apartamento3);
		System.out.println("\n-------------------------------------------------- " );
		System.out.println("\nApartamento1, metros2: " + apartamento1.getSquareMeters() + ", precio m2:" + apartamento1.getPricePerSquareMeter());
		System.out.println("Precio metros2: " + apartamento1.calculoPrecioPorMetro2(apartamento1));

		System.out.println("\nApartamento3, metros2: " + apartamento3.getSquareMeters() + ", precio m2:" + apartamento3.getPricePerSquareMeter());
		System.out.println("Precio metros2: " + apartamento3.calculoPrecioPorMetro2(apartamento3));
		
		System.out.println("\nDiferencia precio: " + diferenciaPrecio);
		
		
		// Test moreExpensiveThan, precio por m2 mas elevado
		boolean resultado = apartamento1.moreExpensiveThan(apartamento3);
		System.out.println("\n-------------------------------------------------- " );
		if (resultado)
		{
			System.out.println("\nApartamento 1, m2: " + apartamento1.getPricePerSquareMeter() + 
				" , mas caro que \nApartamento 3, m2: " + apartamento3.getPricePerSquareMeter());
		}
		else
		{
			System.out.println("\nApartamento 3, m2: " + apartamento3.getPricePerSquareMeter() + 
				" , mas caro que \nApartamento 1, m2: " + apartamento1.getPricePerSquareMeter());
		}	
				
	}
}


