package aula_java;

import java.util.Scanner;

public class Lista01_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anoIdade, mesIdade, diasIdade, numDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		anoIdade = leia.nextInt();

		System.out.print("Digite os meses: ");
		mesIdade = leia.nextInt();
		
		System.out.print("Digite os dias: ");
		diasIdade = leia.nextInt();
		
		numDias = (anoIdade * 365) + (mesIdade * 30) + (diasIdade);
		
		System.out.print("O valor em dias é igual a : "+numDias);
		
		
		leia.close();

	}

}
