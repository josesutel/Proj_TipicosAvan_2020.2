package Clientes.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Clientes.Entidades.Clientes;
import Clientes.Repository.ClientesRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@SuppressWarnings("unused")
	@Autowired
	private ClientesRepository clientesRepositoty;

	private static final CrudRepository<Clientes, Long> clientesRepository = null;
	
	
	
  
@Override
	public List<Clientes> buscar() {
		ArrayList<Clientes> lista = new ArrayList<>();
		Iterable<Clientes> userIt = clientesRepository.findAll();
		 userIt.forEach(u -> lista.add(u));
		
		return lista;
}
	@Override
	public void alterar(Clientes clientes)throws Exception{
		if(clientes.getCpf()!= clientes.getCpf()) {
			throw new Exception("Digite um cpf valido");
		}
		
		
	}

	@Override
	public void salvar(Clientes clientes) throws Exception {
		if(clientes.getNome().equals(""));{
			throw new Exception("O campo nome deve ser preenchido");
		}
		
	}

	@Override
	public void deletar(Clientes clientes) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
