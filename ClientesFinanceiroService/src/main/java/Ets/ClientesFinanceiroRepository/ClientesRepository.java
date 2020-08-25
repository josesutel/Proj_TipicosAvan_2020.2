package Ets.ClientesFinanceiroRepository;
import org.springframework.data.repository.CrudRepository;


import Ets.ModAdm.ClientesFinanceiroEntidades.Clientes;

public interface ClientesRepository extends
CrudRepository<Clientes, Long>{
	

}
