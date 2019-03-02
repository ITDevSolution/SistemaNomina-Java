package com.itdevsolution.SistemaNomina.TiposEmpleados;

import com.itdevsolution.SistemaNomina.Empleado.Empleado;

public class EmpleadoPorComision extends Empleado {
	
	private double tarifaComision;
	private double ventasBrutas;
	
	public EmpleadoPorComision(String nombres, String apellidos, String cedula, double tarifaComision, double ventasBrutas) {
		super(nombres, apellidos, cedula);
		// TODO Auto-generated constructor stub
		this.tarifaComision = tarifaComision;
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return tarifaComision * ventasBrutas;
	}

	@Override
	public String toString() {
		return String.format("Empleado Por Comision: %s "
				+ "\n\tTarifa Comision: $%,.2f "
				+ "\n\tVentas Brutas Mensual: $%,.2f "
				+ "\n\tIngresos: $%,.2f", super.toString(), getTarifaComision(),getVentasBrutas(), ingresos());
	}
	
	
	
	
	
	

}
