package model;

import java.util.Scanner;

public class Ejercicio_02 {
	public void multExceptions() {
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		
		try {
			while (cont < NUM) {
				System.out.println("Introduce una posición del array:");
				posicion = Integer.parseInt(teclado.nextLine());
				System.out.println("Introduce un divisor:");
				divisor = Integer.parseInt(teclado.nextLine());
				enteros[posicion] = 100 / divisor;// rellena el array

				cont++;
			}
			System.out.println("El contenido del array de enteros es:");// Contenido del array
			for (int valor : enteros) {
				System.out.println(valor);
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Array fuera de limite");
//			exc.printStackTrace();
		} catch (NumberFormatException exc) {
			System.out.println("Error de tipo de dato");
		} catch (ArithmeticException exc) {
			System.out.println("Error al dividir entre 0");
		}

	}
}
