package model;

import java.util.Arrays;

public class _03ListaMultimedia {

	private _03Multimedia[] listMultimedia;
	private static int id;
	private int num;

	public _03ListaMultimedia(int num) {
		listMultimedia = new _03Multimedia[this.num = num];
	}

	public int size() {
		return id;
	}

	public boolean add(_03Multimedia m) {
		boolean cont;
		if (listMultimedia.length == id) {
			cont = false;
		} else {
			listMultimedia[id++] = m;
			cont = true;
		}
		return cont;
	}

	public _03Multimedia get(int position) throws IndexOutOfBoundsException {
		_03Multimedia objMult = null;
		if (position <= listMultimedia.length) {
			for (int i = 0; i < listMultimedia.length; i++) {
				if (i == position) {
					objMult = listMultimedia[i];
				}
			}
		} else {
			throw new IndexOutOfBoundsException("\nError Garrafal!!! Desbordamiento de Array");
		}
		return objMult;
	}

	@Override
	public String toString() {
		return "_03ListaMultimedia [listMultimedia=" + Arrays.toString(listMultimedia) + "]";
	}

}
