package model;

public class Ejercicio_04 {
	public void arrayInverso() {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.println(array[i]);
		}
		System.out.println();
		int aux = array.length;
		for (int i = 0; i < array.length; i++) {
			aux--;
			System.out.println(array[aux]);
		}
	}
}
