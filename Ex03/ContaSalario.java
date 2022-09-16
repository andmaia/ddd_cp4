package Ex03;

public class ContaSalario extends Conta{
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
	
	
	
}
