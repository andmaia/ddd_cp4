package Ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
	public static void main(String[ ] args) {
		List <TecnologiaDesenvolvimento> listaTecnologias = new ArrayList<>();
		Scanner kb = new Scanner(System.in);
		int qtd;
		System.out.println("Quantas tecnologias você deseja criar: ");
		qtd=kb.nextInt();
		
		
		for(int i=1;i<=qtd;i++) {
			System.out.println("[1] - Backend \n"
					+ "[2] - Frontend \n");
			
			qtd=kb.nextInt();
			
			if(qtd==1) {
				try {
				Backend bk = new Backend();
				System.out.println("Digite o nome da linguagem :");
				
				String linguagem = kb.next();
				bk.setLinguagemProgramacao(linguagem);
				
				System.out.println("Digite o nome do principal framework: ");
				
				String framewrok = kb.next();
				bk.setPrincipalFramework(framewrok);
				
				
				kb.nextLine();
				System.out.println("Digite a descrição da tecmologia: ");
				bk.descricaoTecnologia(kb.nextLine());
				System.out.println("Digite a descrição do framework: ");
				kb.nextLine();
				bk.descricaoFrameWork(kb.nextLine());
				
				System.out.println("Digite a contenetização: ");
				char compatibilidade= kb.next().charAt(0);
				
				if(compatibilidade=='S') {
					bk.setContenezicao(true);
				}else {
					bk.setContenezicao(false);
				}
				
				listaTecnologias.add(bk);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
			else if(qtd==2) {
				try {
					Frontend bk = new Frontend();
					System.out.println("Digite o nome da linguagem :");
					
					String linguagem = kb.next();
					bk.setLinguagemProgramacao(linguagem);
					
					System.out.println("Digite o nome do principal framework: ");
					
					String framewrok = kb.next();
					bk.setPrincipalFramework(framewrok);
					
					
					kb.nextLine();
					System.out.println("Digite a descrição da tecmologia: ");
					bk.descricaoTecnologia(kb.nextLine());
					System.out.println("Digite a descrição do framework: ");
					kb.nextLine();
					bk.descricaoFrameWork(kb.nextLine());
					
					System.out.println("Digite a contenetização: ");
					String compatibilidade= kb.next();
					bk.setCompatibilidade(compatibilidade);

					
					listaTecnologias.add(bk);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
				
		}
		
		for(TecnologiaDesenvolvimento valor: listaTecnologias) {
			System.out.printf("%s\n",valor.toString());
		}
	}
}