package Ex10;

import java.util.Date;

public class Juridica extends Pessoa implements TipoPessoa {
	private String nomeFantasia;
	private String cnpj;
	private Date dateCriacao;
	
	public Juridica() {
		
	}

	public Juridica(String nomeFantasia, String cnpj, Date dateCriacao) {
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.dateCriacao = dateCriacao;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDateCriacao() {
		return dateCriacao;
	}

	public void setDateCriacao(Date dateCriacao) {
		this.dateCriacao = dateCriacao;
	}

	@Override
	public String saudacao(String nome) {
		// TODO Auto-generated method stub
		return "Olá, eu trabalho na "+this.nomeFantasia;
	}
	
	
	
	
}
