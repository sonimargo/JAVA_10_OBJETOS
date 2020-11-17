package practica07;

public class Apartamento 
{
	private int rooms; 
	private int squareMeters; 
	private int pricePerSquareMeter; 

	public Apartamento(int rooms, int squareMeters, int pricePerSquareMeter) 
	{
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	// Verdadero si el objeto Apartment para el que se llama al método (this) es más grande 
	// que el objeto apartment dado como parámetro (otherApartment).
	public boolean apartamentMasAmplio(Apartamento otherApartment) 
	{
		if (this.squareMeters > otherApartment.squareMeters)
			return true;
		else
			return false;
	}

	//Devuelve el valor absoluto de la diferencia de precio del objeto Apartment para el que se llama al método (this) 
	//el objeto apartment dado como parámetro (otherApartment). 
	//El precio de un apartamento es metros cuadrados * pricePerSquareMeter
	 public int priceDifference (Apartamento otherApartment) 
	 {
		 double precio1 = this.calculoPrecioPorMetro2(this);
		 double precio2 = otherApartment.calculoPrecioPorMetro2(otherApartment);
		 return (int)Math.abs(precio1-precio2) ;
	 }

	 public double calculoPrecioPorMetro2(Apartamento apartamentoParaCalcularPrecio)
	 {
		return (double)(apartamentoParaCalcularPrecio.squareMeters * apartamentoParaCalcularPrecio.pricePerSquareMeter); 
	 }
	
	 //Devuelve verdadero si el objeto Apartment para el que se llama el método (this) tiene un precio más alto que 
	 //el objeto apartment dado como parámetro (otherApartment).
	 public boolean moreExpensiveThan (Apartamento otherApartment)
	 {
		 if (this.pricePerSquareMeter > otherApartment.pricePerSquareMeter)
			 return true;
		 else
			 return false;
	 }
	 
	///// GETTERS & SETTERS
	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}

	public int getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}

	public void setPricePerSquareMeter(int pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}





	@Override
	public String toString() {
		return "Apartament [rooms=" + rooms + ", squareMeters=" + squareMeters + ", pricePerSquareMeter="
				+ pricePerSquareMeter + "]";
	}
}

