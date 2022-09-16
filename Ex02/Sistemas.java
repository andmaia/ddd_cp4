package Ex02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sistemas {
	
	public static void Main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner kb = new Scanner(System.in);
		int option;
		String cpf,nome,rg,email,endereco,cnpj,nomeFantasia;
		System.out.println("Digite uma op��o: \n"
				+ "[1] Pessoa f�sica\n"
				+ "[2] Pessoa Jur�dica\n");
		option = kb.nextInt();
		
		if(option==1) {
			int id;
			System.out.println("Digite o cpf: ");
			cpf=kb.next();
		
			System.out.println("Digite o nome: ");
			nome = kb.next();
			System.out.println("Digite o rg");
			rg = kb.next();
			System.out.println("Digite o e email: ");
			email = kb.next();
			System.out.println("Digite o endere�o: ");
			endereco =kb.next();
			System.out.println("Digite o contato");
			try{
				System.out.println("Digite a data de nascimento: ");
				Date date = sdf.parse(kb.next());
				
				Fisica f = new Fisica(nome, date, cpf, rg);
				}catch(Exception e) {
					e.printStackTrace();
				}
			
		
			
		}else if(option==2) {
			int id;
			System.out.println("Digite o cnpj: ");
			cnpj=kb.next();
			System.out.println("Digite o nome fantasia: ");
			nomeFantasia = kb.next();
			System.out.println("Digite o rg");
			rg = kb.next();
			System.out.println("Digite o e email: ");
			email = kb.next();
			System.out.println("Digite o endere�o: ");
			endereco =kb.next();
			System.out.println("Digite o contato");
			
			try{
				System.out.println("Digite a data de cria��o: ");
				Date date = sdf.parse(kb.next());
				Fisica fi = new Fisica(nomeFantasia, date, cnpj, rg);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		
	}
	
}
