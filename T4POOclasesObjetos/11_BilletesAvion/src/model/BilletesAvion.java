package model;

import model.types.Clase;

public class BilletesAvion {

	private String nombre;
	private String nif;
	private Clase tipo;
	private int maleta;
	private boolean wc;
	private boolean catering;
	private double coste;

	public BilletesAvion() {

	}

	public BilletesAvion(String nombre, String nif) {
		this.nombre = nombre;
		this.nif = nif;
	}

	public BilletesAvion(Clase tipo) {
		this.tipo = tipo;
	}

	public BilletesAvion(String nombre, String nif, Clase tipo) {
		this.nombre = nombre;
		this.nif = nif;
		this.tipo = tipo;
	}

	public BilletesAvion(String nombre, String nif, Clase tipo, int maleta, boolean wc, boolean catering,
			double coste) {
		this(nombre, nif, tipo);
		this.maleta = maleta;
		this.wc = wc;
		this.catering = catering;
		this.coste = coste;
	}

	//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Clase getTipo() {
		return tipo;
	}

	public void setTipo(Clase tipo) {
		this.tipo = tipo;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public int getMaleta() {
		return maleta;
	}

	public void setMaleta(int maleta) {
		this.maleta = maleta;
	}

	public boolean isWc() {
		return wc;
	}

	public void setWc(boolean wc) {
		this.wc = wc;
	}

	public boolean isCatering() {
		return catering;
	}

	public void setCatering(boolean catering) {
		this.catering = catering;
	}

	//

	@Override
	public String toString() {
		return "BilletesAvion [baño=" + wc + ", catering=" + catering + ", coste=" + coste + ", maleta=" + maleta
				+ ", nif=" + nif + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	//
	public static void reservaIni(BilletesAvion ob) {
		int asiento = 0;
		System.out.print("El asiento asignado segun la clase es el #");
		if (ob.getTipo().equals(Clase.VIP)) {
			do {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			} while (!(asiento <= 20));
			System.out.println(Integer.toString(asiento));
		} else if (ob.getTipo().equals(Clase.BUSINESS)) {
			while (!(asiento > 20 && asiento <= 50)) {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			}
			System.out.println(Integer.toString(asiento));
		} else if (ob.getTipo().equals(Clase.TURISTA)) {
			while (!(asiento > 50 && asiento <= 100)) {
				asiento = (int) (Math.random() * 100 * (Math.random() == 1 ? 1 : 1));
			}
			System.out.println(Integer.toString(asiento));
		}
	}

	public double costeComplemento(BilletesAvion comp) {
		double price = 0;
		double contWC = 10;
		double contCatering = 20;
		if (comp.tipo.equals(Clase.VIP) || comp.tipo.equals(Clase.BUSINESS)) {
			setWc(true);
			setCatering(true);
		} else if (comp.tipo.equals(Clase.TURISTA)) {
			if (wc && catering) {
				price = contWC + contCatering;
			} else if (catering) {
				price = contCatering;
			} else if (wc) {
				price = contWC;
			}
		}
		return price;
	}

	public double precio(double costeComplemento, double costeMaleta) {
		setCoste(costeComplemento + costeMaleta + getTipo().getValue());

		return getCoste();
	}

	public double costeMaleta(BilletesAvion bag) {
		double price = 0;
		double addBag = 50;
		int ite = 0;
		switch (tipo) {
			case VIP:

				break;
			case BUSINESS:
				if (maleta > 3) {
					for (int i = 3; i < maleta; i++) {
						ite++;
						price = ite * addBag;
					}
				}
				break;
			case TURISTA:
				if (maleta > 1) {
					for (int i = 1; i < maleta; i++) {
						ite++;
						price = ite * addBag;
					}
				}
				break;
			default:
				break;
		}
		return price;
	}

	public void reservaInicial(BilletesAvion ob) {
		if (ob.getNombre().equalsIgnoreCase(nombre) && ob.getNif().equalsIgnoreCase(nif)) {
			System.out.println("La reserva Inicial, por nombre y nif, esta hecha");
		}
	}

	public void reservaInicial1(BilletesAvion obj) {
		if (obj.getTipo().equals(Clase.VIP) || obj.getTipo().equals(Clase.BUSINESS)
				|| obj.getTipo().equals(Clase.TURISTA)) {
			System.out.println("La reserva Inicial, por Clase, esta hecha");
		}
	}
}
