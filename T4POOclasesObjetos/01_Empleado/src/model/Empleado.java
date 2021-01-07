package model;

public class Empleado {
//	Atributos
	private String nombre;
	private int telefono;
	private static int numEmpleados;

//	Constructores
	public Empleado() {
		numEmpleados++;
	}

	public Empleado(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		numEmpleados++;
	}

	public Empleado(Empleado e) {//Constructor de copia, permite copiar un objeto en otro
		this.nombre = e.nombre;
		this.telefono = e.telefono;
		numEmpleados++;
	}

//	Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

//	Metodos
	public static int countNumEmpleados() {
		return numEmpleados;
	}

	@Override
	public String toString() {
		return String.join("\n", "Empleado [nombre=" + this.nombre + ", telefono=" + this.telefono + "]");
	}

}
