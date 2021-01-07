package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Alumno {

	private int numMatricula;
	private float notaProg;
	private float notaBBDD;
	private float notaSis;
	private boolean notaMedia;

	static Random r = new Random();
	static Random r1 = new Random();
	static Random r2 = new Random();
	private static float notaP;
	private static float notaB;
	private static float notaS;
	private static float nota;
	private static int aluu = 1;

	public Alumno() {

	}

	public Alumno(float notaProg, float notaBBDD, float notaSis) {
		this.notaProg = notaProg;
		this.notaBBDD = notaBBDD;
		this.notaSis = notaSis;
	}

//	public Alumno(int numMatricula, float notaProg, float notaBBDD, float notaSis) {
//		this.numMatricula = numMatricula;
//		this.notaProg = notaProg;
//		this.notaBBDD = notaBBDD;
//		this.notaSis = notaSis;
//	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public float getNotaProg() {
		return notaProg;
	}

	public void setNotaProg(float notaProg) {
		this.notaProg = notaProg;
	}

	public float getNotaBBDD() {
		return notaBBDD;
	}

	public void setNotaBBDD(float notaBBDD) {
		this.notaBBDD = notaBBDD;
	}

	public float getNotaSis() {
		return notaSis;
	}

	public void setNotaSis(float notaSis) {
		this.notaSis = notaSis;
	}

//Metodo de tipo ArrayList || Instancia un objeto de tipo ArrayList "al" || Con un for que, por cada iteración crea un objeto nuevo de la clase Alumno
	public static ArrayList<Alumno> creaAlumnos(int numAlumnos) {
		ArrayList<Alumno> al = new ArrayList<Alumno>();
		for (int i = 0; i < numAlumnos; i++) {
			notaP = (float) r.nextInt(10) + 1;
			notaB = (float) r1.nextInt(10) + 1;
			notaS = (float) r2.nextInt(10) + 1;
			Alumno alumno = new Alumno(notaP, notaB, notaS);
			System.out.println("Alumno " + alumno.notaMedia());
			al.add(alumno);
		}
		return al;
	}

	public float notaMedia() {
		float aux = notaB + notaP + notaS;
		nota = aux / 3;
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno" + " " + aluu++ + " notaProg=" + notaProg + " notaBBDD=" + notaBBDD + " notaSis=" + notaSis
				+ "\n";
	}

}
