package model;

import model.types.IVA;

public class Producto {

	protected String nombre;
	protected double precioBase;
	protected IVA tipoProducto;


	public Producto() {
	}

	public Producto(String nombre, double precioBase, String tipo) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		tipoProducto = tipoProducto(tipo);
	}
		

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public IVA getTipoIVA() {
		return tipoProducto;
	}

	public void setTipoIVA(IVA tipoIVA) {
		this.tipoProducto = tipoIVA;
	}

	public IVA tipoProducto(String tipo) {
		IVA iva = null;
		switch (tipo) {
		case "BASICO":
			iva = IVA.BASICO;
			break;
		case "ORDINARIO":
			iva = IVA.ORDINARIO;
			break;
		case "LUJO":
			iva = IVA.LUJO;
			break;
		default:
			System.out.println("");
			break;
		}
		return iva;
	}
	
	public double precioConIVA() {
		double precioIVA = (getPrecioBase() * tipoProducto.getTax()) + getPrecioBase();
		return precioIVA;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", tipoProducto=" + precioConIVA() + "]";
	}
	
}
