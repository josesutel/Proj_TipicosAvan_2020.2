package Ets.ModAdm.ClientesFinanceiroService;



import java.util.List;

import Ets.ModAdm.ClientesFinanceiroEntidades.Clientes;

public interface ClienteService {
	
	
	public   void salvar(Clientes clientes) throws Exception ;
		// TODO Auto-generated method stub
		
	
		
		
	
	
	public  List<Clientes> buscar(); 
		
		
	
    public  void deletar(Clientes clientes)throws Exception;
    	
    
    public  void alterar(Clientes clientes)throws Exception; 
    	
    


}
