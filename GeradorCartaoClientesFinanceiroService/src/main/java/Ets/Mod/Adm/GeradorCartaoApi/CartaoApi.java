package Ets.Mod.Adm.GeradorCartaoApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Ets.Mod.Adm.GeradorCartaoEntidades.Cartao;
import Ets.Mod.Adm.GeradorCartaoService.CartaoService;
import Ets.Mod.Adm.GeradorCartaoService.CartaoServiceImpl;

@RestController(value = "API para criação de cartões")
public class CartaoApi {
	@Autowired
	private CartaoService cartaoService;
	
	@RequestMapping(value = "/cartao", method = RequestMethod.POST , produces = "application/json")
	public ResponseEntity<String>SalvarCartao(@RequestBody Cartao cartao)throws Exception{
		ResponseEntity<String> ret = null;
		try {
			cartaoService.salvarCartao(cartao);
			ret = new ResponseEntity<>("Cartao salvo com sucesso" , HttpStatus.OK);
		}catch(Exception e) {
			ret = new ResponseEntity<>(e.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
		}
		return ret;
	}
	@RequestMapping(value = "/cartao", method = RequestMethod.GET , produces = "application/json")
	public List<Cartao> getCartao(){
		return cartaoService.buscar();
	}
	@RequestMapping(value = "/cartao" ,method = RequestMethod.DELETE , produces= "application/json")
	public ResponseEntity<String>RemoverCartao(@RequestBody Cartao cartao)throws Exception{
		ResponseEntity<String> ret= null;
		try {
			cartaoService.deletarCartao(cartao);
			
		}catch(Exception e) {
			ret = new ResponseEntity<>("Ocorreu um erro" , HttpStatus.METHOD_NOT_ALLOWED);
		}
		return ret;
	}
	
	@RequestMapping(value = "/cartao", method = RequestMethod.PUT , produces = "application/json")
	public ResponseEntity<String>AlterarCartao(@RequestBody Cartao cartao)throws Exception{
		ResponseEntity<String> ret = null;
		try {
			cartaoService.alterarCartao(cartao);
			ret = new ResponseEntity<>("Cartao alterado com sucesso" , HttpStatus.OK);
		}catch(Exception e) {
			ret = new ResponseEntity<>(e.getMessage(),HttpStatus.METHOD_NOT_ALLOWED);
		}
		return ret;
	}
	

}
