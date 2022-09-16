package Ex10;

public class ContaPoupanca extends Conta implements ContaBancaria {
	private double rentabilidade;
	
	public ContaPoupanca() {
		
	}
	
	
	

	



	public ContaPoupanca(String agencia, String numero, double saldo, double rentabilidade) {
		super(agencia, numero, saldo);
		this.rentabilidade = rentabilidade;
	}








	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	public void Depositar(double valor) {
		super.Depositar(valor);
		
		valor=valor+0.5;
		
		this.setSaldo(valor);
	}




	@Override
	public void sacar(float valor) {
		// TODO Auto-generated method stub
		super.setSaldo(this.getSaldo()-valor);
	}
	
	
	
	
}
