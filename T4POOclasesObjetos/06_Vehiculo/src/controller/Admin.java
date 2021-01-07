package controller;

import model.Vehiculo;

public class Admin {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo(4, 180, 224);
		Vehiculo v2 = new Vehiculo(4, 200, 134);
		Vehiculo v3 = new Vehiculo ();
		
//		System.out.println(v1.equals(v2));//Metodo equals() generado con Source
//		System.out.println(Vehiculo.esIgual(v1, v2));//Metodo esIgual() generado por mi
		
		v3.copia(v2);
		System.out.println("Esta es una copia de v2: "+v3);

	}

}