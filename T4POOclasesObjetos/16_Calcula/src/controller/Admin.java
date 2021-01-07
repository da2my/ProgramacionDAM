package controller;

import model.Calcula;

public class Admin {

	public static void main(String[] args) {

		System.out.println(Calcula.mayor(2, 5, 18, 7, 9, 3));
		System.out.println(Calcula.mayor(4.6f, 2.8f, 5.6f, 1.9f, 3));
		System.out.println(Calcula.mayor("holatu", "como", "estas", "compa"));
		System.out.println(Calcula.menor(2, 5, 18, 7, 9, 3));
		System.out.println(Calcula.menor(4.6f, 2.8f, 5.6f, 1.9f, 3));
		System.out.println(Calcula.menor("holatu", "asi", "estas", "compa"));
	}

}
