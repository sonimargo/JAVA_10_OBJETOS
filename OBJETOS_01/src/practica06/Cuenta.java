package practica06;

public class Cuenta 
{
	    private double balance;
	    private String titular1;
	    private String titular2;
	    private String numeroTarjetaCredito;
	 
	 	public Cuenta (String titular1, double balance, String numeroTarjetaCredito) 
		{
	        this.balance = balance;
	        this.titular1 = titular1;
	        this.numeroTarjetaCredito = numeroTarjetaCredito;
		}

	 	public Cuenta (String titular1, String titular2, double balance) 
		{
	        this.balance = balance;
	        this.titular1 = titular1;
	        this.titular2 = titular2;
	        this.numeroTarjetaCredito = "";
		}
	 	
	    public void deposito(double cantidad) 
	    {
	        this.balance += cantidad;
	    }
	 
	    public void retirada(double cantidad) 
	    {
	        this.balance -= cantidad;
	    }
	 	
	    public boolean balancePositivo()
	    {
	    	if (this.balance > 0)
	    		return true;
	    	else
	    		return false;
	    }
	 	
	    public boolean esMoroso()
	    {
	    	if (this.balance < 0)
	    		return true;
	    	else
	    		return false;
	    }
	    
	    
	 	//////////////////////////////////////////////////////
	 	//  GETTERS & SETTERS & TOSTRING
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getTitular1() {
			return titular1;
		}

		public void setTitular1(String titular1) {
			this.titular1 = titular1;
		}

		public String getTitular2() {
			return titular2;
		}

		public void setTitular2(String titular2) {
			this.titular2 = titular2;
		}

		public String getNumeroTarjetaCredito() {
			return numeroTarjetaCredito;
		}

		public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
			this.numeroTarjetaCredito = numeroTarjetaCredito;
		}

		@Override
		public String toString() 
		{
			return "Cuenta [balance=" + balance + ", titular1=" + titular1 + ", titular2=" + titular2
					+ ", numeroTarjetaCredito=" + numeroTarjetaCredito + "]";
		}

}