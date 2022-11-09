package main.services;

import main.dto.Empleado;
import java.util.List;

//Estos son los métodos que se podrán realizar sobre la tabla empleados
public interface IntEmpleadoService {

	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado buscarEmpleado(Long id);
	
	public List<Empleado> listarEmpleadosPorNombre(String nombre);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);
	
}
