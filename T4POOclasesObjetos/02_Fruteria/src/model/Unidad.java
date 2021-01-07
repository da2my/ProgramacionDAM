package model;

public class Unidad {

	private String nombre;
	private String origen;
	private double kg;
	private double precioCoste;
	private double precioVenta;
	private double importeVenta;

	private static double cuentaFruteria;
	private static double sum;

//	Constructores

	public Unidad() {

	}

	public Unidad(String nombre, String origen, double kg, double precioCoste, double precioVenta) {
		this.nombre = nombre;
		this.origen = origen;
		this.kg = kg;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}

//	Getters & Setters
	public String getNomFruta() {
		return nombre;
	}

	public void setNomFruta(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	// Metodos
	public void rebajar(double porcentaje) {
		double rebaja;
		double nuevoPrecio;
		rebaja = (this.precioVenta * porcentaje) / 100;
		nuevoPrecio = this.precioVenta - rebaja;
//		setPrecioVenta(this.precioVenta - rebaja);//seguimos con esta linea para definir que solo se rebaja el precio de venta
//		if (ventaRebajada < precioCoste) {
//			System.out.println("No se aplica rebaja ");
//			return this.precioVenta;
//			
//		}else if (ventaRebajada>precioCoste){
//			System.out.println("Se rebaja en ");
//			return ventaRebajada;
//		}else {
//			return this.precioVenta;
//		}
		setPrecioVenta(nuevoPrecio < precioCoste ? this.precioVenta : nuevoPrecio);
		System.out.println("Precio rebajado del cargamento: " + nuevoPrecio + "\n");
	}

	public double vender(double kgVende) {
		if (kgVende <= this.kg) {
			importeVenta = kgVende * precioVenta;// importe de venta
			setKg(this.kg - kgVende);// numero de kilos que quedan
			sum += importeVenta;
			System.out.println("Operación realizada con exito");
		} else {
			System.out.println("Venta no cerrada, error");
		}
		System.out.print("El importe de la venta es: ");

		return importeVenta;
	}

	public static double muestraBeneficio() {
		cuentaFruteria = sum;
		return cuentaFruteria;
	}

	public String mismoOrigen(Unidad cargaX, Unidad cargaY) {
//		System.out.println("El origen de estos dos cargamentos es: ");
		if (cargaX.getOrigen().equals(origen) && cargaY.getOrigen().equals(origen)) {
			System.out.println("El mismo origen " + "'" + origen + "'");

		} else {
			System.out.println("Diferente origen");
		}
		return "";
	}

	@Override
	public String toString() {
		return "Unidad [nombre=" + nombre + ", origen=" + origen + ", kg=" + kg + ", precioCoste=" + precioCoste
				+ ", precioVenta=" + precioVenta + "]";
	}

}
