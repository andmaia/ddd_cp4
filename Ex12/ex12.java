package Ex12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		String[] lista = new String[] {};
		String produto;
		int qtd;
		double preco;
		
		String path = "C:\\Windows\\temp\\Ex13_Java.txt";
		
		try (BufferedWriter le = new BufferedWriter(new FileWriter(path, true))){

			
			for(int i = 0; i <= 2; i++) {
				System.out.println("Digite o nome do produto: ");
				produto = ler.next();
				
				System.out.println("Digite a quantidade: ");
				qtd = ler.nextInt();
				
				System.out.println("Digite o pre�o unit�rio: ");
				preco = ler.nextDouble();
				
				le.write("=========");
				le.newLine();
				le.write(produto+", ");
				le.newLine();
				
				le.write(qtd +", ");
				le.newLine();
				
				le.write(String.valueOf(preco));
				le.newLine();
				le.write("=========");
				le.newLine();
				}
		}catch(IOException e) {
			
		}
	            
	        
	    
	    	
	    } 
	}