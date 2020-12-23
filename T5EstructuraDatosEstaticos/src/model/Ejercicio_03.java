package model;

public class Ejercicio_03 {

	public void arrayMinMax() {
		int[] array = new int[10];
		int max = 0;
		int min;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			sum += array[i];
		}
		for (int i : array) {
			System.out.println(i);
		}
		min = sum;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("El menor es: " + min + "\n" + "El mayor es: " + max);
	}
}
