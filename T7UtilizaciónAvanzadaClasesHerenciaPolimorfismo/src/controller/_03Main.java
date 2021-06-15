package controller;

import model._03Disco;
import model._03ListaMultimedia;
import model._03Multimedia;
import model._03Pelicula;
import model.types.Formato;
import model.types.Genero;

public class _03Main {

	public static void main(String[] args) throws Exception {
//		_03Multimedia peli1 = new _03Multimedia();
//		System.out.println(peli1.toString());
		///////////////////////////////////////
//		_03Pelicula peli = new _03Pelicula("Titanic", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		try {
//			System.out.println(peli.toString());
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}

		/*
		 * PENSAR ACERCA DEL ATRIBUTO id de ListaMultimedia. Ya que no se pueden hacer 2
		 * listas diferentes sin que una afecte a la otra
		 */
		
//		_03ListaMultimedia list = new _03ListaMultimedia(10);
//		_03Pelicula peli1 = new _03Pelicula("Titanic", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli2 = new _03Pelicula("Caza", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli3 = new _03Pelicula("Rubi", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli4 = new _03Pelicula("Matrix", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli5 = new _03Pelicula("Constantin", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli6 = new _03Pelicula("Marvel", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli7 = new _03Pelicula("Spiderman", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli8 = new _03Pelicula("Superman", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli9 = new _03Pelicula("AntMan", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli10 = new _03Pelicula("Linterna", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//		_03Pelicula peli11 = new _03Pelicula("Forest", "James Cameron", Formato.WAV, 67, "DiCaprio", null);
//
//		System.out.println(list.add(peli1));
//		System.out.println(list.add(peli2));
//		System.out.println(list.add(peli3));
//		System.out.println(list.add(peli4));
//		System.out.println(list.add(peli5));
//		System.out.println(list.add(peli6));
//		System.out.println(list.add(peli7));
//		System.out.println(list.add(peli8));
//		System.out.println(list.add(peli9));
//		System.out.println(list.add(peli10));
//		System.out.println(list.add(peli11));
//
//		System.out.println(list.toString());
//
//		System.out.println(list.size());
//
//		System.out.println(list.get(0));
//		System.out.println(list.get(9));

//		System.out.println(list.get(11));//////Prueba de excepciones

		_03ListaMultimedia listDisco = new _03ListaMultimedia(10);
		_03Disco disco1 = new _03Disco("Black", "Don Omar", Formato.CD_AUDIO, 130, Genero.HIPHOP);
		_03Disco disco2 = new _03Disco("QueLoQue", "Don Omar", Formato.CD_AUDIO, 130, Genero.HIPHOP);
		_03Disco disco3 = new _03Disco("PaLoquera", "Don Omar", Formato.CD_AUDIO, 130, Genero.HIPHOP);

		System.out.println(listDisco.add((_03Multimedia) disco1));
		System.out.println(listDisco.add((_03Multimedia) disco2));
		System.out.println(listDisco.add((_03Multimedia) disco3));

		System.out.println(listDisco.toString());
	}
}
