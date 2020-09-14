package clientes.repository;
import org.springframework.data.repository.CrudRepository;

import clientes.entidades.Clientes;

public interface ClientesRepository extends
CrudRepository<Clientes, Long>{
	

}
