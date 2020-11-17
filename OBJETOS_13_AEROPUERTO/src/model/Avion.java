package model;

public class Avion 
{

	public String avion;
	public Integer capacidad;
	
	
	public Avion() 
	{
		// TODO Auto-generated constructor stub
	}

	public Avion(String avion, Integer capacidad) 
	{
		this.avion = avion;
		this.capacidad = capacidad;
	}

	public String getAvion() {
		return avion;
	}

	public void setAvion(String avion) {
		this.avion = avion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Avion [avion=" + avion + ", capacidad=" + capacidad + "]";
	}	
}

