/*
3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/

package listas_java;

import java.util.Scanner;

public class Lista02_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int var1 = 0, var2 = 0, idade = 0;
		
		while(idade!=-99) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			
			if(idade<21 && idade>0) {
				var1++;
			}else if(idade>50) {
				var2++;
			}
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é igual a: "+var1);
		System.out.println("O número de pessoas com mais de 50 anos é igual a: "+var2);
		
		leia.close();

	}

}
