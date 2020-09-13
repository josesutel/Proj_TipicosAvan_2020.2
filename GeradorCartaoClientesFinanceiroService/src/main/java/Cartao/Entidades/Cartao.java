package Ets.Mod.Adm.GeradorCartaoEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name= "cartao")
public class Cartao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "cpf")
	private long cpf;
	@Column(name= "bandeira")
	private String bandeira;
	@Column (name = "numCartao")
	private long numCartao;
	@Column(name ="vencimento")
	private Data vencimento;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public long getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(long numCartao) {
		this.numCartao = numCartao;
	}
	public Data getVencimento() {
		return vencimento;
	}
	public void setVencimento(Data vencimento) {
		this.vencimento = vencimento;
	}
	
	
	
	

}
