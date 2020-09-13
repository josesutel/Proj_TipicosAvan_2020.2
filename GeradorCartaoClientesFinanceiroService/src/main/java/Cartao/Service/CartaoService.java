package Ets.Mod.Adm.GeradorCartaoService;

import java.util.List;

import Ets.Mod.Adm.GeradorCartaoEntidades.Cartao;

public interface CartaoService {
	
	
	public  void salvarCartao(Cartao cartao)throws Exception;
		
	
	public List<Cartao> buscar();
		
	
	public   void deletarCartao(Cartao cartao) throws Exception;
		
	
	public  void alterarCartao(Cartao cartao) throws Exception; 
		
	
}
