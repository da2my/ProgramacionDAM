package controller;

import model.Carro;

public class Admin {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("David", "C/Lugo", "59283109Y");
		System.out.println(c1.toString());
		
		new Tienda(c1).mostrarProductos();
		new Tienda(c1).mostrarPrecio();
		
		
	}
}
