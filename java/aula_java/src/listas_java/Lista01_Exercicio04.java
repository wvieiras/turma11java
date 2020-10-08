/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package listas_java;

import java.util.Scanner;

public class Lista01_Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número inteiro e positivo: ");
		num = leia.nextInt();
		
		if(num%2 == 0) {
			System.out.printf("A raiz de %d é: "+Math.sqrt(num), num);
		}else {
			System.out.printf("O quadrado de %d é: "+Math.pow(num,2), num);
		}
		
		leia.close();

	}

}
