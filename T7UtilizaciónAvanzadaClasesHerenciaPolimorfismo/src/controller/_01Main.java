package controller;

import model._01_07Empleado;
import model._01Programador;

public class _01Main {

	public static void main(String[] args) {
		String[] language;
		_01Programador p1 = new _01Programador("David", "616987821", new String[] {"Clojure", "c#", "Java", "Python"} );
		_01Programador p2 = new _01Programador("Lorena", "620920921", new String[] {"C++", "Rubi", "Pascal", "Java"} );
		System.out.println(p1);
		System.out.println(p2);
	}
}
