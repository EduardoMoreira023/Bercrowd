package nivel_iniciante;

import java.util.Scanner;

public class SalarioComBonus {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.next();
		System.out.println("Informe seu salário fixo mensal: ");
		double salario = entrada.nextDouble();
		System.out.println("Informe o valor total de vendas: ");
		double totalvendas = entrada.nextDouble();
		
		double comissao = (totalvendas * 15) / 100;
		
		double totalrecebido = comissao + salario;
		
		System.out.printf("TOTAL = R$ %.2f\n", totalrecebido);
		
		entrada.close();
	}

}
