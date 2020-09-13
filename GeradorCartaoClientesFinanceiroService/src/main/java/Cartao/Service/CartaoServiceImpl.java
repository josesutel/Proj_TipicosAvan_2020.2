package Ets.Mod.Adm.GeradorCartaoService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import Ets.Mod.Adm.GeradorCartaoEntidades.Cartao;
import Ets.ModAdm.geradorCartaoRepository.CartaoRepository;

@Service
public class CartaoServiceImpl implements CartaoService {
@Autowired
private CartaoRepository cartaorepository;

private static final CrudRepository<Cartao, Long> cartaoRepository = null;


public List<Cartao> buscar(){
	ArrayList<Cartao> lista = new ArrayList();
	Iterable<Cartao> userIt = cartaorepository.findAll();
	userIt.forEach(u -> lista.add(u));
	return lista;
}

 
public void alterar(Cartao cartao) throws Exception{
	if(cartao.getNumCartao()!= cartao.getNumCartao()) {
		throw new Exception("NUmero do cartao incorreto");
	}
	 cartaorepository.save(cartao);
}
@Override
public void salvarCartao(Cartao cartao) throws Exception {
	if(cartao.getBandeira().equals("")) {
		 throw new Exception("o campo bandeira deve ser preenchido");	
		}
		cartaorepository.save(cartao);
	
}
@Override
public void deletarCartao(Cartao cartao) throws Exception {
	
	if(cartao.getCpf()!=cartao.getCpf()) {
		throw new Exception("Digite o numero de Cpf correto");
		
	}
	cartaorepository.delete(cartao);
}
@Override
public void alterarCartao(Cartao cartao) throws Exception {
	if(cartao.getNumCartao()!= cartao.getNumCartao()) {
		throw new Exception("NUmero do cartao incorreto");
	}
	 cartaorepository.save(cartao);
	
	
}



}
