package clientes.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clientes.entidades.Clientes;
import clientes.service.ClienteService;





@RestController(value = "API para manipulaçao de clientes")
public class ClientesApi {
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/clientes", method = RequestMethod.POST , produces = "application/json" )
	public ResponseEntity<String>SalvarCliente(@RequestBody Clientes clientes)throws Exception{
		ResponseEntity<String> ret = null;
		try {
			clienteService.salvar(clientes);
		    ret =  new ResponseEntity<>("cliente salvo com sucesso",HttpStatus.OK);
			
		}catch(Exception e) {
			ret = new ResponseEntity<>(e.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
	}
return ret;
}
	
	@RequestMapping(value = "/clientes", method =RequestMethod.GET , produces = "application/json" )
	public List<Clientes> getClientes(){
		return clienteService.buscar();
	}
	@RequestMapping(value = "/clientes", method =RequestMethod.DELETE , produces = "application/json" )
	public ResponseEntity<String>RemoverCliente(@RequestBody Clientes clientes)throws Exception{
		ResponseEntity<String> ret = null;
		try {
			clienteService.deletar(clientes);
			ret = new ResponseEntity<String>("cliente excluido com sucesso",HttpStatus.OK);
			
		}catch(Exception e) {
			 ret = new ResponseEntity<>("Ocorreu um erro",HttpStatus.METHOD_NOT_ALLOWED);
	}
return ret;
}
	@RequestMapping(value = "/clientes", method =RequestMethod.PUT , produces = "application/json" )
	public ResponseEntity<String>AlterarCliente(@RequestBody Clientes clientes)throws Exception{
		ResponseEntity<String> ret = null;
		try {
			clienteService.alterar(clientes);
			ret = new ResponseEntity<String>("cliente alterado com sucesso",HttpStatus.OK);
			
		}catch(Exception e) {
			 ret = new ResponseEntity<>("Ocorreu um erro",HttpStatus.METHOD_NOT_ALLOWED);
	}
return ret;
}
	
	
	
}
