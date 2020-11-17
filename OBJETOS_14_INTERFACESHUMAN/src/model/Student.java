package model;

import java.time.LocalDate;

public class Student extends Persona
{
	public String curs;
	
	public Student(String nombre, String direccion, LocalDate fechaNacimiento, int edad, String curs)
	{
		super(nombre, direccion, fechaNacimiento, edad);
		this.curs = curs;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	@Override
	public String toString() {
		return "Student "
				+ "   [curs=" + curs + "]";
	}
}

