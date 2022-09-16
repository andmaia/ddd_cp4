package Ex04;

import java.util.Date;

public class Juridica  {
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
	
	
	
	
}
