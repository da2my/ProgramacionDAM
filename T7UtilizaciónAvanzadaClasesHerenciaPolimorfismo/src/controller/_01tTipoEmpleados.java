package controller;

import model._01Programador;
import model._01_07Empleado;
import model._02Comercial;

public class _01tTipoEmpleados {

	private _01_07Empleado empleados[];

	public _01tTipoEmpleados() {
		listaEmpleados();
	}

	public _01_07Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(_01_07Empleado[] empleados) {
		this.empleados = empleados;
	}

	public void listaEmpleados() {
		empleados = new _01_07Empleado[7];

		empleados[0] = new _01Programador("David", "616987821",
				new String[] { "Clojure", "C#", "Java", "Python", "C" });
		empleados[1] = new _01_07Empleado("Clara", "648209108");
		empleados[2] = new _01Programador("Alba", "648209108", new String[] { "C++", "Rubi", "Pascal", "Java" });
		empleados[3] = new _01Programador("Leo", "648203988", new String[] { "C++", "Rubi", "Pascal", "Java" });
		empleados[4] = new _01_07Empleado("Pablo", "619992879");
		empleados[5] = new _01_07Empleado("Luis", "678219036");
		empleados[6] = new _02Comercial("Dilan", "123456897", "Shangai");
	}

	public void muestraListaCompleta() {
		for (_01_07Empleado i : empleados) {
			System.out.println(i);
		}
	}

	public void muestraListaProgramadores() {
		for (_01_07Empleado i : empleados) {
			if (i instanceof _01Programador) {
				System.out.println(i);
			}
		}
	}
}