package controller;

import java.util.Scanner;

import model.Persona;

public class Admin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un nombre: ");
		String nombre = scan.next();
		System.out.println("Introduzca la edad: ");
		int edad = scan.nextInt();
		System.out.println("Introduzca el genero: ");
		String cadena = scan.next();
		char sexo = 0;
		sexo = cadena.charAt(0);
		System.out.println("Introduzca el peso: ");
		double peso = Double.parseDouble(scan.next());
		System.out.println("Introduzca la altura: ");
		double altura = Double.parseDouble(scan.next());

		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();

		System.out.println(p1.toString() + "\n" + "El indice de masa corporal es: " + p2.calcularIMC() + "\n"
				+ "Esta persona es mayor de edad? " + p2.esMayorDeEdad() + "\n");

		p2.setNombre("Lorenza");
		p2.setEdad(28);
		p2.setSexo('M');
		System.out.println(p2.toString() + "\n");

		System.out.println(p3);
		System.out.println("El indice de masa corporal es: " + p3.calcularIMC());
		System.out.println("Esta persona es mayor de edad? " + p3.esMayorDeEdad());

//		Persona p1 = new Persona();
//		System.out.println(p1);
//		Persona p2 = new Persona("Lorena", 28, 'M');
//		System.out.println(p2);
//		Persona p3 = new Persona("Elisa", 34, "08251412T", 'M', 66, 1.62, "Ecuador", "C");
//		System.out.println(p3);
//		
//		System.out.println(p3.calcularIMC());
//		
//		System.out.println(p1.esMayorDeEdad());
//		System.out.println(p3.esMayorDeEdad());
//		
//		Persona.comprobarSexo('m');

	}
}
