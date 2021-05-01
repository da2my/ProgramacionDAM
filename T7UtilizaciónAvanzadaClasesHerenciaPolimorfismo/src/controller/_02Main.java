package controller;

import model._02Comercial;

public class _02Main {

	public static void main(String[] args) {

		_02Comercial c1 = new _02Comercial("Dilan", "123456897", "Shangai");
		//Venta de productos
		c1.venderProducto("destornillador");
		c1.sumarVenta(23.4f);
		c1.venderProducto("tijeras");
		c1.sumarVenta(65.6f);
		//Mostrar info del vendedor
		System.out.println(c1.toString());
		//Ver procuctos vendidos
		for (String s : c1.getProductosVendidos()) {
			System.out.println(s);
		}
		//LISTA DE EMPLEADOS
		_01tTipoEmpleados employee = new _01tTipoEmpleados();
		employee.muestraListaCompleta();

	}
}