package Arrylist;

import java.util.ArrayList;

public class tratamento3 {

	public static void main(String[] args) {
		ArrayList nomes = new ArrayList<>();
		try{
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");
		
		System.out.println("Nome: " + nomes.get(2));

	}
 catch (Exception erro) {
	 System.out.println("informe um valor adequado");
	 System.out.println("indique O INDICE corretamente");
 }
		
	}
}

