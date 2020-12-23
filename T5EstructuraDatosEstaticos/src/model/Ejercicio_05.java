package model;

public class Ejercicio_05 {
	
	public void vectorPosImpar() {
		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < array.length; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(array[i]);
			}
		}
	}
}
