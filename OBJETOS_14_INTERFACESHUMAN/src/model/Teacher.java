package model;

import java.time.LocalDate;

public class Teacher extends Persona 
{

	public String grau;
	
	public Teacher (String nombre, String direccion, LocalDate fechaNacimiento, int edad, String grau)
	{
		super(nombre, direccion, fechaNacimiento, edad);
		this.grau = grau;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	@Override
	public String toString() {
		return "Teacher "
				+ "     [grau=" + grau + "]";
	}	
}


