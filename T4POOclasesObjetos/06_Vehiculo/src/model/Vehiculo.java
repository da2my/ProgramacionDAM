package model;

import java.io.ObjectInputStream.GetField;

public class Vehiculo {

	private int numRuedas;
	private float velMax;
	private float peso;

//	Constructores
	public Vehiculo() {

	}

	public Vehiculo(int ruedas, float velocidad, float peso) {
		this.numRuedas = ruedas;
		this.velMax = velocidad;
		this.peso = peso;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public float getVelMax() {
		return velMax;
	}

	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRuedas;
		result = prime * result + Float.floatToIntBits(peso);
		result = prime * result + Float.floatToIntBits(velMax);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (numRuedas != other.numRuedas)
			return false;
		if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
			return false;
		if (Float.floatToIntBits(velMax) != Float.floatToIntBits(other.velMax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + ", velMax=" + velMax + ", peso=" + peso + "]";
	}

	public static boolean esIgual(Vehiculo vehiculoX, Vehiculo vehiculoY) {
		boolean son = false;
		if (vehiculoY.equals(vehiculoX)) {
			son = true;
		}
		return son;
	}

	public void copia(Vehiculo vehiculo) {
		numRuedas = vehiculo.numRuedas;
		velMax = vehiculo.velMax;
		peso = vehiculo.peso;
	}

}
