package model;

import java.util.*;

public class ContParametros {

//	Lo que esta comentado lo hice a mi manera sin ver los apuntes, use un array

//	private static String[] lista;
//	private static int numParametros;

	public static void numParametros(String msg, String... v) {
		System.out.println(msg + v.length);
		for (int i = 0; i < v.length; i++) {
			System.out.println(" Posición " + i + ": " + v[i]);
		}
	}

	public static double sumParametros(double... v) {
		double aux = 0;
		for (double i : v) {
			aux+=i;
		}
		return aux;
	}
	
	public static double sumParametros(int intro, int in, double... v) {
		double aux = 0;
		for (double i : v) {
			aux+=i;
		}
		return aux+intro+in;
	}
	
//	public ContParametros(String[] lista) {
//		this.lista = lista;
//	}
//
//	public String[] getLista() {
//		return lista;
//	}
//
//	public void setLista(String[] lista) {
//		this.lista = lista;
//	}

//	@Override
//	public String toString() {
//		return "ContParametros [lista=" + Arrays.toString(lista) + "]";
//	}

//	public static void numParametros(String[] list) {
//		int num = 0;
//		for (String string : list) {
//			System.out.print("Posición " + numParametros++ + ": ");
//			System.out.println(string);
//			num = numParametros;
//		}
//		System.out.println();
//		System.out.println("El número de parámetros es: " + num);
//	}
}
