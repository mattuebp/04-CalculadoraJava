package desafioFinalFundamentos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// Ler num 1;
		// Ler num 2;
		// + - * / %
		
		System.out.println("Olá! Você inicializou a calculadora.\n");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro para fazer a operação: \n");
		String primeiroNumero = teclado.next().replace(",", ".");
		double valor1 = Double.parseDouble(primeiroNumero);
		
		System.out.println("Digite o segundo para fazer a operação: \n");
		String segundoNumero = teclado.next().replace(",", ".");
		double valor2 = Double.parseDouble(segundoNumero);
		
		System.out.println("Digite o simbolo da operação que deseja fazer (+, -, *, / ou %): \n");
		String operacao = teclado.next();
		
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
		resultado = resultado + ("-".equals(operacao) ? valor1 - valor2 : resultado);
		resultado = resultado + ("*".equals(operacao) ? valor1 * valor2 : resultado);
		resultado = resultado + ("/".equals(operacao) ? valor1 / valor2 : resultado);
		resultado = resultado + ("%".equals(operacao) ? valor1 % valor2 : resultado);
		
		System.out.printf("%.2f %s %.2f = %.2f",
				valor1, operacao, valor2, resultado);			
		teclado.close();		
	}

}
