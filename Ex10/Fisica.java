package Ex10;

import java.util.Date;

public  class Fisica extends Pessoa implements TipoPessoa {
	private String nome;
	private Date dtNAscimento;
	private String cpf;
	private String rg;
	
	public Fisica() {
		
	}

	public Fisica(String nome, Date dtNAscimento, String cpf, String rg) {
		
		this.nome = nome;
		this.dtNAscimento = dtNAscimento;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNAscimento() {
		return dtNAscimento;
	}

	public void setDtNAscimento(Date dtNAscimento) {
		this.dtNAscimento = dtNAscimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String saudacao(String nome) {
		
		return ("Olá, eu sou"+ this.nome);
	}
	
	
	
}
