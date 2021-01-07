package controller;

import model.Carro;
import model.Producto;

public class Tienda {

	private final int TOTAL_PRODUCTOS=5;
	
	protected Producto[] misProductos;
	
	public Tienda (Carro carro) {
		misProductos = new Producto[TOTAL_PRODUCTOS];
		carroCompra();
	}

	private void carroCompra() {
		misProductos[0] = new Producto("jabon", 1.50, "BASICO");
		misProductos[1] = new Producto("cecina", 7.90, "LUJO");
		misProductos[2] = new Producto("aceite", 3.21, "ORDINARIO");
		misProductos[3] = new Producto("aguacate", 5.30, "LUJO");
		misProductos[4] = new Producto("leche", 2, "BASICO");
		
	}

	public void mostrarProductos() {
		
		for(int i = 0; i < misProductos.length; i++) {
			System.out.println(misProductos[i]);
		}	
	}
	
	
	public void mostrarPrecio() {
		double totalProductos=0;
		for(int i = 0; i < misProductos.length; i++) {
			if(misProductos[i] instanceof Producto) {
				totalProductos += misProductos[i].precioConIVA();
			}
		}
		System.out.println(String.join(" ", "Total de la compra IVA incluido: ", Double.toString(totalProductos), "€"));
	}
	
	
}
