package Ex04;

public class Pessoa {
	private int id;
	private String email;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String email, String endereco, String telefone) {
		
		this.id = id;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	protected String mostrarDados() {
		return "Email: "+this.email+"- Endereco: "+this.endereco;
		
	}
	
	public void atualizarDados(String email) {
		this.email=email;
	}
	
	public void atualizarDados(String email,String endereco) {
		this.email=email;
		this.endereco=endereco;
	}
	public void atualizarDados(String email,String endereco,String telefone) {
		this.email=email;
		this.endereco=endereco;
		this.telefone=telefone;
	}
}
