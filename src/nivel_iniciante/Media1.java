package nivel_iniciante;

import java.util.Scanner;

public class Media1 {
	
	public static void main(String[] args) {
		
		// Cria um scanner para a leitura dos dados de entrada
		Scanner scanner = new Scanner(System.in);
		
		// Lê as notas A e B com ponto flutuante
		System.out.println("Digite o valor da primeira nota: ");
		double A = scanner.nextDouble();
		System.out.println("Digite o valor da segunda nota: ");
		double B = scanner.nextDouble();
		
		// define os pesos
		double pesoA = 3.5;
		double pesoB = 7.5;
		
		// Calcula  a média ponderada
		double MEDIA = (A * pesoA + B * pesoB) / (pesoA + pesoB);
		
		// Exibe o resultado no formato solicitado
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		scanner.close();
	}
	


}
