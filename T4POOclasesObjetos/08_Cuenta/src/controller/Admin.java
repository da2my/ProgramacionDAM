package controller;

import model.Cuenta;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1 = new Cuenta("Laila");
		Cuenta c2 = new Cuenta("Yassin", 5);
		Cuenta c3 = new Cuenta(c2);
		

//		Muestra la ejecucion del constructor de copia
		System.out.println(c3.toString());
//		Muestra el metodo ingresar()
		System.out.println(c1.ingresar(10));
		System.out.println(c1);

		System.out.println(c1.ingresar(-12));
		System.out.println(c1);
//		Muestra el metodo retirar()
		System.out.println(c2.toString());
//		Muestra el metodo equals()
		System.out.println(c3.equals(c2));
		System.out.println(c2.retirar(3));
		System.out.println(c2);

		System.out.println(c2.retirar(1));
		System.out.println(c2.retirar(1));
		System.out.println(c2);
//		Muestra el metodo equals()
		System.out.println(c3.equals(c2));

	}

}
