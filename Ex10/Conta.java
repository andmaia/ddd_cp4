package Ex10;

public abstract class Conta  {
	private  String agencia ;
	private String numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	
	public Conta(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected String exibirMensagem() {
		return "Bem vindo ao internet Bamking do Prof. Joseffe!";
	}
	
	public void Depositar(double valor,String nomeDepositante) {
		this.saldo+=valor;
		
	}
	
	public void Depositar(double valor) {
		this.saldo+=valor;
		
	}
	public void Depositar(double valor,String nomeDepositante,String telefoneDepositante) {
		this.saldo+=valor;
		
	}
	
}
