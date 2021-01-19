package controller;

import model._01_07Empleado;

public class _01_07Main {

	public static void main(String[] args) {
		
		_01_07Empleado e1 = new _01_07Empleado("David", "1635454");
		_01_07Empleado e2 = new _01_07Empleado("Laila", "71627462");
		_01_07Empleado e3 = new _01_07Empleado("Lorena", "817364");
		_01_07Empleado e4 = new _01_07Empleado(e2);
//		Muestra la info de los objetos
		System.out.println("Objeto empleado 1: " + e1);
		System.out.println("Objeto empleado 2: " + e2);
		System.out.println("Objeto empleado 3: " + e3);
		
//		Copia un objeto en otro
		System.out.println("Objeto empleado 4, con copia del ojeto empleado 2: " + e4);
		
//		Cuenta los objetos creados
		_01_07Empleado.numPantilla();
		
//		toString()
		System.out.println(e4.toString());
		
//		equals()
		System.out.println(e2.equals(e4));
		
		
	}

}