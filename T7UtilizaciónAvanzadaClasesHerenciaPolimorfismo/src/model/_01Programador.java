package model;

import java.util.Arrays;

public class Programador extends Empleado{
	//Atributos
	private String [] lenguajes;
	
	//Constructor
	public Programador(String nombre, String telefono, String [] lenguajes) {
		super(nombre, telefono);
		this.lenguajes= lenguajes;
	}

	public String[] getLenguajes() {
		return lenguajes;
	}

	@Override
	public String toString() {
		return "Programador [lenguajes=" + Arrays.toString(lenguajes) + ", getNombre()=" + getNombre()
				+ ", getTelefono()=" + getTelefono() + "]";
	}
}
