package com.itdevsolution.SistemaNomina.Principal;

import com.itdevsolution.SistemaNomina.Empleado.Empleado;
import com.itdevsolution.SistemaNomina.TiposEmpleados.EmpleadoAsalariado;
import com.itdevsolution.SistemaNomina.TiposEmpleados.EmpleadoBaseMasComision;
import com.itdevsolution.SistemaNomina.TiposEmpleados.EmpleadoPorComision;
import com.itdevsolution.SistemaNomina.TiposEmpleados.EmpleadoPorHoras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoAsalariado emp1 = new EmpleadoAsalariado(32600, "Joel Alfredo", "Ronceros Cordova", "45638171");
		EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Paul", "Collazos", "48925874", 48, 12300);
		EmpleadoPorComision emp3 = new EmpleadoPorComision("Alex", "Ronceros Cordova", "784154654", 0.03, 160000000);
		EmpleadoBaseMasComision emp4 = new EmpleadoBaseMasComision("Gabriel", "Ronceros", "56456465", 0.02, 32000000, 380000);
		
		Empleado empleados[] = new Empleado[4];
		
		empleados[0] = emp1;
		empleados[1] = emp2;
		empleados[2] = emp3;
		empleados[3] = emp4;
		
		for(Empleado empleadoActual: empleados) {
			System.out.println(empleadoActual);
			//Si la regla de negocio indica que se le aumentara a los empleados base y comision de un 33% de su sueldo base
			if(empleadoActual instanceof EmpleadoBaseMasComision) {
				
				((EmpleadoBaseMasComision) empleadoActual)
				.setSalarioBase(((EmpleadoBaseMasComision) empleadoActual).getSalarioBase() * 1.33);//en este codigo estamos editando el sueldo base
				System.out.println("******** AUMENTO DE SUELDO*************");
				System.out.println(empleadoActual);
			}
		}
		
	}

}
