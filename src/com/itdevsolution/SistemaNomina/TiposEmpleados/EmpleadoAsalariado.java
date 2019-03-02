package com.itdevsolution.SistemaNomina.TiposEmpleados;

import com.itdevsolution.SistemaNomina.Empleado.Empleado;

public class EmpleadoAsalariado extends Empleado{
	
	private double salarioSemanal;
	
	public EmpleadoAsalariado(double salarioSemanal, String nombres, String apellidos, String cedula) {
		super(nombres,apellidos,cedula);
		this.salarioSemanal = salarioSemanal;
	}
	
	
	public double ingresos() {
		return salarioSemanal;
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}


	@Override
	public String toString() {
		return  String.format("Empleado Asalariado : %s\n\tIngresos: $%,.2f" , super.toString(), ingresos());
	}
	
	

}
