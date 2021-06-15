package model;

import model.types.Formato;

public class _03Multimedia {

	private String titulo;
	private String autor;
	private Formato formato;
	private int duracion;

	public _03Multimedia() {
		titulo = "";
		autor = "";
		duracion = 0;
		formato=Formato.DVD;
	}

	public _03Multimedia(String titulo, String autor, Formato formato, int duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + duracion;
		result = prime * result + ((formato == null) ? 0 : formato.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		_03Multimedia other = (_03Multimedia) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (duracion != other.duracion)
			return false;
		if (formato != other.formato)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "_03Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion="
				+ duracion + "]";
	}
}
