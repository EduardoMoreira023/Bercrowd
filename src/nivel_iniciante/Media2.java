package nivel_iniciante;

import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Recebendo as notas do usuário
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		double pesoA = 2.0;
		double pesoB = 3.0;
		double pesoC = 5.0;
		
		double MEDIA = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		entrada.close();
	}

}
