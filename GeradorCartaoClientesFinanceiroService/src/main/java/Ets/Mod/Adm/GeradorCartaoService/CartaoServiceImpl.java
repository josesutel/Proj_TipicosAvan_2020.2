package Ets.Mod.Adm.GeradorCartaoService;

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


}
