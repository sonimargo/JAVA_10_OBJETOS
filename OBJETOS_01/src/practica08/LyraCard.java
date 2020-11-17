package practica08;

public class LyraCard 
{

	private double saldo;
	
	public LyraCard(double balance) 
	{
		this.saldo = balance;
	}

	public void anadirDinero(double amount) 
	{
		this.saldo += amount;
	}

	//Verifica si el saldo de la tarjeta es al menos el monto dado como parámetro
	//si no, devuelve falso, lo que significa que la tarjeta no podría usarse para el pago si el saldo es suficiente, 
	//el monto dado se toma del saldo y verdadero es devuelto
	public boolean saldoEnCard(double amount)
	{
		if (this.getSaldo() <= amount)
			return false;
		else 
			return true;
	}

	 // Cargar dinero en la tarjeta
	 public void loadMoneyToCard(LyraCard card, double sum) 
	 {
		  card.saldo = card.saldo + sum;
	 }
	 
		 
	//////////////// GETTERS & SETTERS
	public double getSaldo() 
	{
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
