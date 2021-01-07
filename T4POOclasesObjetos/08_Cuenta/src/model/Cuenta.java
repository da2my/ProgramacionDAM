package model;

public class Cuenta {
//	Atributos
	private String titular;
	private double cantidad;

//	Constructores
	public Cuenta(String titular) {
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(Cuenta c) {
		this.titular = c.titular;
		this.cantidad = c.cantidad;
	}


//	Getters & Setters
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

//	equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (Double.doubleToLongBits(cantidad) != Double.doubleToLongBits(other.cantidad))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

//	toString()
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
//	Metodos
	public String ingresar(double cantidad) {
		
		if (cantidad<=0) {
			return "Error.";
		}else {
			setCantidad(cantidad);
			return "Ingreso completado con exito.";
		}
	}
	
	public double retirar(double cantidad) {
		if (getCantidad()<=cantidad) {//aux<=0 -> opcion
			setCantidad(0);
		}else {
			
			setCantidad(getCantidad()-cantidad);
		
		}
		return getCantidad();
	}
	
	
}
