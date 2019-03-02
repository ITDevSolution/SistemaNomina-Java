package com.itdevsolution.SistemaNomina.Empleado;

public abstract class Empleado {
	
	private String nombres;
	private String apellidos;
	private String cedula;
	
	public Empleado(String nombres, String apellidos, String cedula) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
	}
	
	public abstract double ingresos();
	
	public String getNombres() {
		return nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return 	String.format("%s, %s\n\tDNI  : %s", nombres,apellidos,cedula);
	}
	
	

}
