package Ex10;

public class ContaCorrente extends Conta implements ContaBancaria {
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
	
	public void depositar(double valor) {
		super.Depositar(valor);
		
		valor=valor-0.10;
		this.setSaldo(valor);
	}













	@Override
	public void sacar(float valor) {
		super.setSaldo(this.getSaldo()-valor);
		
	}
	
	
	
}
