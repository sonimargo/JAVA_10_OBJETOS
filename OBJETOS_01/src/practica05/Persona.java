package practica05;

public class Persona 
{

		private String nombre;
		private String apellidos;
		private MyDate fechaNacimiento;
		private int edad;
		private int altura; 
		private int peso;
		
		/////////////            Construcctores         ///////////////////////////////
		public Persona(String nombre, String apellidos ) 
		{
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

		public Persona(String nombre, String apellidos, int edad, int altura, int peso ) 
		{
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
			this.altura = altura;
			this.peso = peso;
		}
		
		public Persona(String nombre, String apellidos, int edad, MyDate fechaNacimiento ) 
		{
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.edad = edad;
			//this.edad = calculaEdad(fechaNacimiento);
		}

		//////////////////////        METODOS  //////////////////
		public String printPersona()
		{
			return  "Nombre: " + this.nombre + "\n Apellidos: " + this.apellidos;
		}

		public String printPersona(Persona persona)
		{
			return  "Print persona: \n   Nombre: " + persona.nombre + "\n   Edad: " + persona.edad;
		}
		
		public void sumarAnyos()
		{
			this.edad = this.edad + 1;
		}
		
		public void sumarAnyos(int anyosAsumar)
		{
			this.edad = this.edad + anyosAsumar;
		}
		
		public boolean isAdulto()
		{
		//	int edat = this.fechaNacimiento;
			if (this.edad >= 18)
				return true;
			else
				return false;
		}
		
		public double indiceMasaCorporal()
		{
			// Para calculo masa corporal la altura en metros
			return ((double)this.peso / (double)Math.pow(((double)this.altura/100), 2));
		}
		
		public int calculaEdad(MyDate fechaACalcular)
		{
			System.out.println("************** año " + this.fechaNacimiento.getYear() + "  -  año  " + fechaACalcular.getYear());
			System.out.println("************** mes " + this.fechaNacimiento.getMonth()  + "  -  mes  " + fechaACalcular.getMonth());
			System.out.println("************** dia " + this.fechaNacimiento.getDay()  + "  -  dia  " + fechaACalcular.getDay());

			
			if (fechaACalcular.getYear() > this.fechaNacimiento.getYear())
			{
				System.out.println("************** año parametro  mayor ");	
				if (fechaACalcular.getMonth() >= this.fechaNacimiento.getMonth())
				{
					System.out.println("************** mes parametro  mayor o = ");
					if (fechaACalcular.getDay() >= this.fechaNacimiento.getDay())
					{
						System.out.println("************** dia parametro  mayor o = ");
						return fechaACalcular.getYear() - this.fechaNacimiento.getYear();
					}
					else
					{
						System.out.println("************** dia parametro  menor ");
						return (fechaACalcular.getYear() - this.fechaNacimiento.getYear()) - 1;
					}
				}
				else
				{ 
					System.out.println("************** mes parametro  menor ");
					return (fechaACalcular.getYear() - this.fechaNacimiento.getYear()) - 1;
				}
			}
			else		
			{
				System.out.println("************** año parametro  menor ");
				return (fechaACalcular.getYear() - this.fechaNacimiento.getYear()) - 1;
			}
		}
		
		
		
		public String printEdad() 
		{
			return "Nombre=" + nombre + "\n" +
				   "   Fecha Nacimiento=" + fechaNacimiento + "\n" +
				   "   Edad = " + edad + "\n";
		}
		
		
		//////////////////     Getters and Setters    ////////////////////////////
		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}
		
	 	public String getNombre() 
		{
			return nombre;
		}

		public void setNombre(String nombre) 
		{
			this.nombre = nombre;
		}

		public String getApellidos() 
		{
			return apellidos;
		}

		public void setApellidos(String apellidos) 
		{
			this.apellidos = apellidos;
		}

		public MyDate getFechaNacimiento() 
		{
			return fechaNacimiento;
		}

		public void setFechaNacimiento(MyDate fechaNacimiento) 
		{
			this.fechaNacimiento = fechaNacimiento;
		}
		
		//////////////////////// TO STRING   ////////////////////////////////////
		@Override
		public String toString() 
		{
			return "Nombre=" + nombre + "\n" +
				   "   Apellidos=" + apellidos + "\n" +
				   "   Fecha Nacimiento=" + fechaNacimiento + "\n" + 
				   "   Edad = " + edad + "\n" +
				   "   Peso = " + peso + "\n" +
				   "   Altura =" + altura;
		}

}