package model;

public class Ejercicio_01 {
	public void arrayException() {
		int [] array = new int [5];
		int al=0;
		try {
			for (int i = 0; i <= array.length; i++) {
				al=(int)(Math.random()*100);
				System.out.println(array[i]=al);
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Limites de array sobrepasado");
		}
	}
}
