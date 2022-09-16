package Ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<Operarations> listaFormas = new ArrayList<>();
	
			System.out.println("Quantas formas deseja criar ?");
			int numFormas = input.nextInt();
			
			for(int i =0;i<numFormas;i++) {
				System.out.println("Qual forma deseja criar ?\n"
						+ "[1] - Quadrado\n"
						+ "[2] - Retângulo\n "
						+ "[3] - Círculo\n");
				int option = input.nextInt();
				
				if(option==1) {
					
					System.out.println("Digite o tamanho do lado");
				    int sides = input.nextInt();
					
					Square sq = new Square(null, sides);
					
					listaFormas.add(sq);
					
				}else if(option==2) {
					
					System.out.println("Digite a base:");
					float base = input.nextFloat();
					System.out.println("Digite o tamanho da altura ");
					float altura = input.nextFloat();
					
					Rectangle rq = new Rectangle(null, base, altura);
					
					listaFormas.add(rq);
					
				}else if(option==3) {
					System.out.print("Digite o tamanho do raion:");
					float raio = input.nextFloat();
					Circle cl = new Circle(raio);
					
					listaFormas.add(cl);
				}
				
				for(Operarations value:listaFormas) {
					System.out.println(value.toString() +"+"+value.getArea()+"+"+value.getPerimetro());
				}
				
			}
			
	}

}
