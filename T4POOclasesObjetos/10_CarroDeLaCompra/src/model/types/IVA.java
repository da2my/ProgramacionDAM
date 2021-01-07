package model.types;

public enum IVA {

	BASICO(0.1), ORDINARIO(0.17), LUJO(0.21);

	private double tax;

	private IVA(double value) {
		this.tax = value;
	}

	public double getTax() {
		return this.tax;
	}
}
