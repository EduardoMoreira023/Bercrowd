package nivel_iniciante;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int NUMBER = scanner.nextInt();
		int NUMBER_HORA = scanner.nextInt();
		double SALARY_HORA = scanner.nextDouble();
		
		double SALARY = (NUMBER_HORA * SALARY_HORA);
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		
		scanner.close();
		
	}

}
