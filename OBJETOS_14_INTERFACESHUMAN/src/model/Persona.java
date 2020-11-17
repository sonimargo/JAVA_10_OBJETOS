package model;

import java.time.LocalDate;

import interfaces.iAction;
import interfaces.iHumanAction;
import interfaces.iUniversalAction;

public class Persona implements iHumanAction , iAction, iUniversalAction
{	
	public String nombre;
	public String direccion;
	public LocalDate fechaNacimiento;
	public int edad;


	public Persona() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Persona (String nombre, String direccion, LocalDate fechaNacimiento, int edad)
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
	}

	@Override
	public void talk() 
	{
		 		
	}

	@Override
	public void createPrograms() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void study() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playViolin() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona "
				+ "\n[nombre=" + nombre + ", direccion=" + direccion + ""
				+ "\n  fechaNacimiento=" + fechaNacimiento + ", edad=" + edad  + "]";
	}

}


