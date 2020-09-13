package Clientes.Repository;
import org.springframework.data.repository.CrudRepository;

import Clientes.Entidades.Clientes;

public interface ClientesRepository extends
CrudRepository<Clientes, Long>{
	

}
