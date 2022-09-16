package Ex11;

public class Frontend extends TecnologiaDesenvolvimento implements TecDesenvolvimento {

		private String compatibilidade;
		
		public Frontend() {
			
		}
		
		

		public Frontend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem,
				String descricaoFramework, String compatibilidade) {
			super(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework);
			this.compatibilidade = compatibilidade;
		}



		public String getCompatibilidade() {
			return compatibilidade;
		}

		public void setCompatibilidade(String compatibilidade) {
			this.compatibilidade = compatibilidade;
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



		@Override
		public String toString() {
			return "Frontend [compatibilidade=" + compatibilidade + ", linguagemProgramacao=" + linguagemProgramacao
					+ ", principalFramework=" + principalFramework + ", descricaoLinguagem=" + descricaoLinguagem
					+ ", descricaoFramework=" + descricaoFramework + "]";
		}
		
		


	
		
		
		
	

	

}
