package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Empleado;
import main.services.EmpleadoServiceImp;

@RestController
@RequestMapping("/api")
public class EmpleadoControllers {
	
	@Autowired
	EmpleadoServiceImp empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoService.listarEmpleados();
	}
	
	@GetMapping("/empleados/nombre/{trabajo}")
	public List<Empleado> listarEmpleadosPorNombre(@PathVariable(name="trabajo") String trabajo){
		return empleadoService.listarEmpleadosPorTrabajo(trabajo);
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	//El path variable sirve para nombrar el parámetro que viene por url
	public Empleado buscarEmpleado(@PathVariable(name="id") Long id) {
		Empleado empleado = new Empleado();
		empleado = empleadoService.buscarEmpleado(id);
		System.out.println("Empleado: " + empleado);
		return empleado;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id, @RequestBody Empleado empleado) {
		
		Empleado empleadoSeleccionado = empleadoService.buscarEmpleado(id);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setTrabajo(empleado.getTrabajo());
		empleadoSeleccionado.setSalario(empleado.getSalario());
		
		return empleadoService.actualizarEmpleado(empleadoSeleccionado);
	}
	
	@DeleteMapping ("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoService.eliminarEmpleado(id);
	}
}
