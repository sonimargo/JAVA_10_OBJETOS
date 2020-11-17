package practica08;

public class CashRegister 
{

	private double cashInRegister;		// cantidad de dinero en la tarjeta para comidas - the amount of cash in the register
    private int economicalSold;   		// cantidad de dinero gastado en comidas baratas - the amount of economical lunches sold
    private int gourmetSold;       		// cantidad de dinero gastado en comidas caras - the amount of gourmet lunches sold
    
    private double precioAlmuerzoEconomico = 2.50;
    private double precioAlmuerzoCaro = 4;
    
	public CashRegister() 
	{
        // at start the register has 1000 euros
		this.cashInRegister  = 1000;
		this.economicalSold = 0;
		this.gourmetSold = 0;
	}
	
	// Si se paga con el precio del almuerzo o mas:
	//  - El precio del almuerzo barato se agrega al registro
	//  - La cantidad e almuerzos baratos vendidos de suma uno
	//  - el método devuelve cashGiven - precio del almuerzo
	// Si no se da suficiente dinero, se devuelve todo y no pasa nada más
	 public double payEconomical(double cashGiven) 
	 {
		 if (cashGiven >= precioAlmuerzoEconomico && this.cashInRegister >= cashGiven)
		 {	 
			 this.cashInRegister = this.cashInRegister - precioAlmuerzoEconomico;
			 this.economicalSold = this.economicalSold  + 1;			 
		 }
		 return cashGiven;
	 }

	// Si se paga con el precio del almuerzo, agregar el importe (precio caro) a la cantidad de almuerzos caros vendidos
	// Si no se paga con el suficiente dinero, se devuelve todo cashGiven y no pasa nada más
	 public double payGourmet(double cashGiven) 
	 {
		 if (cashGiven > precioAlmuerzoCaro && this.cashInRegister >= cashGiven)
		 {
			 this.gourmetSold = this.gourmetSold + 1;
			 this.cashInRegister = this.cashInRegister - precioAlmuerzoCaro;
		 }
		 return cashGiven;
	 }
	 
	 
	 // si el saldo de la tarjeta es al menos el precio del almuerzo:
	 //     - la cantidad de almuerzos vendidos se incrementa en uno
	 //     - el método devuelve verdadero
	 // si no, el método devuelve falso
	 public boolean payEconomical(LyraCard card) 
	 {
		 System.out.println("**** Saldo en la tarjeta  *********************"+card.getSaldo());
		 if (card.getSaldo() >= precioAlmuerzoEconomico)
		 {
			 this.economicalSold = this.economicalSold  + 1;
			 return true;			 
		 }
		 else
			 return false;
		 
	 }
	 
	 public boolean payGourmet(LyraCard card) 
	 {
		 if (card.getSaldo() >= precioAlmuerzoEconomico)
		 {
			 this.gourmetSold = this.gourmetSold  + 1;
			 return true;			 
		 }
		 else
			 return false;
	 }
	 


	 
	 
	 ////// GETTERS & SETTERS
	 
	public double getCashInRegister() {
		return cashInRegister;
	}

	public void setCashInRegister(double cashInRegister) {
		this.cashInRegister = cashInRegister;
	}

	public int getEconomicalSold() {
		return economicalSold;
	}

	public void setEconomicalSold(int economicalSold) {
		this.economicalSold = economicalSold;
	}

	public int getGourmetSold() {
		return gourmetSold;
	}

	public void setGourmetSold(int gourmetSold) {
		this.gourmetSold = gourmetSold;
	}

	public double getPrecioAlmuerzoEconomico() {
		return precioAlmuerzoEconomico;
	}

	public void setPrecioAlmuerzoEconomico(double precioAlmuerzoEconomico) {
		this.precioAlmuerzoEconomico = precioAlmuerzoEconomico;
	}
}


