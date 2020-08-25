package Ets.ModAdm.geradorCartaoRepository;

import org.springframework.data.repository.CrudRepository;

import Ets.Mod.Adm.GeradorCartaoEntidades.Cartao;

public interface CartaoRepository extends
  CrudRepository<Cartao, Long>{

}
