package practica06;

public class MainTest06 
{

	public static void main(String[] args) 
	{
		Cuenta cuentaOrigen = new Cuenta("Lucas", "Magda" , 5621.97);
		Cuenta cuentaDestino = new Cuenta("Sara", "Jordi", 7311.22);
		Cuenta cuentaBanco = new Cuenta("Banco", "Banco", 156325.61);
		
		System.out.println("Transferencia");
		System.out.println("Cuenta Origen inicial \n" + cuentaOrigen + "\n");
		System.out.println("Cuenta Destino inicial \n" + cuentaDestino + "\n");
		transferencia(cuentaOrigen,cuentaDestino, 211.12);
		System.out.println("Cantidad a incresar en cuenta Destino: 211,12***********");
		System.out.println("Cuenta Origen con transferencia \n" + cuentaOrigen + "\n");
		System.out.println("Cuenta Destino con transferencia \n" + cuentaDestino + "\n");
		System.out.println("------------------------- \n");
		
		System.out.println("Credito personal");
		System.out.println("Cuenta Origen incial \n" + cuentaOrigen + "\n");
		System.out.println("Cuenta Banco incial \n" + cuentaBanco + "\n");
		personalCredit(cuentaOrigen,cuentaBanco, 1500);
		System.out.println("Cantida a incresar en cuenta Origen: 1500 ***********");
		System.out.println("Cuenta Origen con credito \n" + cuentaOrigen + "\n");
		System.out.println("Cuenta Banco con credito \n" + cuentaBanco + "\n");
		System.out.println("------------------------- \n");
		
		System.out.println("Cambio numero tarjeta");
		System.out.println("Cuenta Origen sin tarjeta \n" + cuentaOrigen + "\n");		
		cambioNumeroTarjetaCredito(cuentaOrigen, "4587215436529874");
		System.out.println("Cuenta Origen con tarjeta \n" + cuentaOrigen + "\n");
		System.out.println("------------------------- \n");
		
		System.out.println("Cambio titular");
		System.out.println("Titular 1 " + cuentaOrigen.getTitular1() );		
		System.out.println("Titular 2 " + cuentaOrigen.getTitular2() + "\n -------------");
		cambioTitular (cuentaOrigen);		
		System.out.println("Titular 1 " + cuentaOrigen.getTitular1() );		
		System.out.println("Titular 2 " + cuentaOrigen.getTitular2());
		System.out.println("------------------------- \n");		
	}
	
	public static void transferencia (Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) 
	{
		if (cuentasBalancePositivo(cuentaOrigen, cuentaDestino) && cuentaOrigen.getBalance() > cantidad) 
		cuentaOrigen.retirada(cantidad);
		cuentaDestino.deposito(cantidad);		
	}
	
	public static void personalCredit (Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) 
	{	
		if (cuentasBalancePositivo(cuentaOrigen, cuentaDestino) && cuentaDestino.getBalance() > cantidad)
		{
			cuentaOrigen.deposito(cantidad);
			cuentaDestino.retirada(cantidad);
		}
	}
	
	public static boolean cuentasBalancePositivo (Cuenta cuentaOrigen, Cuenta cuentaDestino)
	{
		if (cuentaOrigen.balancePositivo() && cuentaDestino.balancePositivo())
			return true;
		else
			return false;
	}
	
	public static void cambioNumeroTarjetaCredito (Cuenta cuenta, String numeroTarjeta)
	{
		cuenta.setNumeroTarjetaCredito(numeroTarjeta);
	}
	
	public static void cambioTitular(Cuenta cuenta)
	{
		String titular = cuenta.getTitular1();
		cuenta.setTitular1(cuenta.getTitular2());
		cuenta.setTitular2(titular);
	}

}
