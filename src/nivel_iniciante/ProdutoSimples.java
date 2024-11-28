package nivel_iniciante;

import java.util.Scanner;

public class ProdutoSimples {
	
	public static void main(String[] args) {
		
		// Cria um scanner para os dados de entrada
		Scanner scanner = new Scanner(System.in);
		
		// Recebe os valores interos de A e B
		System.out.println("Digite o valor de A: ");
		int A = scanner.nextInt();
		System.out.println("Digite o valor de B");
		int B = scanner.nextInt();
		
		// Calcula o produto (Produto = A x B)
		int PROD = A * B;
		
		// Exibe o resultado da operação
		System.out.println("PROD = " + PROD);
		
		scanner.close();
	}

}