package main.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import main.dto.Empleado;

//JpaRepository <Empleado, Long> hace referencia a la table empleado y su clave primaria
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	public List<Empleado> findByTrabajo(String trabajo);
}
