package Ex03;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digte a op��o \n"
				+ "1 - Conta corrente \n"
				+ "2 - Conta poupan�a \n"
				+ "3 - Conta sal�rio \n");
		
		int op = sc.nextInt();
			
		if(op==1) {
			
			System.out.println("Digite a ag�ncia: ");
			String ag = sc.next();
			System.out.println("Digite o n�mero: ");
			String num=sc.next();
			System.out.println("Digite o saldo: ");
			double saldo = sc.nextDouble();
			System.out.println("Digite o cheque especial:");
			double ce=sc.nextDouble();
			
			
			
			ContaCorrente cc = new ContaCorrente(ag, num, saldo, ce);
			
		}
		
		else if(op==2) {
			
			System.out.println("Digite a ag�ncia: ");
			String ag = sc.next();
			System.out.println("Digite o n�mero: ");
			String num=sc.next();
			System.out.println("Digite o saldo: ");
			double saldo = sc.nextDouble();
			System.out.println("Digite o cheque especial:");
			double ce=sc.nextDouble();
			
			ContaPoupanca cp= new ContaPoupanca(ag, num, saldo, ce);
			
		
		}else if(op==3) {
			
			System.out.println("Digite a ag�ncia: ");
			String ag = sc.next();
			System.out.println("Digite o n�mero: ");
			String num=sc.next();
			System.out.println("Digite o saldo: ");
			double saldo = sc.nextDouble();
			System.out.println("Digite o cheque especial:");
			float sal=sc.nextFloat();
			
			ContaSalario cs = new ContaSalario(ag, num, saldo, sal);
			

		}
		
		

	}

}
