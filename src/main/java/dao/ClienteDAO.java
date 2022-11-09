package dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dto.Empleado;

//JpaRepository <Empleado, Long> hace referencia a la table empleado y su clave primaria
public interface ClienteDAO extends JpaRepository<Empleado, Long> {
	public List<Empleado> findByNombre(String nombre);
}
