package controller;

import model.BilletesAvion;
import model.types.Clase;
import view.Consola;

public class Admin {

	public static void main(String[] args) {
		Consola con = new Consola();
		BilletesAvion b1 = new BilletesAvion("David", "59238023k", Clase.TURISTA, 3, true, false, 0);
		BilletesAvion b4 = new BilletesAvion("Pedro", "59348023p", Clase.VIP, 10, false, false, 0);
		BilletesAvion b5 = new BilletesAvion("Ana", "98328023y", Clase.BUSINESS, 4, false, false, 0);
		BilletesAvion b2 = new BilletesAvion("Amaru", "28475012l");
		BilletesAvion b3 = new BilletesAvion(Clase.BUSINESS);

		// PRUEBA CON LAS CONDICIONES DE TURISTA
		b1.precio(b1.costeComplemento(b1), b1.costeMaleta(b1));// ir haciendo los metodos necesarios para seguir sumando
																// el total a "coste"
		con.writeString(b1.toString());

		// PRUEBA CON LAS CONDICIONES DE VIP
		b4.precio(b4.costeComplemento(b4), b4.costeMaleta(b4));
		con.writeString(b4.toString());

		// PRUEBA CON LAS CONDICIONES DE BUSINNES
		b5.precio(b5.costeComplemento(b5), b5.costeMaleta(b5));
		con.writeString(b5.toString());

		BilletesAvion.reservaIni(b1);
		// con.writeInt(b1.numMaletas(3)); //cambiado por requerimientos del ej.12

		b2.reservaInicial(b2);
		b3.reservaInicial1(b3);

	}
}
