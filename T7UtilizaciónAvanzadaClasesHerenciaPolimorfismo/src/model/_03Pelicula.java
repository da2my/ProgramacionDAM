package model;

import model.types.Formato;

public class _03Pelicula extends _03Multimedia {

	private String actorPri;
	private String actrizPri;

	public _03Pelicula() {
		super();
	}

	public _03Pelicula(String titulo, String autor, Formato formato, int duracion, String actorPri, String actrizPri) {
		super(titulo, autor, formato, duracion);
		if (actorPri != null || actrizPri != null) {
			this.actorPri = actorPri;
			this.actrizPri = actrizPri;
		} else {
			throw new IllegalArgumentException("No pueden ser varios actores nulos, no habria historia!!");
		}
	}

	public String getActorPri() {
		return actorPri;
	}

	public String getActrizPri() {
		return actrizPri;
	}

	@Override
	public String toString() {
		return super.toString() + "_03Pelicula [actorPri=" + actorPri + ", actrizPri=" + actrizPri + "]";
	}

}
