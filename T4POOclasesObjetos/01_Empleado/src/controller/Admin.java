package controller;

import model.Empleado;
import view.Consola;

public class Admin {
	

	public static void main(String[] args) {
		Consola con = new Consola();
		
		Empleado e1 = new Empleado("davo", 616171282);
		Empleado e2 = new Empleado("laila", 633452821);
		Empleado e3 = new Empleado(e1);
//		Empleado e4 = new Empleado();
//		Empleado e5 = new Empleado();
		
		con.escribeNum(Empleado.countNumEmpleados());
		
		con.escribeText(e2.toString());
		con.escribeText(e1.toString());
		
		con.escribeText(e3.toString());
		
//		con.escribeNum(e2.getTelefono());
		
		
	}

	
}
