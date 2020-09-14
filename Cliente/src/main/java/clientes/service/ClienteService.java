package clientes.service;



import java.util.List;

import clientes.entidades.Clientes;

public interface ClienteService {
	
	
	public   void salvar(Clientes clientes) throws Exception ;
		// TODO Auto-generated method stub
		
	
		
		
	
	
	public  List<Clientes> buscar(); 
		
		
	
    public  void deletar(Clientes clientes)throws Exception;
    	
    
    public  void alterar(Clientes clientes)throws Exception; 
    	
    


}
