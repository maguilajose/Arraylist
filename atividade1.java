package Arrylist;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<>();
	        
	        System.out.println("Digite os números inteiros (digite 'j' para parar):");
	        
	        while (scanner.hasNextInt()) {
	            int numero = scanner.nextInt();
	            numeros.add(numero);
	        }
	        
	        int soma = 0;
	        for (int num : numeros) {
	            soma += num;
	        }
	        
	        System.out.println("A soma de todos os números é: " + soma);
	    }
	}