package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IEmpleadoDAO;
import main.dto.Empleado;

@Service
public class EmpleadoServiceImp implements IntEmpleadoService{
	//Esto nos permite utilizar los métodos de la interface IEmpleadoDAO. Como si la instanciaramos
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado buscarEmpleado(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
	}
	
	@Override
	public List<Empleado> listarEmpleadosPorTrabajo(String trabajo) {
		
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

	
	
	
}
