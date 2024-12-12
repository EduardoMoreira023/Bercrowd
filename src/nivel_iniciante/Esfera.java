package nivel_iniciante;

import java.util.Scanner;

public class Esfera {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Constante para o valor de pi
	        final double PI = 3.14159;

	        // Leitura do raio da esfera
	        double raio = scanner.nextDouble();

	        // Cálculo do volume da esfera: (4/3.0) * pi * R³
	        double volume = (4.0 / 3) * PI * Math.pow(raio, 3);

	        // Exibe o resultado com três casas decimais
	        System.out.printf("VOLUME = %.3f\n", volume);

	        scanner.close();
		
		
	}

}
