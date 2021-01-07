package controller;

import model.Empleado;

public class Admin {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("David", "1635454");
		Empleado e2 = new Empleado("Laila", "71627462");
		Empleado e3 = new Empleado("Lorena", "817364");
		Empleado e4 = new Empleado(e2);
//		Muestra la info de los objetos
		System.out.println("Objeto empleado 1: " + e1);
		System.out.println("Objeto empleado 2: " + e2);
		System.out.println("Objeto empleado 3: " + e3);
		
//		Copia un objeto en otro
		System.out.println("Objeto empleado 4, con copia del ojeto empleado 2: " + e4);
		
//		Cuenta los objetos creados
		Empleado.numPantilla();
		
//		toString()
		System.out.println(e4.toString());
		
//		equals()
		System.out.println(e2.equals(e4));
		
		
	}

}