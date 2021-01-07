package model;

public class Persona {

	private final char GENERO = 'H';
	private final String ESTADO_CIVIL = "S";

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	private String nacionalidad;
	private String estadoCivil;

	public Persona() {
		nombre = "";
		edad = 0;
		sexo = GENERO;
		peso = 0.0;
		altura = 0.0;
		nacionalidad = "";
		estadoCivil = ESTADO_CIVIL;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		peso = 0.0;
		altura = 0.0;
		nacionalidad = "";
		estadoCivil = ESTADO_CIVIL;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;

	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, String nacionalidad,
			String estadoCivil) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.nacionalidad = nacionalidad;
		this.estadoCivil = estadoCivil;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

//	Metodos
	public double calcularIMC() {
		double valor = 0;
		valor = peso / (Math.pow(altura, 2));
		if (valor < 20) {
			return -1;
		} else if (valor >= 20 & valor <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}

	public static void comprobarSexo(char sexo) {
		String sex;
		sex = Character.toString(sexo);
		if (sex.equalsIgnoreCase("H")) {
			System.out.println("H");
		} else if (sex.equalsIgnoreCase("M")) {
			System.out.println("M");
		} else {
			System.out.println("H");
		}
		// return sexo=((sexo=='H'&sexo=='M') ? 'H':'M');
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", nacionalidad=" + nacionalidad + ", estadoCivil=" + estadoCivil + "]";
	}

}
