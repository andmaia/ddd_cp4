package Ex11;

public abstract class TecnologiaDesenvolvimento  {
	protected String linguagemProgramacao;
	protected String principalFramework;
	protected String descricaoLinguagem;
	protected String descricaoFramework;
	
	public TecnologiaDesenvolvimento() {
		
	}

	public TecnologiaDesenvolvimento(String linguagemProgramacao, String principalFramework, String descricaoLinguagem,
			String descricaoFramework) {
	
		this.linguagemProgramacao = linguagemProgramacao;
		this.principalFramework = principalFramework;
		this.descricaoLinguagem = descricaoLinguagem;
		this.descricaoFramework = descricaoFramework;
	}

	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}

	public String getPrincipalFramework() {
		return principalFramework;
	}
	public void setPrincipalFramework(String principalFramework) {
		this.principalFramework = principalFramework;
	}

	public String getDescricaoLinguagem() {
		return descricaoLinguagem;
	}

	public String getDescricaoFramework() {
		return descricaoFramework;
	}

	
	
	
	
}	
