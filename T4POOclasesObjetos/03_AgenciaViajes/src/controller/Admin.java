package controller;

import model.Viaje;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viaje v1 = new Viaje("Moscú", "Madrid", "rumad4");
		Viaje v2 = new Viaje("Nueva York", "Londres", "nylcy12");

		System.out.println(v1.toString());
		System.out.println(v2.toString());

		v1.reserva(4, 2);
		v2.reserva(5, 3);
		System.out.println();

		System.out.println(v1.modificacion(8, 5));
		System.out.println();

		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println();

		System.out.println("Recaudación total de los viajes: "+(v1.getPrice() + v2.getPrice()));
		System.out.println();
		
	}

}
