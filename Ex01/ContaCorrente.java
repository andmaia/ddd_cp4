package Ex01;

public class ContaCorrente extends Conta {
	private double chequeEspecial;
	
	public ContaCorrente() {
		
	}
	
	

	


	public ContaCorrente(String agencia, String numero, double saldo,double chequeEspecial) {
		super(agencia, numero, saldo);
		// TODO Auto-generated constructor stub
		this.chequeEspecial=chequeEspecial;
	}






	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	

	
}
