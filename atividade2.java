package Arrylist;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	     
        Scanner
Scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite os números inteiros (digite 'j' para parar):");
        
        while (Scanner.hasNextInt()) {
            int numero = Scanner.nextInt();
            numeros.add(numero);
        }
        
        System.out.println("Os números pares são:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}