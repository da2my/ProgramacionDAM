package model;

public class Calcula {

	public static int mayor(int... num) {
		int aux = 0;
		for (int i : num) {
			if (aux < i) {
				aux = i;
			}
		}
		return aux;

	}

	public static float mayor(float... num) {
		float aux = 0;
		for (float i : num) {
			if (aux < i) {
				aux = i;
			}
		}
		return aux;

	}

	public static String mayor(String... cadena) {// FIJATE EN LA CONVERSION DE TIPOS, MUY INTERESANTE!!
		String aux = "";
		for (String string : cadena) {
			if (aux.length() < string.length()) {
				aux = string;
			}
		}
		return Integer.toString(aux.length());

	}

	public static int menor(int... num) {
		int aux = 1000;
//		int aux1 = 0;
		for (int i : num) {
			if (aux > i) {
				aux = i;
			}
		}
		return aux;

	}

	public static float menor(float... num) {
		float aux = 1000;
		for (float i : num) {
			if (aux > i) {
				aux = i;
			}
		}
		return aux;
	}

	public static String menor(String... cadena) {
		String aux = Integer.toString(1000);
		for (String string : cadena) {
			if (aux.length() > string.length()) {

				aux = string;

			}
		}
		return Integer.toString(aux.length());
	}
}
