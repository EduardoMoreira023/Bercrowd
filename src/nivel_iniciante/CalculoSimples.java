package nivel_iniciante;

import java.util.Scanner;

public class CalculoSimples {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o código da primeira peça: ");
		int cod1 = entrada.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		int qnt1 = entrada.nextInt();
		System.out.println("Digite preço unitário da peça: ");
		double preco1 = entrada.nextDouble();
		
		System.out.println("Digite o código da segunda peça: ");
		int cod2 = entrada.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		int qnt2 = entrada.nextInt();
		System.out.println("Digite preço unitário da peça: ");
		double preco2 = entrada.nextDouble();
		
		double valorapagar1 = (qnt1 * preco1);
		double valorapagar2 = (qnt2 * preco2);
		
		double total = valorapagar1 + valorapagar2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		entrada.close();
		
	}

}
