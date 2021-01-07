package cotroller;

import model.ContParametros;

public class Admin {
//	Lo que esta comentado lo hice a mi manera sin ver los apuntes, use un array
	public static void main(String[] args) {
//		String[] lista = { "Davo", "Juan", "Karim", "Laila", "Alma" };
//		ContParametros.numParametros(lista);

//		ContParametros.numParametros("El número de parámetros es: ", "Davo", "Juan", "Karim", "Laila", "Alma");
	
		System.out.println("La suma de los numeros introducidos asciende a: "+ContParametros.sumParametros(2.8,3,6,1));
		
		System.out.println("La suma de los numeros introducidos asciende a: "+ContParametros.sumParametros(7,5));
	}

}
