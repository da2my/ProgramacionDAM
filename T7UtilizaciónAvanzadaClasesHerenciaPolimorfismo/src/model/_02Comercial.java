package model;

import java.util.Arrays;

public class _02Comercial extends _01_07Empleado {

	private float totalVentas;
	private String ciudad;
	private String productosVendidos;

	public _02Comercial() {

	}

	public _02Comercial(String nombre, String telefono, String ciudad) {
		super(nombre, telefono);
		this.ciudad = ciudad;
		this.totalVentas = 0;
		this.productosVendidos = "";

	}

	public String getCiudad() {
		return ciudad;
	}

	public void sumarVenta(float importe) {
		totalVentas += importe;
	}

	public float getTotalVentas() {

		return totalVentas;
	}

	public void venderProducto(String producto) {
		// produtosVendidos es un String que va aumentando en su cadena a cada uso del
		// metodo venderProducto(String producto) a traves de su parametro
		productosVendidos = String.join(", ", productosVendidos, producto);
	}

	public String[] getProductosVendidos() {
		// se dividen en varias cadenas mediante una expresion regular, que en este caso
		// es ","
		String[] listaProductos = productosVendidos.split(", ");
		return listaProductos;
	}

	@Override
	public String toString() {
		return String.join("", "Comercial: ", super.toString(), "\n", "totalVentas= ", Float.toString(getTotalVentas()), " ciudad= ", ciudad,
				"\n", "productosVendidos= ", Arrays.toString(getProductosVendidos()));
	}

}
