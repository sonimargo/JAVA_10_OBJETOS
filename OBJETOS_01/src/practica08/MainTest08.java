package practica08;

public class MainTest08 
{

		public static void main(String[] args) {
			LyraCard tarjeta1 = new LyraCard(324.59);
			LyraCard tarjeta2 = new LyraCard(324.59);
			CashRegister registroTarjeta = new CashRegister();

			
			  // Saldo en tarjeta
			  System.out.println("\n***********************************************");
			  System.out.println("Test saldo en tarjeta *************************");
			  System.out.println("***********************************************");
			  boolean haySaldo = tarjeta1.saldoEnCard(500);
			  mensajeSaldoEnTarjeta("Tarjeta 1", haySaldo);
			  
			  boolean haySaldo2 = tarjeta2.saldoEnCard(100);
			  mensajeSaldoEnTarjeta("\nTarjeta 2", haySaldo2);
			  System.out.println("\nFin Test saldo en tarjeta *********************");
			  
			  // test añadir dinero
			  System.out.println("\n***********************************************");
			  System.out.println("Test añadir dinero a tarjeta ******************");
			  System.out.println("***********************************************");
			  System.out.println("Saldo tarjeta 1 es " + tarjeta1.getSaldo());
			  tarjeta1.anadirDinero(350); mensajeAnadirDinero("\nTarjeta 1",
			  tarjeta1.getSaldo());
			  
			  System.out.println("Saldo tarjeta 2 es " + tarjeta2.getSaldo());
			  tarjeta2.anadirDinero(300); mensajeAnadirDinero("\nTarjeta 2",
			  tarjeta2.getSaldo());
			  System.out.println("\nFin Test añadir dinero a tarjeta **************");
			  
			  // Test pago almuerzo barato. Precio 2.5
			  System.out.println("\n***********************************************");
			  System.out.println("Test MENUS, pago menu economico ***************");
			  System.out.println("***********************************************");
			  
			  
			  System.out.println("Informacion antes llamar a metodo ");
			  mensajePagoAlmuerzos(registroTarjeta);
			  
			  double importeEntregado = 2.5; // Importe igual al precio almuerzo barato
			  double precio = 0; for (int i = 0; i < 100 ; i++) { precio =
			  registroTarjeta.payEconomical(importeEntregado); }
			  System.out.println("Importe entregado igual al precio almuerzo barato");
			  mensajePagoAlmuerzos(registroTarjeta);
			  
			  
			  
			  importeEntregado = 5; // Importe superior al precio almuerzo barato for (int
			  for (int i = 0; i < 100 ; i++) 
			  { 
				  precio = registroTarjeta.payEconomical(importeEntregado); 
			  }
			  System.out.println("Importe entregado superior al precio almuerzo barato");
			  mensajePagoAlmuerzos(registroTarjeta);
			  
			  
			  
			  importeEntregado = 2; // Importe menor al precio almuerzo barato precio =
			  registroTarjeta.payEconomical(importeEntregado); if (precio ==
			  importeEntregado)
			  System.out.println("Importe entregado inferior al precio almuerzo barato");
			  else mensajePagoAlmuerzos(registroTarjeta);
			  
			  System.out.println("\nFin Test pago almuerzo barato *******************");
			  
			  
			  
			  
			  // Test pago almuerzo caro. Precio 4
			  System.out.println("\n***********************************************");
			  System.out.println("Test MENUS, pago menu caro      ***************");
			  System.out.println("***********************************************");
			  
			  importeEntregado = 5; precio = 0;
			  
			  mensajePagoAlmuerzos(registroTarjeta);
			  
			  for (int i = 0; i < 300 ; i++) { precio =
			  registroTarjeta.payGourmet(importeEntregado); }
			  mensajePagoAlmuerzos(registroTarjeta);
			  
			  System.out.println("\nFin Test pago almuerzo caro *******************");
			 

			TestPagoAlmuerzoPagoConTarjeta(tarjeta1, tarjeta2, registroTarjeta);

		}

		public static void TestPagoAlmuerzoPagoConTarjeta(LyraCard tarjetaBanc1, LyraCard tarjetaBanc2,
				CashRegister registrosTarjeta) 
		{
			System.out.println("\n***********************************************");
			System.out.println("Test almuerzo barato pago con tarjeta   *******");
			System.out.println("***********************************************");
			
			// tarjeta conn saldo
			double importeEntregado = 5;
			double precio = 0;
			boolean importeSuficiente = registrosTarjeta.payEconomical(tarjetaBanc1);
			if (importeSuficiente)
				System.out.println("Pago con tarjeta saldo suficiente ");
			else
				System.out.println("Pago con tarjeta, saldo insuficiente ");

			mensajePagoAlmuerzos(registrosTarjeta);

			// tarjeta sin saldo
			tarjetaBanc1.setSaldo(2);
			importeSuficiente = registrosTarjeta.payEconomical(tarjetaBanc1);
			if (importeSuficiente)
				System.out.println("Pago con tarjeta saldo suficiente ");
			else
				System.out.println("Pago con tarjeta, saldo insuficiente ");

			mensajePagoAlmuerzos(registrosTarjeta);
			
		}

		public static void mensajeSaldoEnTarjeta(String tarjeta, boolean haySaldo) {
			if (haySaldo)
				System.out.println(tarjeta + ": Hay saldo en tarjeta ");
			else
				System.out.println(tarjeta + ": NO Hay saldo en tarjeta ");

		}

		public static void mensajeAnadirDinero(String tarjeta, double saldo) {
			System.out.println(tarjeta + ": saldo => " + saldo);
		}

		public static void mensajePagoAlmuerzos(CashRegister registroTarjeta) {
			System.out.println("Importe en tarjeta: " + registroTarjeta.getCashInRegister());
			System.out.println("  Menus economicos: " + registroTarjeta.getEconomicalSold());
			System.out.println("  Menus caros: " + registroTarjeta.getGourmetSold());
		}

	}
	
	