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
		this.nombre=nombre;
		this.telefono=telefono;
		numEmpleados++;
	}
	
	public Empleado(Empleado e) {//Constructor de copia
		this.nombre=e.nombre;
		this.telefono=e.telefono;
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

	
//	toString()
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

//	equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}
	
//	Metodos
	public static void numPantilla() {
		System.out.println("Numero de objetos instanciados: "+ numEmpleados++);
	}
	
	
}
