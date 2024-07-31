package Arrylist;

import java.util.Scanner;

public class tratamento4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double x;
		
		System.out.print("Digite uma nota: ");
		x=ler.nextDouble();
		
		if (x>=6)
			System.out.println("Voce está aprovado");
		else if (x<6 && x>=4)
			System.out.println("Exame");
		else
			System.out.println("Reprovado");
		ler.close();

	}

}
