package com.itdevsolution.SistemaNomina.TiposEmpleados;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	
	private double salarioBase;

	public EmpleadoBaseMasComision(String nombres, String apellidos, String cedula, double tarifaComision,
		double ventasBrutas, double salarioBase) {
		
		super(nombres, apellidos, cedula, tarifaComision, ventasBrutas);
		// TODO Auto-generated constructor stub
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return super.ingresos() + salarioBase;
	}

	@Override
	public String toString() {
		return String.format("Empleado Base y %s ", super.toString());
	}
	
	
	
	

}
