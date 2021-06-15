package model;

import model.types.Formato;
import model.types.Genero;

public class _03Disco extends _03Multimedia {

	private Genero genero;

	public _03Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return super.toString() + "_03Disco [genero=" + genero + "]";
	}

}
