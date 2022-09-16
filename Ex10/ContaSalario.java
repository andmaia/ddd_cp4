package Ex10;

public class ContaSalario extends Conta implements ContaBancaria{
	private float salario;
	
	public ContaSalario() {
		
	}
	
	
	
	

	


	public ContaSalario(String agencia, String numero, double saldo, float salario) {
		super(agencia, numero, saldo);
		this.salario = salario;
	}


	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public void sacar(float valor) {
		// TODO Auto-generated method stub
		super.setSaldo(this.getSaldo()-valor);
	}
	
	
	
	
}
