package model.types;

public enum Clase {

	TURISTA(200), BUSINESS(400), VIP(600);

	private double value;

	private Clase(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
