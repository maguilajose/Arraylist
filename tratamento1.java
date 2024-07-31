package Arrylist;

import java.util.Scanner;

public abstract class tratamento1 {

	private static final String C = null;

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("Digite um número: ");
		b = leia.nextInt();
		try {
			c = a/ b;
			System.out.println("Valor de C: " + C);
		} catch (ArithmeticException erro) {
			System.out.println("não existe divisão por zero");
		}

	}

}
