package com.itdevsolution.SistemaNomina.TiposEmpleados;

import com.itdevsolution.SistemaNomina.Empleado.Empleado;

public class EmpleadoPorHoras extends Empleado{
	
	private double horas;
	private double sueldo;
	
	public EmpleadoPorHoras(String nombres, String apellidos, String cedula, double horas, double sueldo) {
		
		super(nombres, apellidos, cedula);
		this.horas = horas;
		this.sueldo = sueldo;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		if(horas<= 40) {
			return horas*sueldo;
		}else {
			return 40 * sueldo + (horas - 40) * sueldo * 1.5;
		}
	}

	@Override
	public String toString() {
		return String.format("Empleado Por Horas: %s\n\tIngresos: $%,.2f",super.toString(),ingresos());
	}
	
	
	
	

}
