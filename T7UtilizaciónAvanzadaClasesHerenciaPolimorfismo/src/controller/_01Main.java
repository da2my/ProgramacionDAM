package controller;

import model.Empleado;
import model.Programador;

public class Main {

	public static void main(String[] args) {
		String[] language;
		Programador p1 = new Programador("David", "616987821", new String[] {"Clojure", "c#", "Java", "Python"} );
		Programador p2 = new Programador("Lorena", "620920921", new String[] {"C++", "Rubi", "Pascal", "Java"} );
		System.out.println(p1);
		System.out.println(p2);
	}
}
