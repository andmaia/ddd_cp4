package Ex11;

public class Backend  extends TecnologiaDesenvolvimento implements TecDesenvolvimento{
	private boolean contenezicao;
	
	public Backend() {
		
	}
	
	
	
	public Backend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem,
			String descricaoFramework, boolean contenezicao) {
		super(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework);
		this.contenezicao = contenezicao;
	}



	@Override
	public void descricaoTecnologia(String descricao) {
		// TODO Auto-generated method stub
		super.descricaoLinguagem=descricao;
	}

	@Override
	public void descricaoFrameWork(String descricao) {
		// TODO Auto-generated method stub
		super.descricaoFramework=descricao;
	}

	public boolean isContenezicao() {
		return contenezicao;
	}

	public void setContenezicao(boolean contenezicao) {
		this.contenezicao = contenezicao;
	}



	@Override
	public String toString() {
		return "Backend [contenezicao=" + contenezicao + ", linguagemProgramacao=" + linguagemProgramacao
				+ ", principalFramework=" + principalFramework + ", descricaoLinguagem=" + descricaoLinguagem
				+ ", descricaoFramework=" + descricaoFramework + "]";
	}
	
	
	
	
	

}
